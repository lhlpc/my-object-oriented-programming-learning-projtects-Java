
public class Node {
	private int info;
	private Node next;
	
	public Node(int i, Node n) {
		info = i;
		next = n;
	}
	
	public Node(int i){
		info = i;
		next=null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
