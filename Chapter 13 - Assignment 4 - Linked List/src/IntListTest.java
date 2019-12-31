// ***************************************************************
//   IntListTest.java
//
//   Driver to test IntList methods.
// ***************************************************************
import java.util.Scanner;

public class IntListTest {
	private static Scanner scan;
	private static Scanner scan2;
	private static IntList list = new IntList();

	// ---------------------------------------------------------------- //
	// Creates a list, then repeatedly prints the menu and does what // the user
	// asks until they quit.
	// //----------------------------------------------------------------
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan2 = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
		
		//Testing the toString method
		System.out.println("\n\nThis is the list using the toString method: " + list);
	}

	// ----------------------------------------
	// Does what the menu item calls for.
	// ----------------------------------------
	public static void dispatch(int choice) {
		int newVal;
		int old;
		switch (choice) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1: // add to front
			System.out.println("Enter integer to add to front");
			newVal = scan.nextInt();
			list.addToFront(newVal);
			break;
		case 2: // add to end
			System.out.println("Enter integer to add to end");
			newVal = scan.nextInt();
			list.addToEnd(newVal);
			break;
		case 3: // remove first element
			list.removeFirst();
			break;
		case 4:
			list.removeLast();
			break;
		case 5:
			System.out.println("Enter the value to be replaced: ");
			old = scan2.nextInt();
			System.out.println("Enter the new value: ");
			newVal = scan2.nextInt();
			list.replace(old, newVal);
			break;
		case 6: // print
			list.print();
			break;
		default:
			System.out.println("Sorry, invalid choice");
		}
	}
 
	// -----------------------------------------
	// Prints the user's choices
	// -----------------------------------------
	public static void printMenu() {
		System.out.println("\n   Menu   ");
		System.out.println("   ====");
		System.out.println("0: Quit");
		System.out.println("1: Add an integer to the front of the list");
		System.out.println("2: Add an integer to the end of the list");
		System.out.println("3: Remove an integer from the front of the list");
		System.out.println("4: Remove an integer from the end of the list");
		System.out.println("5: Substitue the occurrence of a value for another value");
		System.out.println("6: Print the list");
		System.out.print("\nEnter your choice: ");
	}
}