package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] BA = new Book[3];
		Book[] BA2 = new Book[3];
		
		BA[0] = new Book("태백산맥","메로나");
		BA[1] = new Book("백두산맥","누가바");
		BA[2] = new Book("백두산","쌍쌍바");
		
		System.arraycopy(BA, 0, BA2, 0, 3);
		for(int i= 0; i<BA2.length; i++) {
			BA[i].showinfo();
		}
		
		System.out.println("=====BA======");
		BA[0].setBookName("호두까기인형");
		BA[0].setAuther("홍길동");
		
		System.out.println("=====BA2======");
		for(int i =0; i < BA2.length;i++) {
			BA2[i].showinfo();
		}

	}

}
