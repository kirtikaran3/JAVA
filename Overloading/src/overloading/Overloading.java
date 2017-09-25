package overloading;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the main of overloading"); 
		
		ConstOver	const1	=	new	ConstOver(); 
		ConstOver		const2		=	new	ConstOver(10,10,10); 
		
		System.out.println("This is the value of const1		"		+		const1.result()); 
		System.out.println("This is the value of const2		"		+		const2.result());

	}

}
