package busstop;

public class Train {
	
	private int ticket;
	String trainNumber;
	 int passenger;

	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	
	public void taket(int ttmony) {
		ticket +=ttmony;
		passenger++;
	}
	
	public void getinfo() {
		System.out.println("----------getinfo----------");
		
		System.out.println("ticket------>"+ticket );
		System.out.println("trainNumber ------>"+trainNumber);
		System.out.println(trainNumber+"��ö�� ź�����"+passenger+"�̰�Ƽ�ϰ�����"+ticket+"���Դϴ�");
	
	}


}
