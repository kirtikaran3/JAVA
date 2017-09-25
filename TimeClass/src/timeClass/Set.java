package timeClass;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is main class"); 
		
		Format obj = new Format(); 
		
		System.out.println("The initial format is "); 
		obj.setting(23,59,59); 
		
		obj.changeString();  
		
		System.out.println("The time is "+ obj.changeString() );
		
		
	
	}

}
