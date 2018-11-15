package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
			Student Park = new Student("Park준우", 5000);
			Student LEE = new Student("이재영", 10000);
			Student junwoo = new Student("junwoo", 30000);
			
			
			Park.showinfo();						
			LEE.showinfo();
			junwoo.showinfo();
			
			
			Bus b1 = new Bus();
			b1.getBusNumber();
			b1.setBusNumber(803);
			b1.showinfo();
			b1.take(1500);
			b1.showinfo();
		
			
			
			
			
		
			
	}

}
