package if_else;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner	scan	= 	new	Scanner (System.in); 
			
			int 	i	=		scan.nextInt(); 
			//int 	d	=		scan.nextInt(); 
			
			float		f		=		scan.nextFloat();  
			float 	res	; 
			
				res	=	f	+	i;
						
				if(res==10){
							
							System.out.println("This is the if else example in JAVA"	+	res);
							
								}
			
				else	if(res	<	10){
									
									System.out.println("The value is less than 10" + res);
									
									
								} 
				
				else if(res>10){
					
					System.out.println("The value is greater than  10	:	"  +	 res);
					
				} 
				
				else  {
					
					System.out.println("This is the else loop because nothing match the result ");
					
				}
			
			
			scan.close();
	}

}
