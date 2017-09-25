package Methos_New;

import java.util.Scanner;

public class testMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner 	scan	=	new 	Scanner (System.in); 
		
		 int 	a	=	scan.nextInt();  
		 int	b	=	scan.nextInt(); 	 
		 
		
		Functions();  
		
			add(a,b);
		
				subs(a,b); 
		
					mul(a,b); 
		
						div(a,b);
		
		scan.close();
	} 
	
	
	public  	static 	void 		Functions(){
		
		System.out.println("This is the test for functions "); 
		System.out.println("-----------------------------------");
		
	} 
	
					public 	static 	void 		add(int 	a,	 int	b ){
		
							int 	res =	a+b; 
							System.out.println("The added value is "	+	res); 
							System.out.println("-----------------------------------");
		
					} 
	
								public 	static 	void 	subs(int 	a,int 	b){
		
											int 	res	=	a-b; 
											System.out.println("This is the subs value "	+	res);
											System.out.println("-----------------------------------");
								} 
	
										public 	static 	void 	mul(int 	a,int	b){
		
												int 	res	=	a*b;
												System.out.println("This is the mul value "	+	res); 
												System.out.println("-----------------------------------");
										} 
	
												public 	static 	void 	div(int 	a	,int	b)	{
		
														int 	res		=		a/b; 
														System.out.println("This is the div value"	+	res); 
														System.out.println("-----------------------------------");
		
		
												}

			}








