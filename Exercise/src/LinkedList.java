import java.awt.List;


public class LinkedList {

	private Node front;
	private int length;
	
	public LinkedList(){
		this.front = null;
		this.length = 0;
	}
	
	public LinkedList(int data){
		this.front = new Node(data);
		this.length = 1;
	}
	
	public void insertInTheFront(int data){
		if(this.front == null){
			this.front = new Node(data);
			return;
		}
		else{
			Node newNode = new Node(data, front);
			this.front = newNode;
		}
		length++;
	}
	
	public void insertInTheEnd(int data){
		if(front == null){
			this.front = new Node(data);
		}
		else{
			Node auxiliar = front;
			while(auxiliar.next!=null){
				auxiliar = auxiliar.next;
			}
			auxiliar.next = new Node(data);
		}
		length++;
	}
	
	public void deleteLastOne() throws Exception{
		if(front==null){
			throw new Exception("Problem: Empty List");	
		}
		if(length==1){
			front = null;
			return;
		}
		Node last;
		for(last = front; last.next.next!=null; last = last.next){}
		last.next = null;
		
	}
	
	public void insertInTheEnd2(int data){
		if(front==null){
			this.front = new Node(data);
		}
		else{
			Node end = searchEnd(this.front);
			end.next = new Node(data);
		}
		length++;
	}
	
	/**
	 * @return position of the searched element in the list
	 * */
	public int linearSearch(int data) throws Exception {
		if(length==0){
			throw new Exception("Operation could not be done: Empty list");
		}
		
		Node auxiliar = this.front;
		for(int position=0; auxiliar!=null; position++, auxiliar = auxiliar.next){
			if(auxiliar.data==data){
				return position;
			}
		}
		return -1;
	}
	
	/*
	 * Binary search is not applicable to this Linked List because would be too complicated since there
	 * are not indexes.
	 * 
	 */
	
	
	
	
	
	
	private Node searchEnd(Node n){
		if(n.next==null){
			return n;
		}
		return searchEnd(n.next);
	}
	
	
	
	@Override
	public String toString(){
		if(front == null){
			return null;
		}
		String result = "";
		Node auxiliar = front;
		while(auxiliar!=null){
			result += auxiliar.data + " ";
			
			auxiliar = auxiliar.next; 
		}
		return result;
			
	}
	
	
	public int getLength(){
		return this.length;
	}
	
	
	private class Node {
		
		protected Node next;
		protected int data;
		
		protected Node(int data){
			this.next = null;
			this.data = data;
		}
		
		protected Node(int data, Node next) {
			this.next = next;
			this.data = data;
		}
		
	}
}
