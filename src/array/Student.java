package array;

public class Student {
	
	int studentID = 1000;
	String name;
	
	public Student(String name) {
		
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showinfo() {
		System.out.println("학번---"+studentID+"----이름"+name);
	}
	

}
