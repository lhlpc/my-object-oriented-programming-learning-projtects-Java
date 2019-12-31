
public class Main {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new Integer(10));
		tree.insert(11);
		tree.insert(1);
		tree.insert(5);
		tree.insert(50);
		
		tree.print();
		
		tree.remove(1);
		System.out.println();
		tree.print();
		
		System.out.println("\n" + tree.getMax());

		System.out.println("Maximum: " + tree.getMax() + "\nMinimum: " + tree.getMin() + "\nNumber of nodes: " + tree.getNumNodes());
	}

}
