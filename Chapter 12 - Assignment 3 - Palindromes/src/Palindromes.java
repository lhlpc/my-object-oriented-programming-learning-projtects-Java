import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String n;
		
		System.out.println("Enter a word to verify if it is a palidrome: ");
		n = reader.nextLine();
		
		if(palindrome(n))
			System.out.println("It is a Palindrome");
		else
			System.out.println("It is not a Palindrome");
		
		

	}
	
	public static boolean palindrome(String n){
		n = n.replace(" ", "");
		if(n.length()== 1 || n.length()==0)
			return true;
		
		if(n.charAt(0)==n.charAt(n.length()-1) && palindrome( n.substring(1, n.length()-1)) )
				return true;
		
		return false;
	}
}
