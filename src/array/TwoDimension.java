package array;

public class TwoDimension {

	public static void main(String[] args) {
		
		char[][] ch1 = {{'a','b','c','d','e','f'},{'g','h','i','j','k','l'}};
		
		
		for(int i=0;i<ch1.length;i++) {
			for(int j=0;j<ch1[i].length;j++) {
				if(j%2 == 0) {
					System.out.println();
				}
				System.out.print(ch1[i][j]);
			}
		}

	}

}
