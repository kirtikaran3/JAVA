package student;

public class Records {

	int id=12; 
	float percent=(float)66.6; 
	String name; 
	int collid=13; 
	
	public void msg(){
		
		System.out.println("Enter the id of student");
		System.out.println("Enter the name and coll id of student"); 
		System.out.println("Enter the percentage of student");
	
		} 
	
	public void display(int x,float y,int z){
		
		id=x; 
		percent=y; 
		collid=z;
		
		System.out.println("The results are"); 
		System.out.println("The id is"+ id ); 
		System.out.println("The percent is " + percent); 
		System.out.println("The collid is" + collid);
		
	}

}