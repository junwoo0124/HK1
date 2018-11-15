package inheritance;

public class Customer {
	private int customerID;		//고객아이디	
	private String customerName;	// 고객이름
	private String customerGrade;   // 고객등급
	int bonusPoint;
	double bonusRatio;	
	
	public Customer() {
		customerGrade = "SILVER"; // 기본등급	
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String getCustomerinfo() {
		return customerName + "님의등급은" + customerGrade + "이며, 보너스포인트는"+bonusPoint+"입니다";
	}	
}