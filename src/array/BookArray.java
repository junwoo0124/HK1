package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("그리고아무도없었다","김가을");
		library[1] = new Book("27살1년후 나는죽기로 결심했다","김수덕");
		library[2] = new Book("가시고기","고요한");
		library[3] = new Book("인연","훈스");
		
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showinfo();
		}
	}
	
		
		
}
