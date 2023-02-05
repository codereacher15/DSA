import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class boundary_trav {
	static boolean isleaf(implement.BTree node) {
		return node.right== null && node.left==null;		
	}
	static void addleft(implement.BTree node, ArrayList<Integer> arr) {
		implement.BTree t=node.left;
		while(t!=null) {
			if(!isleaf(t)) arr.add(node.data);
			if(t.left!=null) t=t.left;
			else t=t.right;
		}
	}
static void addright(implement.BTree node, ArrayList<Integer> arr) {
	Stack<Integer> stk=new Stack<>();
	implement.BTree t=node.right;
	while(t!=null) {
		if(!isleaf(t)) stk.add(node.data);
		if(t.right!=null) t=t.right;
		else t=t.left;
	}
	while(!stk.isEmpty()) {
		arr.add(stk.pop());
	}
	}
static void addleaves(implement.BTree node, ArrayList<Integer> arr) {
	if(isleaf(node)) {
		arr.add(node.data);
		return;
	}
	if(node.left!=null) addleaves(node.left, arr);
	if(node.left!=null) addleaves(node.right, arr);
}
	static void boundary(implement.BTree node, ArrayList<Integer> arr) {
		addleft(node,arr);
		addleaves(node,arr);
		addright(node,arr);
	}
public static void main(String[] args) {
	implement.root=new implement.BTree(10,new implement.BTree(20,
            new implement.BTree(40),new implement.BTree(50)),
         new implement.BTree(30,
   		 new implement.BTree(70),new implement.BTree(80)));
	ArrayList<Integer> li=new ArrayList<>();
	boundary(implement.root, li);
	System.out.println(li);
	
}
}
