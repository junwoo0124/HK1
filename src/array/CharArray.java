package array;

public class CharArray {

	public static void main(String[] args) {
		char[] ch1 = new char[26];
		char ch = 'A';
		
		for(int i=0; i<ch1.length; i++,ch++) {
				 ch1[i] = ch;
		
		}
		for(int j = 0; j<ch1.length; j++) {
			System.out.println(ch1[j]+","+(int)ch1[j]);
		}
		
	}

}
