import java.util.Scanner;

public class TestingStrings{

	public static void main(String[] args){
		
		StringTooLongException e = new StringTooLongException();
		Scanner reader = new Scanner(System.in);
		String enter = "a";
		
		while(!enter.equalsIgnoreCase("DONE")){
			
			try{
				System.out.println("Enter a string: ");
				enter = reader.next();

				if(enter.length() >= 20)
					throw e;
				else
					System.out.println("Good string");
			}
			catch(StringTooLongException problem){
				System.out.println(problem.getMessage());
			}
		}
		

	}

}
