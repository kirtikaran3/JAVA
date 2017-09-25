package patterns;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner 	scan	=		new	Scanner(System.in); 
		int		n	=		scan.nextInt();  
		int i,j,l;
		
		for	 (		i=0;	i<n;	i++){
		
			for	(	 l=n-i	;l>0	;	l--){
				System.out.print(" ");
			}
				for (		j=0;	j<i;		j++)	{
				
					System.out.print("* ");	
				
				} 
				System.out.println();
		}
		
		scan.close();	
	}

}
