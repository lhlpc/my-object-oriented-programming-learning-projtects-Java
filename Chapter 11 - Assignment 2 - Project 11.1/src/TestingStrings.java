import java.util.Scanner;

public class TestingStrings{

	public static void main(String[] args)  throws StringTooLongException{
		
		StringTooLongException e = new StringTooLongException();
		Scanner reader = new Scanner(System.in);
		String enter;
		
		System.out.println("Enter a string: "); 
		enter = reader.next();
		
		while(!enter.equals("DONE")){
			
				System.out.println("Enter a string: ");
				enter = reader.next();

				if(enter.length() >= 20)
					throw e;
				else
					System.out.println("Good string");

		}
		

	}

}
