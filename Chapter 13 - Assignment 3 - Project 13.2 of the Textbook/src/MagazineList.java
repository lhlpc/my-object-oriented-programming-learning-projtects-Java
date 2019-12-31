//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus
//
//  Represents a collection of magazines.
//*******************************************************************
public class MagazineList {
	private MagazineNode list;

	// ----------------------------------------------------------------
	// Sets up an initially empty list of magazines.
	// ----------------------------------------------------------------
	public MagazineList() {
		list = null;
	}

	// ----------------------------------------------------------------
	// Creates a new MagazineNode object and adds it to the end of
	// the linked list.
	// ----------------------------------------------------------------
	public void add (Magazine mag)
	{
		MagazineNode node = new MagazineNode (mag);
		MagazineNode current;
		if (list == null)
		   list = node;
		else
		{
			current = list;
			while (current.next != null){
				if(node.magazine.compareTo(current.magazine)<=0){
					Magazine aux = node.magazine;
					node.magazine = current.magazine;
					node.next = current.next;
					current.magazine = aux;
					current.next = node;
					return;
				}
				
				current = current.next;
			}
			current.next = node;
				
		}
	}
	
	//---------------------------------------------------------------
	// Delete the item in the given position and return it
	//---------------------------------------------------------------
	public Magazine remove(int position){
		int i=1;
		MagazineNode current = list;
		Magazine result;
		
		/*To eliminate the first item is necessary to adjust the List node. 
		So, it's considered as a special case. It's better to verify
		it here than in the loop, where it was going to verify in each iteration
		*/
		if(position==0){
			result = list.magazine;
			list = list.next;
			return result;
		}
		
		/*The i index starts in the second position (1) because the first position is
		 * verified separately and because it is a one way list, the current.next node
		 * is the one that needs to be verified each time.
		*/
		while(current.next != null){
			if(i == position){
				result = current.next.magazine;
				current.next = current.next.next;
				return result; 
			}
			i++;
			current = current.next;
		}
		return null;
	} 
	

	// ----------------------------------------------------------------
	// Returns this list of magazines as a string.
	// ----------------------------------------------------------------
	public String toString() {
		String result = "";
		MagazineNode current = list;
		while (current != null) {
			result += current.magazine + "\n";
			current = current.next;
		}
		return result;
	}

	// *****************************************************************
	// An inner class that represents a node in the magazine list.
	// The public variables are accessed by the MagazineList class.
	// *****************************************************************
	private class MagazineNode {
		public Magazine magazine;
		public MagazineNode next;

		// --------------------------------------------------------------
		// Sets up the node
		// --------------------------------------------------------------
		public MagazineNode(Magazine mag) {
			magazine = mag;
			next = null;
		}
	}
}