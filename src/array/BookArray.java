package array;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("�׸���ƹ���������","�谡��");
		library[1] = new Book("27��1���� �����ױ�� ����ߴ�","�����");
		library[2] = new Book("���ð��","�����");
		library[3] = new Book("�ο�","�ƽ�");
		
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i = 0; i < library.length; i++) {
			library[i].showinfo();
		}
	}
	
		
		
}
