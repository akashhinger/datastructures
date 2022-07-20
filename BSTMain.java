

public class BSTMain {
	public static void main(String[] args) {
		BST bst= new BST();
		for(int i =0;i<10;i++) 
		{
		   	bst.insert(i);
		}
		bst.inorder();
		System.out.println("\nMinimum "+bst.minValue());
		bst.deletekey(5);

		bst.inorder();
		bst.height();
	}
}
