package student;

//import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Records first = new Records(); 
	first.msg();  
	
	//Scanner scan = new Scanner(System.in); 
	
	int id;			//= scan.nextInt();  
	float no; 		//= scan.nextFloat(); 
	int cid; 		//= scan.nextInt(); 
	
	id=first.id; 
	first.name="Kirti karan"; 
	cid=first.collid; 
	no=first.percent;
	
	System.out.println("The name of student is "+ first.name);  
	
	first.display(id, no, cid);
	
	
	//scan.close();
	}

}
