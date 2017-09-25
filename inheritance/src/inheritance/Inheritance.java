package inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * in ref var in1 we are using the object of Addition and the 
		 * 
		 * in1 type ref variable is of type Input 
		 * 
		 * This is one of example of polymorpishm
		 * 
		  */
		 
		
		Input in1 = new Input(1,10); 
		in1.show();
		
		Addition add = new Addition(10,10); 
		//add.put(10,10); 
		add.show();  
		
		Subs sub =new Subs(10,10); 
		//sub.put(20, 10); 
		sub.show();
	
		Mul mul =new Mul(10,10); 
		//mul.put(10,10); 
		mul.show();
	}

}
