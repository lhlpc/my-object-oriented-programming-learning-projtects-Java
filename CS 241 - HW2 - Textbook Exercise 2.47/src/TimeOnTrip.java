
public class TimeOnTrip {

		public static void main(String[] args){
			
		System.out.println(time());
		System.out.println("\n");
		System.out.println(time2(60, 60));	
			
		}
		
		
		public static float time(){
			
			float totalTime = 0;
			float speed = 60;
			float timeAdded;
			
			for(int d = 60; d != 0; d--){
				timeAdded = 1/(speed);
				speed -= 1;
				totalTime += timeAdded;
			}
			
			return totalTime;		
			
		}
		
		public static float time2(float s, float d){
			if(d == 0)
				return 0;
			else{
				float t = 1/s;
				return t + time2(s-1, d-1);
			}	
				
		}
				
		
		
		
}
