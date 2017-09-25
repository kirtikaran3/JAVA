package inMetOvr;

public class Sqr extends Value{

	Sqr(int a,int b){
		
		super(a,b);
		
	} 
	
	public void show(){
		
		int ret = a*b; 
		System.out.println("The area of square is " + ret);
		
	}

}
