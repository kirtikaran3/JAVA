package classPositive;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the main class"); 
		
		Scanner scan = new Scanner(System.in); 
		int num =  scan.nextInt();  
		
		Check value = new Check(); 
		
		value.number = num; 
		
		System.out.println("result is " + value.checkNumber());
		
		scan.close();
		
	}

}
