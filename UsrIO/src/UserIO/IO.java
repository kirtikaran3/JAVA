package UserIO;

import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
		int 	i =	scan.nextInt(); 
		int 	j =	scan.nextInt();  
		int		k;  
		
		System.out.print("This is the example of add:		"); 
		k=i+j; 
		System.out.println(k); 
		
					System.out.print("This is the example of  subs:	"); 
					k=i-j; 
					System.out.println(k); 
					
								System.out.print("This is the example of mul: 		"); 
								k=i*j; 
								System.out.println(k); 
								
											System.out.print("This is the example of div:		"); 
											k=i/j; 
											System.out.print(k);
			scan.close();
	}

}
