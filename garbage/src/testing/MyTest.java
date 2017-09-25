package testing;

import java.util.Scanner;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print("This is the garbage file and is just the test of Java"); 
	
		Scanner 	scan = 	new Scanner (System.in);
		
				int 	i	 =	 scan.nextInt(); 
			
				int 	f	= scan.nextInt(); 
				
				int  	res;
				
								System.out.print("Lets put on test"); 
								
										res	=		f	-	i;	
										System.out.println("This is the result for subs" + res); 
										
										res	=	f	+		i;  
										System.out.println("This is the result after add" + res);
										
										res	=	f	*	i; 
										System.out.println("This is the result for mul" +  res); 
										
										res	=	f	/	i; 
										System.out.println("This is the result for div" + res);
		
		
		scan.close();
	}

}
