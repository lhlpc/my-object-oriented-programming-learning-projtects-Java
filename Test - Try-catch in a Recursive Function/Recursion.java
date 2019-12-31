
public class Recursion {

	public static void main(String[] args) {
		
		try{
			System.out.println(factorial(0));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}
	
	public static int factorial(int n)throws Exception{
		
		if(n <= 0)
			throw new Exception("Number less than 1.");
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
		
	}

}
