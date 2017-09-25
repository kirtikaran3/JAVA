package callref;

public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ref obj = new Ref(10,10); 
		
		obj.show(obj);  //here the .show(obj) will work as the ref and thus it is CALLBYREF
		
		obj.a=12; 
		obj.b=10; 
		
		obj.show(obj);
		
	}

}
