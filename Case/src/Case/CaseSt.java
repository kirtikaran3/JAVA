package Case;

import java.util.Scanner;

public class CaseSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the example of case st"); 
		
		Scanner 	scan	=		new Scanner(System.in); 
		
		
				int 	i	=		scan.nextInt();
				int 	j	=		scan.nextInt();   
				char 	c = scan.next(".").charAt(0);
				
				int 	res	;  
						
				res		=		i+j	; 
				
				switch(res ){
				
				case 		10: case 'K' : 
					
						System.out.println("The result is 10 "		+		res);
						break; 
						
				case	 9:
						System.out.println("The result is less than 10 	:	" +	res); 
						break;
				
				
				case 	 12: 
								System.out.println("The value is greater than 10 :	"	+		res);
								break;
				
				default 	: 
					
							System.out.println("The value is neither of them so there is an error");
				}
		scan.close();                                   
	}

}
