// ***************************************************************
// FILE:  IntList.java
//
// Purpose: Defines a class that represents a list of integers
//
// ***************************************************************
public class IntList {
	private IntNode front; // first node in list
	private int length;

	// -----------------------------------------
	// Constructor. Initially list is empty.
	// -----------------------------------------

	public IntList() {
		front = null;
	}

	// -----------------------------------------
	// Adds given integer to front of list.
	// -----------------------------------------
	public void addToFront(int val) {
		front = new IntNode(val, front);
		length++;
	}

	// -----------------------------------------
	// Adds given integer to end of list.
	// -----------------------------------------
	public void addToEnd(int val){
		IntNode newnode = new IntNode(val,null);
		if(front==null)
			front = newnode;
		else {
			//make temp point to last thing in list
			IntNode temp = front;
			while (temp.next != null)
				temp = temp.next;
			//link new node into list
			temp.next = newnode;
		}
		length++;
	}

	// -----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	// -----------------------------------------
	public void removeFirst() {
		if (front != null){
			front = front.next;
			length--;
		}
	}
	
	/*
	 *Removes the last element.
	 *If the list is empty, it does nothing 
	 */
	public void removeLast(){
		IntNode aux = front;
		while(aux.next.next != null){
			aux = aux.next;
		}
		aux.next = null;
	}
	
	/*
	 * Substitute the items that are equal to oldValue for the newValue 
	 */
	public void replace(int oldValue, int newValue){
		IntNode aux = front;
		while(aux!=null){
			if(aux.val == oldValue){
				aux.val = newValue;
			}
			aux = aux.next;
		}
	}
	
	/*
	 * Returns the length of the list
	 */
	public int length(){
		return length;
	}

	/*
	 * Return the String that represents the list
	 */
	public String toString(){
		String result = "";
		IntNode temp = front;
		while (temp != null) {
			result += temp.val + " ";
			temp = temp.next;
		}
		return result;	
	}
	
	// ------------------------------------------------
	// Prints the list elements from first to last.
	// ------------------------------------------------
	public void print() {
		System.out.println("--------------------");
		System.out.print("List elements: ");
		IntNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\nLength: " + this.length());
		System.out.println("\n-----------------------\n");
	}

	// *************************************************************
	// An inner class that represents a node in the integer list.
	// The public variables are accessed by the IntList class.
	// *************************************************************
	private class IntNode {
		public int val; // value stored in node
		public IntNode next; // link to next node in list

		// ------------------------------------------------------------------ //
		// Constructor; sets up the node given a value and IntNode reference
		// //------------------------------------------------------------------

		public IntNode(int val, IntNode next) {
			this.val = val;
			this.next = next;
		}
	}
}