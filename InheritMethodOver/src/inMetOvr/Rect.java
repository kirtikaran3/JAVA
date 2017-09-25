package inMetOvr;

public class Rect extends Value{

	Rect(int a, int b){
		
		super(a,b);
		
	} 
	
	public void show(){
		
		int ret = (a*b); 
		System.out.println("The area of rect is " + ret);
		
	}
	
}
