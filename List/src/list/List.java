package list;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList();
		
		System.out.println("Enter the number of elements");
		
		Scanner scan = new Scanner(System.in);   
		Scanner listscan = new Scanner(System.in);
		int i = scan.nextInt();  
		
		for(int j=0;j<i;j++) {
						 
			int x =  listscan.nextInt();  
			list.add(x); 
		} 
		
		listscan.close();
		 
		System.out.println("The value at 0th location is "+ list.get(0)); 
		System.out.println("The whole list is " + list.toString()); 
		
		list.remove(1); 
		System.out.println("The list after removing is " + list.toString());
		
		scan.close(); 
		
		
	}

}
