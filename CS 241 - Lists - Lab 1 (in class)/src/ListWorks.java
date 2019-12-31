/**
 * CS 241 - Data Structures and Algorithms 
 * Lists - Lab 1
 * 
 * This class uses Linked Lists an creates an extra method to manipulate them
 * 
 * 
 * @author Luiz Henrique Leite Paes da Costa
 */
public class ListWorks {

	/**It doubles each value in the list and put the copy after it.*/
	public static LList<Integer> doubleIt(List<Integer> L){
		
		LList<Integer> newList = new LList<Integer>() ;
		L.moveToStart();
		
		while(L.currPos()<L.length()){
			newList.append(L.getValue());
			newList.append(L.getValue());
			L.next();
		}
		return newList;
	}
	
	/**It tests the LList class and the doubleIt method*/
	public static void main(String[] args){
		LList<Integer> testList = new LList<>();
		LList<Integer> testList2 = new LList<>();
		
		//Inserting items in testList
		for(int i = 0; i<11; i++){
			testList.insert(i);
			testList.next();
		}
		
		//Printing testList
		testList.moveToStart();
		System.out.println("The first list is:");
		while(testList.currPos()<testList.length()){
			System.out.print(testList.getValue() + " ");
			testList.next();
		}
		
		System.out.println("\n");
		
		testList2 = doubleIt(testList);
		
		//Printing testList2
		testList2.moveToStart();
		System.out.println("This is the first list with its values repeated:");
		while(testList2.currPos()<testList2.length()){
			System.out.print(testList2.getValue() + " ");
			testList2.next();
		}

	}
}
