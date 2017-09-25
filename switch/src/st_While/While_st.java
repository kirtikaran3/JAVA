package st_While;

import java.util.Scanner;

public class While_st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner 	scan	=		new Scanner (System.in); 
		int 	count	=		0; 
		int 	value		=		scan.nextInt(); 
		
		
		while(value<100){
			
			count++;
			System.out.println("count is 	"	+		count); 
			value++;
			
		}
		scan.close();
	}

}
