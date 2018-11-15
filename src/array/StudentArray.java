package array;

public class StudentArray {
	
public static void main(String[] args) {
	

	Student[] s1 = new Student[3];
	
	s1[0] = new Student("박준우");
	s1[1] = new Student("이재영");
	s1[2] = new Student("최재영");
	
	for(int i=0; i<s1.length; i++) {
		s1[i].showinfo();
	}
}
}
