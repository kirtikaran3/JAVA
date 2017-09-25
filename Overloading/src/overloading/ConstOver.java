package overloading;

public class ConstOver {

		int		i;	
		int		j; 
		int		k; 
		
		public 	int		result(){
			
			System.out.println("This is the  calculation of result"); 
			return(i*j*k);
			
		} 
		
		ConstOver(){
			
			i=10; 
			j=20; 
			k=30; 
			
			
			
		} 
		
		ConstOver(int 	l,	int	b,	int  h){
			
			
				i	=	l; 
				j	=	b; 
				k	=	h; 
			
			
			
		}
	
}
