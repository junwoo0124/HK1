package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(1001,"���翵");
		Lee.addSubject("����", 100);
		Lee.addSubject("����",50);
		
		Student park = new Student(1002,"���ؿ�");
		park.addSubject("����", 70);
		park.addSubject("����", 85);
		park.addSubject("����", 100);
		
		Lee.showinfo();
		System.out.println();
		park.showinfo();

	}

}
