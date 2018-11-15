package intlong;

public class page123l2 {

	public static void main(String[] args) {
		int linecount = 7;
		int starcount = 1;
		int spacecount = linecount/2 +1 ;
		
		
		
		for(int i=0; i < linecount; i ++) {
			for(int j=0; j < spacecount ; j++){
				System.out.print(" ");
			}
			for(int j=0; j < starcount; j++) {
				System.out.print("*");
			}
			for(int j =0; j < spacecount; j++) {
				System.out.print(" ");
			}
			
			if(i < 3) {
				spacecount -= 1;
				starcount += 2;
			}
			else {
			spacecount += 1;
			starcount -= 2;
			}		
			System.out.println();			
		}
		
		
		
		
			
		
	}
	
}