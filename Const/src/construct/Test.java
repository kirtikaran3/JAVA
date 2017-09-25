package construct;

import java.util.Scanner;

public class Test { 
	
		Scanner 	scan 	=	new Scanner(System.in); 
		
		int 	i		=		scan.nextInt(); 
		int		j		=		scan.nextInt();  
		int 	k		=		scan.nextInt(); 
		int 	res;
		
		public 	int		cal(){
			
			System.out.println("This is the method of the class"); 
			
			res	=		i+j+k; 
			
			return(res);
			
		} 
		
		/*Test(){
			
			i	=	10; 
			j	=	20; 
			k	=	30; 
			
			
		}*/

}
