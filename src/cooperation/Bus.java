package cooperation;

public class Bus {
	int busNumber;
	int passenger ;
	int money;
	
	
	public int getBusNumber() {	
		System.out.println("------------getBusnumber---------");
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
		System.out.println("----------버스 번호 지정----------");
	}

	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showinfo() {
		System.out.println("버스"+busNumber+"번의승객은"+passenger+"명이고"+money+"입니다");
	}

}
