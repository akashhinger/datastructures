public class BST {
	public class Node{
		Node left,right;
		int data;
		
		Node(int key){
			left = null;
			right = null;
			data = key;
		}
	}
	Node root;
	BST()
	{
		root = null;
	}
	void insert(int key) {
		root = insertrec(root,key);
	}
	public Node insertrec(Node root, int key) {
		if(root==null) {
			root = new Node(key);
			return root;
		}
		if(root.data<key)
			root.right = insertrec(root.right,key);
		if(root.data>key)
			root.left=insertrec(root.left,key);
		return root;
	}
	void inorder() {
		inorderrec(root);
	}
	void inorderrec(BST.Node root) {
		// TODO Auto-generated method stub
		if (root!=null) {
			inorderrec(root.left);
			System.out.println(root.data);
			inorderrec(root.right);
		}
	}
	public void deletekey(int key) {
		root = deleteRec(root,key);
	}
	public Node deleteRec(Node root,int key) {
		if(root==null)
			return root;
		if(root.data<key){
			root.right=deleteRec(root.right,key);
			}
		else if(root.data>key){
			root.left=deleteRec(root.left,key);
			}
		else
		{
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
		root.data=minValue();
		root.right=deleteRec(root.right,root.data);
		}
		return root;
	}
	int minValue() {
		int min=root.data;
		while(root.left!=null) {
			min=root.left.data;
			root= root.left;
		}
		return min;
	}
	void height() {
		
		System.out.println("height: "+heightrec(root));
		
	}
	private int heightrec(BST.Node root) {
		// TODO Auto-generated method stub
		if(root==null)
			return 1;
		int lheight=heightrec(root.left);
		int rheight=heightrec(root.right);
		
		return Math.max(lheight, rheight)+1;
	}
	public void count() {
		System.out.println("Number of nodes: " + countrec(root));
	}
	private int countrec(BST.Node root) {
		// TODO Auto-generated method stub
		int x=0,y=0;
		if(root!=null) {
			x=countrec(root.left);
			y=countrec(root.right);
			if(root.left==null&&root.right==null)
			return x+y+1;
			else return x+y;
		}
		return 0;
	}
	
}
