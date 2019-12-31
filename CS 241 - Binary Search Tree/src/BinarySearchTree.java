/**
 * @author Luiz Henrique Leite Paes da Costa
 * @version 1.0
 * 
 *          This class represents a Binary Search Tree (BST) and its basic
 *          operations.
 * 
 * */
public class BinarySearchTree {

	private BSTNode root;
	private int numNodes;

	// -------------Constructors-------------
	/**
	 * Creates an empty Binary Search Tree.
	 */
	public BinarySearchTree() {
		this.root = null;
		this.numNodes = 0;
	}

	public BinarySearchTree(Comparable data) {
		this.root = new BSTNode(data);
		this.numNodes = 1;
	}

	// ------------Public Methods----------
	/**
	 * Insert the given element in the BST.
	 * */
	public void insert(Comparable data) {
		root = internInsert(this.root, data);
		numNodes++;
	}

	/**
	 * Prints the BST as a sequence of ordered numbers in one line
	 * */
	public void print() {
		printInOrder(this.root);
	}

	/**
	 * Removes the given item. If the given value is on the BST, it delete the
	 * item and returns true. Otherwise, it returns false.
	 */
	public boolean remove(Comparable data) {
		if (removeItem(this.root, data) != null){
			numNodes--;
			return true;
		}
		else
			return false;
	}

	
	/**
	 * Returns the number of nodes of the BST.
	 * */
	public int getNumNodes(){
		return this.numNodes;
	}
	
	/**
	 * Remove all items of the BST.
	 * */
	public void clear(){
		this.root = null;
	}
	
	/**
	 * Returns the data with the greatest value in the tree.
	 * */
	public Comparable getMax() {
		BSTNode max = getMax(this.root);
		if (max != null)
			return max.data;
		else
			return null;
	}
	
	/**
	 * Returns the data with the minimum value in tree.
	 * */
	public Comparable getMin(){
		BSTNode answer  = getMin(this.root);
		if(answer == null)
			return null;
		else
			return answer.data;
	}

	// -----------------------------------------------------------------------
	// -------------------------Private Part---------------------------------
	// -----------------------------------------------------------------------
	private BSTNode removeItem(BSTNode root, Comparable data) {
		if (root == null)// If the root of the tree is null or the data is not
							// found and a leaf is reached, the value is not
							// there.
			return null;
		else {
			if (root.data.compareTo(data) > 0) { // if the data in the current
													// node is bigger than the
													// searched data, remove
													// this
													// item in the left subtree
													// and
													// assign the left pointer
													// to
													// the new tree (with the
													// deleted item)
				root.setLeft(removeItem(root.left, data));
				return root;
			}

			if (root.data.compareTo(data) < 0) {// if the data in the current
												// node
												// is less than the searched
												// data, remove this item in the
												// right subtree and assign the
												// right pointer to the new tree
												// (with the deleted item)
				root.setRight(removeItem(root.right, data));
				return root;
			} else { // If the data is found (equal to the current root)
				if (root.left == null) // If the left child is null, assign the
										// left node of the parent of the
										// current node to be point to the left
										// child of the current node. Even if
										// the right children of the current
										// node is null (which makes the current
										// node a leaf, as the left and right
										// children are null)
					return root.right;

				if (root.right == null)// Same as before the previous condition,
										// but with the right node being
					return root.left;
				else {// If the current node has two children
					root.data = getMax(root.left).data; // Assign to the current
														// node the data of the
														// maximum element in
														// the left subtree

					root.left = deleteMax(root.left);
					return root;
				}
			}
		}
	}

	/*
	 * Returns the root node of a given BST with its maximum value deleted
	 */
	private BSTNode deleteMax(BSTNode root) {
		if (root == null)
			return null;
		if (root.right == null)
			return root.left;
		root.setRight(deleteMax(root.right));
		return root;
	}

	/*
	 * Returns the maximum value in the tree given.
	 */
	private BSTNode getMax(BSTNode root) {
		if (root == null)
			return null;
		if (root.right == null)
			return root;
		else
			return getMax(root.right);
	}
	
	/*
	 * Returns the node with the less value in the BST.
	 * */
	private BSTNode getMin(BSTNode root){
		if(root==null)
			return null;
		if(root.left==null)
			return root;
		else{
			return getMin(root.left);
		}
			
	}

	/*
	 * Print the tree of the given root node In Order - Current node, then left
	 * subtree, then right subtree Used by the print method to print the values
	 * in the BST in order.
	 */
	
	private void printInOrder(BSTNode root){
		if(root==null){
			return;
		}
		else{
			printInOrder(root.left);
			System.out.println(root.data + " ");
			printInOrder(root.right);
		}
		
	}
	/*Alternative solution*/
	/*private void printInOrder(BSTNode root) {
		if (root.isLeaf())
			System.out.print(root.data + " ");
		else {
			if (root.left != null)
				printInOrder(root.left);
			System.out.print(root.data + " ");
			if (root.right != null)
				printInOrder(root.right);
			;
		}
	}*/
	

	/*
	 * Insert a given element in the given root of a BST. It's just used to
	 * assist the public insert method.
	 */
	private BSTNode internInsert(BSTNode root, Comparable data) {
		if (root == null)
			return new BSTNode(data);
		if (root.data.compareTo(data) >= 0)
			root.left = internInsert(root.left, data);
		else
			root.right = internInsert(root.right, data);
		return root;
	}

	// --------------Private Class------------------------------------------
	/*
	 * It represents a Binary Search Tree node, which contain a data, a
	 * reference to its left child and another reference for its right child.
	 */

	private class BSTNode {
		private Comparable data;
		private BSTNode right;
		private BSTNode left;

		/*
		 * Create a BSTNode with the value given in arguments
		 */
		protected BSTNode(Comparable data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}

		/*
		 * @return the data
		 */
		protected Comparable getData() {
			return data;
		}

		/*
		 * @param data the data to set
		 */
		protected void setData(Comparable data) {
			this.data = data;
		}

		/**
		 * @return the right
		 */
		protected BSTNode getRight() {
			return right;
		}

		/*
		 * @param right the right to set
		 */
		protected void setRight(BSTNode right) {
			this.right = right;
		}

		/*
		 * @return the left
		 */
		protected BSTNode getLeft() {
			return left;
		}

		/*
		 * @param left the left to set
		 */
		protected void setLeft(BSTNode left) {
			this.left = left;
		}

		// ------------isLeaf-------
		protected boolean isLeaf() {
			if (this.right == null && this.left == null)
				return true;
			else
				return false;
		}

	}
}
