package test;

public class VarArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the main "); 
		
		System.out.println("The avg is " + avg(1,2,3,4,5,6,7,8,9));
		
	} 
	
	public static int avg(int...number){
		
		System.out.println("This is var arg ");
		
		int total=0;
		int len = number.length; 
		
		System.out.println("The length of var are  :  " + len);
		
		for(int j:number){
		
				total += j;
			
		} 
		
		int res = total/len; 
		return res;
		
		
	}

}
