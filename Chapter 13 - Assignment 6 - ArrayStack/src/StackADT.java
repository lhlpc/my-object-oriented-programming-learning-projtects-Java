// ***************************************************************
//   StackADT.java
//   The classic Stack interface.
// ***************************************************************
public interface StackADT {
	// ---------------------------------------------------
	// Adds a new element to the top of the stack.
	// ---------------------------------------------------
	public void push(Object val);

	// ---------------------------------------------------
	// Removes and returns the element at the top of the stack.
	// ---------------------------------------------------
	public Object pop();

	// ---------------------------------------------------
	// Returns true if stack is empty, false otherwise.
	// ---------------------------------------------------
	public boolean isEmpty();

	// ---------------------------------------------------
	// Returns true if stack is full, false otherwise.
	// ---------------------------------------------------
	public boolean isFull();
}