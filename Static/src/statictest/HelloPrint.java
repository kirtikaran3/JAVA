package statictest;

import java.util.Scanner;

public class HelloPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in); 
		
		int i = scan.nextInt(); 
		int j = scan.nextInt();  
		int k = scan.nextInt(); 
		
		Hellostatic first = new Hellostatic(); 
		
		Hellostatic.HelloFunction("This is string test"); 
		
		Hellostatic.subs(i, j); 
		
		first.subs(i,j,k); 
		first.helloInst("This is non static use");		
		first.add(i, j);
		
		
		
		
		scan.close();
		
	}

}
