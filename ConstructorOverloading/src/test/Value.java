package test;

public class Value {

	private int l; 
	private int b; 
	private int h; 
	private int res;
	
	public int cal(){
		
		res = l*b*h; 
		return res;
		
	} 
	
	public void show(){
		
		System.out.println("The result is " + res);
		
	}
	
	
	public Value(){
		
		System.out.println("This is default constructor ");
		l=10; 
		b=10; 
		h=10;
		
	} 
	
	public Value(int i,int j,int k){
		
		System.out.println("This is paramterzed constructor");
		l=i; 
		b=j; 
		h=k;
		
	}
	
}



