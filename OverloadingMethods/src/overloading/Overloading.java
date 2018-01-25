
package overloading;

import java.util.Scanner;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan	=	new Scanner(System.in); 
		int i = scan.nextInt();  
		int j =	scan.nextInt();  
		int k = scan.nextInt(); 
		
		double a = scan.nextDouble(); 
		double b = scan.nextDouble();
		
		add(i,j,k); 
		add(a,b); 
		add("Hello","Overloading");
		
		scan.close();
	} 
	
	public static int add(int a,int b,int c){
		
		System.out.println("This is the first function in overlaoding");
		return(a+b+c);
	} 
	
	public static double add(double a,double b){
		
		System.out.println("This is function overlaoding in float "); 
		return(a+b);
		
	} 
	
	public static String add(String a,String b){
		
		System.out.println("This is ddition of string");
		return(a+b);
		
	}

}
