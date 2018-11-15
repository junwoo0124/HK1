package single;

public class Compony {
	
	private static Compony instance = new Compony();
	private Compony() {	}	
	static int carnumber = 10000 ;
	
	public static Compony creatCar() {
		if(instance == null) {
			instance = new Compony();
		}
		carnumber++;
		return instance;		
	}
	
}
