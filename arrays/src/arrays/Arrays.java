package arrays;

import java.util.Scanner;

public class Arrays {

	public 	static	 void 	main	(	String[]	 args	) {
		// TODO Auto-generated method stub
		
		int[]		MyArray	=	new 		int [3];	; 
		//int[]		Arrays		=		new 		int[3]; 
		
		Scanner 	scan		=		new 	Scanner(System.in); 
		int 		arrays		=		scan.nextInt();
		
		//int [ListArrays] 	arrays;
		
		int 	i=0;
					
		while	(	i<3	){
			
			System.out.println("The values are" 	+	MyArray[i] ); 
			i++;
		
		}
		
		
		
		scan.close();
	}

}
