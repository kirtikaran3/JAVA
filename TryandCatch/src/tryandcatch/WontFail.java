package tryandcatch;

import java.util.Arrays;

public class WontFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[5]; 
		
		System.out.println("This is try and catch Example ");
		
		try{
		
				for(int i=0;i<12;i++){
			
						array[i]=i; 
			
					}
		}  
		catch(ArrayIndexOutOfBoundsException e){ 	//incase you know what you are writing,ie; for arraybound only
			
			System.out.print("Error is:   ");	
			System.out.println(e);
			
		}
		
		catch(Exception e){			//for any error
			
			System.out.print("This is catch error:"); 
			System.out.println(e);
			
		}
		
		
		
		System.out.println("The array is:"+Arrays.toString(array));
	
	
	}

}
