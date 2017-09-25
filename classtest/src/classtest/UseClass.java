package classtest;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner 	scan	=	new 	Scanner (System.in); 
		
		Cars	kits		=		new Cars();
		
		kits.modelno	=	scan.nextInt(); 
		kits.modelname	=		"Kirti2.0"; 
		kits.topspeed	=	scan.nextInt();  
		
		
			System.out.println("The car model is "	+	Cars.modelno);
			System.out.println("The model name is "	+	Cars.modelname); 
			System.out.println("The top speed of cars is"	 	+ Cars.topspeed);
		
			
		 
		scan.close();
	}

}
