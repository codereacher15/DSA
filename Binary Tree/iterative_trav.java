import java.util.ArrayList;
import java.util.Stack;

public class iterative_trav {
	static void preorder(implement.BTree node) {
		Stack<implement.BTree> stk=new Stack<>();
		if (node == null) {
			return;
		}
		stk.push(node);
		while(!stk.isEmpty()) {
			implement.BTree n=stk.pop();
			System.out.print(n.data+" ");
			if(n.right!=null) {
				stk.push(n.right);
			}
			if(n.left!=null) {
				stk.push(n.left);
			}
		}
	}
	static void inorder(implement.BTree node) {
		Stack<implement.BTree> stk=new Stack<>();
		if(node==null) {
			return;
		}
		
		while(true) {
			if(node!=null) {
				stk.push(node);
				node=node.left;
			}
			else {
				if(stk.isEmpty()) {
					break;
				}
				implement.BTree n=stk.pop();
				System.out.print(n.data+" ");
				if(n.right!=null) {
					stk.push(n.right);
				}
						
			}
		}
	}
	static void postorder2(implement.BTree node) {
		Stack<implement.BTree> stk=new Stack<>();
		Stack<implement.BTree> stk2=new Stack<>();
		
		if (node == null) {
			return;
		}
		stk.push(node);
		while(!stk.isEmpty()) {
			implement.BTree n=stk.pop();
			stk2.push(n);
			if(n.right!=null) {
				stk.push(n.right);
			}
			if(n.left!=null) {
				stk.push(n.left);
			}
		}
		while(!stk2.isEmpty()) {
			System.out.print(stk2.pop().data+" ");
		}
		
	}
	static void all_trav(implement.BTree node) {
		Stack<Pair> stk=new Stack<>();
		List<Integer> pre=new ArrayList<>();
		List<Integer> post=new ArrayList<>();
		List<Integer> in=new ArrayList<>();
	    if(node==null) { 
	    	return;
	    }
		stk.push(new Pair(node,1));
	    while(!stk.isEmpty()) {
	    	Pair it=stk.pop();
	    	if(it.second==1) {
	    		pre.add(it.first.data);
	    		it.second++;
	    		stk.push(it);
	    		if(it.first.left!=null) {
	    			stk.push(new Pair(it.first.left,1));
	    		}
	    	}
	    	else if(it.second==2) {
	    		in.add(it.first.data);
	    		it.second++;
	    		stk.push(it);
	    		if(it.first.right!=null) {
	    			stk.push(new Pair(it.first.right,1));
	    		}
	    	}
	    	else if(it.second==3) {
	    		post.add(it.first.data);
	    	}
	    }
	    System.out.println("Preorder :"+pre);
	    System.out.println("PostOrder :"+post);
	    System.out.println("Inorder :"+in);
	}
   public static void main(String[] args) {
	   implement.root=new implement.BTree(10,new implement.BTree(20,
	             new implement.BTree(40),new implement.BTree(50)),
	          new implement.BTree(30,
	    		 new implement.BTree(70),new implement.BTree(80)));
	  postorder2(implement.root);
}
}
