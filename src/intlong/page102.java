package intlong;

public class page102 {

	public static void main(String[] args) {
		int ranking =1;
		char medalcolor;
		
		switch(ranking) {
		case 1 : medalcolor = 'G';
			break ;
		case 2 : medalcolor = 'S';
			break ;
		case 3 : medalcolor = 'B';
			break ;
		default : 
				medalcolor = 'A';
				
		}
		System.out.println(ranking + "등메달색깔은"+ medalcolor+"입니다");
		
	}

}
