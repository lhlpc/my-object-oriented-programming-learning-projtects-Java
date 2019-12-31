// ********************************************************************
// ParenMatch.java //
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************
import java.util.*;

public class ParenMatch {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		String line; // the string of characters to be checked Scanner scan =
		Scanner scan = new Scanner(System.in);				// new Scanner(System.in);
		int numParen = 0; //Number of right parenthesis that have a correspondent left parenthesis
		
		System.out.println("\nParenthesis Matching");
		System.out.print("Enter a parenthesized expression: ");
		line = scan.nextLine();
		while(line=="")
			line = scan.nextLine();
		
		
		for(int i = 0; i<line.length() ;i++){
			if(line.charAt(i) == '(')
				s.push("(");
			try{
				if(line.charAt(i)==')'){
					s.pop();
					numParen++;//If the exception is not thrown, it means that there is
							 //a correspondent left parenthesis for the right one being checked
				}
			}
			catch(EmptyStackException e){
				System.out.println("There is not a left parenthesis for the right parenthesis number " + (numParen+1) + " and you successors (if they exist)." );
				return;
			}
		}
		if(!s.isEmpty())
		{
			System.out.println("From the left parenthesis number " + numParen + " to your previous (if they exist) there is not a correspondent right parenthesis.");
		}
		else {
			System.out.println("All the parenthesis match!");
		}

	}
}