
public interface StackADT {
	
	//-----------------------------------------------
    // Puts item on top of stack.
    //-----------------------------------------------
    public void push(Object item);

    //------------------------------------------------
    // Removes and returns object from top of the stack.
    //------------------------------------------------
    public Object pop();

    //------------------------------------------------
    // Returns true if queue is empty.
    //------------------------------------------------
    public boolean isEmpty();

    //------------------------------------------------
    // Returns true if queue is full.
    //------------------------------------------------
    public boolean isFull();

    //------------------------------------------------
    // Returns the number of elements in the queue.
    //------------------------------------------------
    public int size();

	
}
