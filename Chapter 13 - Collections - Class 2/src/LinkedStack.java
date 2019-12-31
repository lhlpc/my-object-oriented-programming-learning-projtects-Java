
public class LinkedStack implements StackADT{
	
	Node front = null;
	int size;
	
	public void push(Object item){
		//Create a new node
		Node n = new Node(item);
		
		//set its next to front
		n.setNext(front);
		//set front to new code
		front = n;
	}
	
	public Object pop(){
		//copy front
		Node copy = front;
		//set front to next of top element
		front = front.getNext();
		//return copy
		return copy;
	}
	
	public boolean isEmpty(){
		//return front==null;
		if (front == null)
			return true;
		else
			return false;
	}
	
	public boolean isFull(){
		return !isEmpty();
	}
	
	public int size(){
		int count = 0;
		Node p = null;
		while(p!=null){
			count++;
			p = p.getNext();
		}
		return count;
	}
	
}
