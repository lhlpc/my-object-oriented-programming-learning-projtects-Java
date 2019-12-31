import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * @author Luiz Henrique Leite Paes da Costa
 * CS 241 - Data Structures and Algorithms
 * 
 * 
 * This class tests the Binary Search Tree class studied in the textbook simulating
 * a contacts record.
 * 
 * Some operations are allowed to be done by the user, such as adding new contacts, 
 * searching and deleting.
 * 
 * In the beginning, it reads a text file named phonedata.txt and insert the contacts
 * that is in this file.s 
 * 
 * */

public class Main {

	public static void main(String[] args) {

		BST<String, Contact> tree = new BST<String, Contact>();
		int choice;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\n");
		Contact contact;
		String name, number;

		try (Scanner fileReader = new Scanner(new File("phonedata.txt"))) {

			String s = "";
			String aux[];
			String nameInput;
			String phone;

			while (fileReader.hasNextLine()) {
				s = fileReader.nextLine();
				aux = s.split(" ");
				nameInput = "";
				
				if (aux.length > 2) {
					for (int i = 0; i < aux.length - 1; i++) {
						nameInput += aux[i] + " ";
					}
					phone = aux[aux.length - 1];
				} else {
					nameInput = aux[0];
					phone = aux[1];

				}
				tree.insert(nameInput.trim(), new Contact(nameInput.trim(),
						phone));

			}
		} catch (IOException e) {
			System.out.println("\nFile 'phonedata.txt' not found!\n");
		}

		do {

			System.out
					.println("Please, choose one of the following options:\n1 - Add Contact\n2 - Delete Contact\n3 - Find Contact\n4 - Quit program");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("What is the name of the new contact?");
				name = scanner.next();
				System.out.println("What is the number of the new contact?");
				number = scanner.next();
				contact = new Contact(name, number);
				tree.insert(name, contact);
				break;
			case 2:
				System.out
						.println("What is the name of the contact to be deleted?");
				name = scanner.next();
				Contact result = tree.remove(name);
				if(result==null)
					System.out.println("Contact not found!");
				else
					System.out.println("Contact deleted!");
				break;
			case 3:
				System.out
						.println("What is the name of the contact to be found?");
				name = scanner.next();
				contact = tree.find(name);
				if (contact == null)
					System.out.println("Contact not found!");
				else
					System.out.println("Name: " + contact.getName()
							+ "\nNumber: " + contact.getNumber() + "\n\n");
				break;
			case 4:
				System.out.println("Thank You!");
				break;
			default:
				System.out.println("Number not valid. Try again.");
			}

		} while (choice != 4);

	}

}
