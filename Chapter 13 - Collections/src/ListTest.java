
public class ListTest {

	public static void main(String[] args) {
		
		Node n = new Node(5);
		n = new Node(27, n);
		n = new Node(9, n);
		n = new Node(3, n);
		n = new Node(17, n);

		Node p = n;
		while(p!=null){
			System.out.println(p.getInfo() + " ");
			p = p.getNext();			
		}
		
		Node newn = new Node(20);
		
		p = n;
		while (p.getInfo()!=9){
			p=p.getNext();
		}
		
		newn.setNext(p.getNext());
		p.setNext(newn);
		
		System.out.println();
		p=n;
		while(p!=null){
			System.out.println(p.getInfo() + " ");
			p = p.getNext();			
		}
		
	}

}
