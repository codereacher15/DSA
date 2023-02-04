import java.util.LinkedList;
import java.util.Queue;

public class implement{
	static class BTree{
		int data;
		BTree left;
		BTree right;
		BTree(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
		BTree(int data,BTree left,BTree right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	static BTree root=null;
  
  public static void main(String[] args) {
 
	root=new BTree(10,new BTree(20,
				             new BTree(40),new BTree(50)),
				          new BTree(30,
				    		 new BTree(70),new BTree(80)));
	}
}
