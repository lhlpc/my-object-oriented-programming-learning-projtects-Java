public class Node {
	
	Object data;
	Node next;
	
	public Object getData(){return data;}
	public Node getNext() {return next;}
	public void setData(Object s){data = s;}
	public void setNext(Node n){next = n;}
	
	public Node(Object s){data = s; next = null;}
	public Node(Object s, Node n){data = s; next = n;}

	public String toString(){
		return data.toString();//In the case of an integer, the integer will be converted to a string that represent it
	}
}