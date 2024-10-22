/** Source code example for "A Practical Introduction to Data
    Structures and Algorithm Analysis, 3rd Edition (Java)" 
    by Clifford A. Shaffer
    Copyright 2008-2011 by Clifford A. Shaffer
 */

/** Array-based list implementation */
class AList<E> implements List<E> {
	private static final int defaultSize = 10; // Default size
	private int maxSize;        // Maximum size of list
	private int listSize;       // Current # of list items
	private int curr;           // Position of current element
	private E[] listArray;      // Array holding list elements

	/** Constructors */
	/** Create a list with the default capacity. */
	AList() { this(defaultSize); }
	
	/** Create a new list object.
    @param size Max # of elements list can contain. */
	@SuppressWarnings("unchecked") // Generic array allocation
	AList(int size) { 
		maxSize = size;
		listSize = curr = 0;
		listArray = (E[])new Object[size];  // Create listArray
	}

	public void clear()         // Reinitialize the list
	{ listSize = curr = 0; }  // Simply reinitialize values

	/** Insert "it" at current position */
	public void insert(E it) {
		assert listSize < maxSize : "List capacity exceeded";
		for (int i=listSize; i>curr; i--) // Shift elements up
			listArray[i] = listArray[i-1];  //   to make room
		listArray[curr] = it;
		listSize++;               // Increment list size
	}

	/** Append "it" to list */
	public void append(E it) {
		assert listSize < maxSize : "List capacity exceeded";
		listArray[listSize++] = it;
	}

	/** Remove and return the current element */
	public E remove() {
		if ((curr<0) || (curr>=listSize))  // No current element
			return null;
		E it = listArray[curr];   // Copy the element
		for(int i=curr; i<listSize-1; i++) // Shift them down
			listArray[i] = listArray[i+1];
		listSize--;               // Decrement size
		return it;
	}
	public void moveToStart() { curr = 0; } // Set to front
	public void moveToEnd() { curr = listSize; } // Set at end
	public void prev() { if (curr != 0) curr--; }   // Back up
	public void next() { if (curr < listSize) curr++; }

	/** @return List size */
	public int length() { return listSize; }

	/** @return Current position */
	public int currPos() { return curr; }

	/** Set current list position to "pos" */
	public void moveToPos(int pos) {
		assert (pos>=0) && (pos<=listSize) : "Pos out of range";
		curr = pos;
	}

	/** @return Current element */
	public E getValue() {
		assert (curr>=0) && (curr<listSize) :
			"No current element";
		return listArray[curr];
	}
	// Extra stuff not printed in the book.

	/**
	 * Generate a human-readable representation of this list's contents
	 * that looks something like this: < 1 2 3 | 4 5 6 >.  The vertical
	 * bar represents the current location of the fence.  This method
	 * uses toString() on the individual elements.
	 * @return The string representation of this list
	 */
	public String toString()
	{
		// Save the current position of the list
		int oldPos = currPos();
		int length = length();
		StringBuffer out = new StringBuffer((length() + 1) * 4);

		moveToStart();
		out.append("< ");
		for (int i = 0; i < oldPos; i++) {
			out.append(getValue());
			out.append(" ");
			next();
		}
		out.append("| ");
		for (int i = oldPos; i < length; i++) {
			out.append(getValue());
			out.append(" ");
			next();
		}
		out.append(">");
		moveToPos(oldPos); // Reset the fence to its original position
		return out.toString();
	}
}