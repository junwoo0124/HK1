package array;

public class StudentArray {
	
public static void main(String[] args) {
	

	Student[] s1 = new Student[3];
	
	s1[0] = new Student("���ؿ�");
	s1[1] = new Student("���翵");
	s1[2] = new Student("���翵");
	
	for(int i=0; i<s1.length; i++) {
		s1[i].showinfo();
	}
}
}
