package inMetOvr;

public class Tri extends Value{ 
	
	Tri(int a,int b){
	super(a,b);

	} 
	
	public void show(){
		
		int ret = (a+b)/2; 
		System.out.println("The area of tri is " + ret);
		
	}
}