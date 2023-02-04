public class traversal{
   static void preorder(implement.BTree node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	static void inorder(implement.BTree node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
  static void postorder(implement.BTree node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
    System.out.print(node.data+" ");
    
   public static void main(String[] args) {
	   
     implement.root=new implement.BTree(10,new implement.BTree(20,
	             new implement.BTree(40),new implement.BTree(50)),
	          new implement.BTree(30,
	    		 new implement.BTree(70),new implement.BTree(80)));
	  postorder2(implement.root);
	}
