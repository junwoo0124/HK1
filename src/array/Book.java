package array;

public class Book {
	private String bookName;
	private String auther;
	
	public Book(String bookName, String auther) {
		this.bookName = bookName;
		this.auther = auther;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	public void showinfo() {
		System.out.println("------> 책이름"+bookName);
		System.out.println("------> 저자"+auther);
	}
	
}
