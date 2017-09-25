package for_test;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner 	scan	=	new 		Scanner(System.in); 
		int		n	=		scan.nextInt();  
		int 	i;
		
		
		int 	[]		Arrays	=		{1,2,3,4,5};
		
		for (	i=0;	i<n;	i++)	{
			
					System.out.println("This is for test"	+ 	i);
			
			
		} 
		
		System.out.println("--------------------------------");
		
		for	(int 	k	:	Arrays){ 
			
			System.out.println("This is another for test" +   k);
		} 
		scan.close();
	}

}
