package methods;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner		scan	=	new	Scanner(System.in); 
		
		int 	a	=	scan.nextInt();  
		int		b	=	scan.nextInt(); 	 
		int		c	=	scan.nextInt();
		long	d	=	scan.nextLong();
		
		System.out.println("The value after first add is"	+	add(a,b)); 
		System.out.println("The value after overlaod is "	+	add(a,b,c)); 
		System.out.println("the value after 2nd overload is "	+	add(a,d,c));
		
		scan.close();	
		}
	public 	static	int		add(int 	a,int	b){
	
		System.out.println("This is the first  function ");
		return(a+b);
	
		
	} 
	
	public static	int 	add(int		a,		int	 b	,	int 	c){
		 
		int 	res; 
		
		System.out.println("This is the method overloading");  
		res	=	a	+	b	+c;
		
		return(res) ;
	}  
	
	public static  long		add(	int 	a,	long  b	,int 	c	){
		
		System.out.println("This is the  third function of the overloading ");
		
		return(a+b+c);
			}
	
}
