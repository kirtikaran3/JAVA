package usethis;

public class ThisTime { 
	
		private int hour; 
		private int minute; 
		private int seconds; 
		
		public ThisTime(int hour,int minute,int seconds){
			
			this.hour=hour; 
			this.minute=minute; 
			this.seconds=seconds; 
			
		} 
		
		public void show(){
			
			System.out.println("The time is " + hour + minute + seconds);
			
		}
		
	}



