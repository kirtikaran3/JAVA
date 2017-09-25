package Do_while;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner 		scan		=		new Scanner(System.in); 
				int		value	=	scan.nextInt(); 
				int 	count	=	0; 
				
				
							while(count<value){
								
								count++;
								System.out.println("The value are "	+		count	 );
								
							} 
							
							count=0;
							
							do{
								
								count++; 
								System.out.println("Do while count"     +     count);
								
							}while(count<value);
				
				
				
				scan.close();
	}

}
