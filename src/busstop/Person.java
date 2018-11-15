package busstop;

public class Person {
	
	String name;
	int charge;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	public void takebus(Bus bus) {
		if(bus.BusNumber > 700) {
			bus.take(1800);
			this.charge -= 1800;
		}
		else {
			bus.take(1300);
			this.charge -= 1300;
		}
	}
	
	public void taketrain(Train tnum) {
		tnum.taket(900);
		this.charge -= 900;
	}
	
	
	
	public void getinfo() {
		System.out.println("------get info -------");		
		System.out.println("name-------->"+name);
		System.out.println("charge------>"+charge);
		System.out.println(name+"는"+charge+"이 있다고 설정");
	}
		
	public static void main(String[] args) {
		
		Person junwoo = new Person();
		Person lee = new Person();
		lee.setName("이재영");
		lee.setCharge(10000);
		
		junwoo.setName("박준우");
		junwoo.setCharge(5000);
	
		Bus bus103 = new Bus();
		Bus bus800 = new Bus();
		bus800.setBusNumber(800);
		bus103.setBusNumber(103);
		
		lee.takebus(bus103);
		bus103.getinfo();
		junwoo.takebus(bus800);
		bus800.getinfo();
		
		Train t2 = new Train();
		t2.setTrainNumber("2호선");
		junwoo.taketrain(t2);
		lee.taketrain(t2);
		t2.getinfo();
		lee.getinfo();
		
		
	}
	
	
	

}
