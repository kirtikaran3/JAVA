package statictest;

public class Hellostatic {

	public static String HelloFunction(String message ){
		
		
		System.out.println( message);  
		return message;
		
	} 
	
	public String helloInst(String message){
		
		
		System.out.println("The message"	+ message);
		return message;
	} 
	
	public int add(int a , int b){
		
		int res; 
		res=a+b;  
		result(res);
		return res;
		
		
	} 
	
	public static int subs(int a , int b){
		
		int res; 
		res=a-b; 
		//result(res);
		return res;
		
		
	} 
	
	
	public int subs(int a,int b,int c){
	
		int res; 
		res=a+b-c; 
		result(res);
		return res;
		
		
		
	}
	public int result(int res){
		
		System.out.println("The result is "	+	res);
	
		return res;
		
	} 
	
	public String result(String res){
		
		System.out.println("The result is "	+	res);
	
		return res;
		
	}
	
}
