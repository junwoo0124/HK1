package array;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
	ArrayList<Book> library = new ArrayList<Book>();
	
	library.add(new Book("태백산맥","조정래"));
	library.add(new Book("대미안","헤르만 헤세"));
	library.add(new Book("어떻게 살것인가","유시민"));
	library.add(new Book("토지","박경림"));
	library.add(new Book("어린왕자","생택쥐베리"));
	
	for(int i=0;i<library.size(); i++) {
		Book book = library.get(i);
		book.showinfo();
	}
	
	System.out.println();	
	System.out.println("====향상 for 문 ====");
	for(Book bk : library) {
		bk.showinfo();
	}

	}

}
