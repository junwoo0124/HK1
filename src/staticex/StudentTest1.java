package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student p1 = new Student("���ؿ�");
		System.out.println(p1.serialNum);
		p1.serialNum++;
		
		Student p2 = new Student("�̿���");
		System.out.println(p2.StringName+p2.serialNum);
		p2.serialNum++;
		System.out.println(p1.serialNum);
		
	}

}
