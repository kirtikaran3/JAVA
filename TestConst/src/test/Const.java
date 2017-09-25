package test;

public class Const {

		int 	i; 
		int		j;	
		int 	k; 
		
		public 	int		result(){ 
			
			System.out.println("This is the constructor");
			return (i+j+k);
		
		} 
		Const(){
			
			i=10; 
			j	=20; 
			k=30;
			
		}
		
}