package timeClass;

public class Format {

	private int hour; 
	private int minute; 
	private int seconds; 
	
	public void setting(int h,int m,int s){
		
		if( (0 <= h && h < 24) &&  (0 <= s && s < 60) && (0 <= m && m < 60)){
		
		hour = h; 
		minute = m; 
		seconds = s; 
		
		}
		
		
	}
	
	public String changeString(){
		
		return String.format("%02d:%02d:%02d", hour,minute,seconds);
		
	} 
	
 	
}
