package chapter1;

public class Person {
		
	String name;
	float height;
	float weight;
	
	public Person() {
		System.out.println("----------starte----------");
	}
	
	public void getPerson() {
		System.out.println("----------getinfo----------");
		
		System.out.println(name);
		System.out.println(height);
		System.out.println(weight);
		
	}
	
	public void setPerson(String n,float h, float w) {
		System.out.println("----------setinfo----------");
		
		name = n;
		height = h;
		weight = w;
	}
	
	
	

}
