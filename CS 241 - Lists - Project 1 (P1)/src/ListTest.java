import java.util.Scanner;

/**
 * CS 241 - Data Structures and Algorithms 
 * Lists - Project 1 - 1st Assignment
 * 
 * This class uses Linked Lists and implement extra methods that do different operations with
 * them. 
 * 
 * 
 * @author Luiz Henrique Leite Paes da Costa
 */
public class ListTest {
	
	/**It interchange the current value with its successor*/
	public static void interchange(LList<Integer> l)throws ListException{
		if(l.length() <= 1 || (l.currPos()>=l.length()-1))
			throw new ListException();

		int auxiliar;
		
		auxiliar = l.getValue();
		l.remove();
		l.next();
		l.insert(auxiliar);
		l.prev();
		
	}
	/**Tests Interchange methods*/
	public static void testInterchange(){
		LList<Integer> testList = new LList<Integer>();
		Scanner reader = new Scanner(System.in);

		//Inserting items in testList
		System.out.println("Type the list.\n ---- Type each item and then \"Return\" key or type \"DONE\" to finish---- \n");
		String item = reader.next();
		while(!item.equalsIgnoreCase("DONE")){
			int item1 = Integer.parseInt(item);
			testList.append(item1);
			item = reader.next();
		}
		/*for(int i = 0; i<11; i++){
			testList.insert(i);
			testList.next();
		}
		*/
		
		System.out.println("\nThis is your list: " + testList.toString() + "\n");
		//Inverting the current value and its successor
		try{
			System.out.println("Type the position of the element to be interchanged with its successor: ");
			testList.moveToPos(reader.nextInt());
			interchange(testList);
			System.out.println("\nResulted list: " + testList.toString() + "\n"); //Printing the result
		}
		catch(ListException e){
			System.out.println(e.getMessage());
		}
	}
	
	/**It reverses the items of the list given.*/
	public static void reverse(LList<Integer> l)throws ListException{
		if(l.length()<=1)
			throw new ListException();
		
		int aux;
		l.moveToStart();
		for(int i = l.length(); i!=1; i--){
			aux = l.getValue();
			l.moveToPos(i);
			l.insert(aux);
			l.moveToStart();
			l.remove();
		}
	}
	
	/**Tests the reverse method*/
	public static void testReverse(){
		LList<Integer> testList = new LList<Integer>();
		Scanner reader = new Scanner(System.in);

		//Inserting items in testList
		System.out.println("Type the list.\n ---- Type each item and then \"Return\" key or type \"DONE\" to finish---- \n");
		String item = reader.next();
		while(!item.equalsIgnoreCase("DONE")){
			int item1 = Integer.parseInt(item);
			testList.append(item1);
			item = reader.next();
		}
		
		System.out.println("\nThis is your list: " + testList.toString() + "\n");
		
		//Reversing list
		try{
			reverse(testList);
			System.out.println("\nThis is your list reversed: " + testList.toString() + "\n");
		}
		catch(ListException e){
			System.out.println(e.getMessage());
		}
		
		
	}

	/**It merges to given ordered Lists of Integers
	 * @return The resulted list from the merging */
	public static LList mergeLists(LList<Integer> l1, LList<Integer> l2)throws ListException{
		if (l1.length()<1 || l2.length()<1 )
			throw new ListException();
		LList<Integer> l3 = new LList<Integer>();
		int a = 0, b = 0; 
		
		while(l3.length()<(l2.length()+l1.length())){
			l1.moveToPos(a);
			l2.moveToPos(b);
			
			if(a<l1.length() && b<l2.length()){
				if(l1.getValue() < l2.getValue()){
					l3.append(l1.getValue());
					a++;
				}
				else{
					l3.append(l2.getValue());
					b++;
				}
			}
			else{
				if(a>=l1.length()){
					l3.append(l2.getValue());
					b++;
				}
				else{
					l3.append(l1.getValue());
					a++;
				}
					
			}	
		}
			
		return l3;
	}
	
	public static void testMergeLists(){
		LList<Integer> testList = new LList<Integer>();
		LList<Integer> testList2 = new LList<Integer>();
		LList<Integer> testList3 = new LList<Integer>();
		Scanner reader = new Scanner(System.in);

		//Inserting items in testList1
		System.out.println("Type the first list.\n ---- Type each item and then \"Return\" key or type \"DONE\" to finish---- \n");
		String item = reader.next();
		while(!item.equalsIgnoreCase("DONE")){
			int item1 = Integer.parseInt(item);
			testList.append(item1);
			item = reader.next();
		}
		
		System.out.println("\nThis is the first list: " + testList.toString() + "\n");
		
		//Inserting items in testList2 and printing it
		System.out.println("Type the second list.\n ---- Type each item and then \"Return\" key or type \"DONE\" to finish---- \n");
		item = reader.next();
		while(!item.equalsIgnoreCase("DONE")){
			int item1 = Integer.parseInt(item);
			testList2.append(item1);
			item = reader.next();
		}
		System.out.println("\nThis is the second list: " + testList2.toString() + "\n");
		
		//Merging Lists
		try{
			testList3 = mergeLists(testList, testList2);
			System.out.println("Merged List: \n" + testList3.toString());
		}
		catch(ListException e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
	/**It calls testInterchange and testReverse methods.*/
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int choice;
		System.out.println("What operation do you want to do with a list?\n1 - Interchange\n2 - Revert\n3 - Merge two lists\nOther number - End the program\n");
		choice = reader.nextInt();
		while(choice == 1 || choice == 2 || choice==3){
			if(choice==1){
				testInterchange();
				System.out.println("\n---------------------------\n");
			}
			if(choice==2){
				testReverse();
				System.out.println("\n---------------------------\n");
			}
			if(choice==3){
				testMergeLists();
				System.out.println("\n---------------------------\n");
			}
			System.out.println("What operation do you want to do with a list?\n1 - Interchange\n2 - Revert\n3 - Merge two lists\n");
			choice = reader.nextInt();
		}
	}
}
