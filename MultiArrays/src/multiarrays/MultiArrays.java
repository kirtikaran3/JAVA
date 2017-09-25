package multiarrays;

import java.util.Scanner;

public class MultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int multi[][] = new int[5][5];
		int i,j,k; 
		
		for(i=0;i<5;i++){
			
			for(j=0;j<5;j++){
				
				 
				k = scan.nextInt(); 
				
				multi[i][j] = k;
				
			}
			
		}
		
		for(i=0;i<10;i++){
			
			for(j=0;j<5;j++){
				
				System.out.println("This is array"+	multi[i][j]);
			}
			
		}
		
		scan.close();
	}

}



