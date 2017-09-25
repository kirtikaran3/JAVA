package inheritance;

public class Input {

	int a,b; 
	
	public void show(){
		
		System.out.println("This is Input class" + a + b);
		
	}
	

	//once we declare any constructor,Complier will not declare DEFAULT CONSTRUCTOR
	
	Input(int x,int y){
	
		a=x; 
		b=y; 
		
	}
	/*Input(){
			
			a=9; 
			b=8; 
			
		}*/
		
	
}
