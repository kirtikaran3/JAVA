package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int 	[]		arrays	=	{34,12,3,14,5};
	
		for	(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				
				if(arrays[i]>arrays[j]){

					int temp = arrays[i]; 
					arrays[i] =	arrays[j]; 
					arrays[j] =	temp;
					
					}
			}
			
		} 
		for(int 	i=0;	i<5;i++)
			System.out.println("The values are "	+	arrays[i]);
	}
	

}
