package busstop;

public class Bus {
	
	static int money; // 버스의 수입액
	int BusNumber; // 버스 번호
	static int passenger; // 승객
	
	
	public int getBusNumber() {
		return BusNumber;
	}
	public void setBusNumber(int busNumber) {
		BusNumber = busNumber;
	}
	
	public void take(int suip) {
		money += suip;
		passenger++;
	}
	public void getinfo() {
		System.out.println("------get info -------");
		
		System.out.println("busnumber-------->"+BusNumber);
		System.out.println("Money------>"+money);
		System.out.println(BusNumber+"버스는"+money+"의 수입 설정"+passenger+"명");
	}
	
	
	

}
