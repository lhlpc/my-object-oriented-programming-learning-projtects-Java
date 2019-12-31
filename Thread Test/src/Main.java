
public class Main{

	private static class ThreadTest extends Thread{
		
		int[] array;
		
		public ThreadTest(){
			array = new int[90];
		}
		
		public void run(){
			
			for(int i = 1; i <=90; i++){
				array[i-1] = i;
			}
			
			System.out.println("Printing the array:\n");
			for(int i = 0; i < array.length; i++){
				System.out.print(array[i] + " ");
				if(i==40){
					try{
						Thread.yield();
					}
					catch(Exception e){
						System.out.println("Error");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
		
		ThreadTest test = new ThreadTest();
		
		test.start();
		try{
			test.join();
			
		}
		catch(Exception e){
			
		}
		System.out.println("\ntessst");
		
		
	}

}
