public class max_depth_class {
   static int max_depth(implement.BTree root) {
	   if(root.left==null && root.right==null) {
		   return 0;
	   }
	   return 1+Math.max( max_depth(root.left),max_depth(root.right));
   }
	public static void main(String[] args) {
		implement.root=new implement.BTree(10,new implement.BTree(20,
	             new implement.BTree(40),new implement.BTree(50)),
	          new implement.BTree(30,
	    		 new implement.BTree(70),new implement.BTree(80)));
		System.out.println(max_depth(implement.root));
}
}
