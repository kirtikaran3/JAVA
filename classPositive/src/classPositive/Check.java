package classPositive;

public class Check { 
	
	int number; 
	
	public boolean checkNumber(){
		
		if(number > 0){
			
			System.out.println("This is a positive number"); 
			return true;
		} 
		
		else{
			
			System.out.println("This is a negative number");
			return false;
		}
		 
	}

}
