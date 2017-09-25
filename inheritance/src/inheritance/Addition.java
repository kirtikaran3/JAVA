package inheritance;

public class Addition extends Input{

	//Input in1 = new Input(10,10); 
	
	/*public void show(){
		
		System.out.println("This is addition subclass");
		
	}*/
	
	public Addition(int x,int y){
		
		super(x,y);
		
	}
	
	int res = a+b;  
	
	
	public void show(){
		
		System.out.println("This is addition subclass");
		System.out.println("The added value is" + res);
		
	}
}
