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
		System.out.println("----------���� ��ȣ ����----------");
	}

	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void showinfo() {
		System.out.println("����"+busNumber+"���ǽ°���"+passenger+"���̰�"+money+"�Դϴ�");
	}

}
