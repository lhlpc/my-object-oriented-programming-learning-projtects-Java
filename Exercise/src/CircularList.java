
public class CircularList {

		private Node front;
		private int length;
		
		public CircularList(){
			this.front = front;
			this.length = 0;
		}
		
		public CircularList(int data){
			this.front = new Node(data, front);
			this.length = 1;
		}
		
		public void insertInTheFront(int data){
			
			if(this.front==null){
				front = new Node(data, front);
				return;
			}
			if(length==1){
				front.next = new Node(front.data, front);
				front.data = data;
			}
			
			else{
				Node newNode = new Node(front.data, front.next);
				this.front.next = newNode;
				this.front.data = data;
			}
			length++;
		}
		
		public void print(){
			Node auxiliar = front;
			for(int i=0; i<7; i++){
				System.out.println(auxiliar.data);
				auxiliar = auxiliar.next;
			}
		}
		
		
		@Override
		public String toString(){
			if(front == null){
				return null;
			}
			if(length==1)
				return new Integer(front.data).toString();
			
			return print(front);
		}
		
		private String print(Node current){
			if(current.next==front){
				return new Integer(current.data).toString();
			}
			return current.data + " " + print(current.next);
			
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
