public class diameter {
	static int max_depth(implement.BTree root,int maxi[]) {
		  if(root==null) {
			   return 0;
		   }
		   int lh= max_depth(root.left,maxi);
		   int rh= max_depth(root.right,maxi);
		   
		   maxi[0]=Math.max(maxi[0], rh+lh);
		   
		   return 1+Math.max(lh,rh);
	   }
		public static void main(String[] args) {
			implement.root=new implement.BTree(10,new implement.BTree(20,
		             new implement.BTree(40),new implement.BTree(50)),
		          new implement.BTree(30,
		    		 new implement.BTree(70),new implement.BTree(80)));
			 int maxi[]= {0};
			 max_depth(implement.root, maxi);
			 System.out.println(maxi[0]);
	}
}
