package busstop;

public class Bus {
	
	static int money; // ������ ���Ծ�
	int BusNumber; // ���� ��ȣ
	static int passenger; // �°�
	
	
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
		System.out.println(BusNumber+"������"+money+"�� ���� ����"+passenger+"��");
	}
	
	
	

}
