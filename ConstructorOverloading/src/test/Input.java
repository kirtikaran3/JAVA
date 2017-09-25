package test;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the main function"); 
		
		Scanner scan = new Scanner(System.in); 
		
		int i = scan.nextInt();  
		int j = scan.nextInt(); 
		int k = scan.nextInt(); 
		
		Value var1 = new Value(); 
		var1.cal(); 
		var1.show(); 
		
		Value var2 = new Value(i,j,k);
		var2.cal(); 
		var2.show();
		
		
		scan.close();
	}

}
