package Chapter5;

public class Childclass {
	
	String name;
	boolean gender;
	int age;
	
	
	public Childclass() {
		System.out.println("----Childclass-----") ;
	}
	
	
	public void getChildclass() {
		System.out.println("----getinfo-----");
		
		System.out.println("name------="+name);
		System.out.println("gender----="+gender);
		System.out.println("age-------="+age);		
	}
	
	public void setChildclass(String n,boolean m,int a) {
		System.out.println("----setinfo----");
		
		name = n;
		gender = m;
		age = a;
	}

}
