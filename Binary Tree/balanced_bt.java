public class balanced_bt {
  static boolean check_balanced(implement.BTree node) {
	  return max_depth(node)!=-1;
  }
  static int max_depth(implement.BTree root) {
	   if(root==null) {
		   return 0;
	   }
	   int lh= max_depth(root.left);
	   if(lh == -1) return -1;
	   int rh= max_depth(root.right);
	   if(rh == -1) return -1;
	   if(Math.abs(lh-rh)>1) return -1;
	   return 1+Math.max(lh,rh);
  }
public static void main(String[] args) {
	implement.root=new implement.BTree(10,new implement.BTree(20,
            new implement.BTree(40),new implement.BTree(50)),
                            null);
	System.out.println(check_balanced(implement.root));
}
}
