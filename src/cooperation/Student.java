package cooperation;

public class Student {
	public int money;
	public int grade;
	public String studentname;
	
	
	
	public Student(String studentname,int money) {
		this.studentname = studentname;
		this.money = money;
		
	}
	
	public void takeBus(Bus bus) {		
		bus.take(1000);
		this.money -= 1000;	
	}
	
	public void showinfo() {
		System.out.println(studentname+"남은돈은"+money+"입니다");
	} 
	
	
	
}
