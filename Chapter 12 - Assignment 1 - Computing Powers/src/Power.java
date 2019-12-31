// ***************************************************************** 
// Power.java
//
// Reads in two integers and uses a recursive power method
// to compute the first raised to the second power.
// ***************************************************************** 
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		
		int base, exp; 
		long answer;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Welcome to the power program! "); 
		System.out.println("Please use integers only.");
		
		//get base
		System.out.print("Enter the base you would like raised to a power: ");
		base = scan.nextInt();
		
		//get exponent
		System.out.print("Enter the power you would like it raised to: ");
		exp = scan.nextInt();
		
		answer = power (base,exp);
		System.out.println(base + " raised to the " + exp + " is " + answer);
	}
	
	public static long power(long base, long exp){
		if(exp==1)
			return base;
		if(exp%2==1)
			return base*power(base, exp-1);
		else{
			long temp = power(base, exp/2);
			return temp*temp;
		}		
	}
}

