package callref;

public class Ref { 
	
	int a; 
	int b; 
	
	Ref(int i,int j){
		
		a=i; 
		b=j;
		
	} 
	
	public void show(Ref obj){
		
		int x= obj.a; 
		int y= obj.b; 
		
		int res = x+y; 
		
		System.out.println("The addition of the ref variable is " + res);
		
	}

}
