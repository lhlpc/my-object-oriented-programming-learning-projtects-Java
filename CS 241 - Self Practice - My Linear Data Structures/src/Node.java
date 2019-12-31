
public class Node<E> {
	private E info;
	private Node<E> next;
	
	public Node(E i, Node n) {
		info = i;
		next = n;
	}
	
	public Node(E i){
		info = i;
		next=null;
	}

	public E getInfo() {
		return info;
	}

	public void setInfo(E info) {
		this.info = info;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
}
