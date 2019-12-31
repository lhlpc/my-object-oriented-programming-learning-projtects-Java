// ***************************************************************
//   ArrayStack.java
//
//   An array-based Object stack class with operations push,
//   pop, and isEmpty and isFull.
//
// ***************************************************************
public class ArrayStack implements StackADT {
	private int stackSize = 5; // capacity of stack
	private int top; // index of slot for next element
	private Object[] elements;
	// ---------------------------------------------------
	// Constructor -- initializes top and creates array
	// ---------------------------------------------------
	public ArrayStack() {
		elements = new Object[stackSize];
	}

	// --------------------------------------------------
	// Adds element to top of stack if it's not full, else
	// does nothing.
	// --------------------------------------------------
	public void push(Object val) {
		if(isFull()){
			System.out.println("The stack is full!");
			return;
		}
		
		if(isEmpty()){
			top=0;
			elements[0] = val;
		}
		else{
			int i;
			for(i = 0; elements[i]!=null ; i++){}
			elements[i]=val;
			top = i;
		}
			
	}

	// ---------------------------------------------------
	// Removes and returns value at top of stack. If stack
	// is empty returns null.
	// ---------------------------------------------------
	public Object pop() {
		if(isEmpty()){
			System.out.println("The stack is empty!");
			return null;
		}
		Object result = elements[top];
		elements[top] = null;
		top--;
		return result;
		
		
			
	}

	// ---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	// ---------------------------------------------------
	public boolean isEmpty() {
		if (elements[0]==null)
			return true;
		return false;
	}

	// ---------------------------------------------------
	// Returns true if stack is full, false otherwise.
	// ---------------------------------------------------
	public boolean isFull() {
		if(top==4)
			return true;
		return false;
	}
}