package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] BA = new Book[3];
		Book[] BA2 = new Book[3];
		
		BA[0] = new Book("�¹���","�޷γ�");
		BA[1] = new Book("��λ��","������");
		BA[2] = new Book("��λ�","�ֹֽ�");
		
		System.arraycopy(BA, 0, BA2, 0, 3);
		for(int i= 0; i<BA2.length; i++) {
			BA[i].showinfo();
		}
		
		System.out.println("=====BA======");
		BA[0].setBookName("ȣ�α������");
		BA[0].setAuther("ȫ�浿");
		
		System.out.println("=====BA2======");
		for(int i =0; i < BA2.length;i++) {
			BA2[i].showinfo();
		}

	}

}
