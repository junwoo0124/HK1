package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student p1 = new Student("박준우");
		System.out.println(p1.serialNum);
		p1.serialNum++;
		
		Student p2 = new Student("이에그");
		System.out.println(p2.StringName+p2.serialNum);
		p2.serialNum++;
		System.out.println(p1.serialNum);
		
	}

}
