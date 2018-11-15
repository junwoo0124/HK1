package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(1001,"이재영");
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학",50);
		
		Student park = new Student(1002,"박준우");
		park.addSubject("국어", 70);
		park.addSubject("수학", 85);
		park.addSubject("영어", 100);
		
		Lee.showinfo();
		System.out.println();
		park.showinfo();

	}

}
