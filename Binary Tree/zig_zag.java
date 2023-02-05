import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zig_zag {
    static void zig_zag_trav(implement.BTree root) {
    	Queue<implement.BTree> qu=new LinkedList<>();
    	List<Deque<Integer>> zigz=new ArrayList<>();
    	boolean turn=false;
    	qu.offer(root);
    	while(!qu.isEmpty()) {
    		int n=qu.size();
    		Deque<Integer> list=new LinkedList<>();
    		for(int i=0;i<n;i++) {
    			implement.BTree t=qu.poll();
    			if(turn) {
    				list.addFirst(t.data);
    			}
    			else {
    				list.add(t.data);
    			}
    			if(t.left!=null) {
    				qu.add(t.left);
    			}
    			if(t.right!=null) {
    				qu.add(t.right);
    			}
    		}
    		zigz.add(list);
    		turn=!turn;
    	}
    	System.out.println(zigz);
    }
    public static void main(String[] args) {
    	implement.root=new implement.BTree(10,new implement.BTree(20,
	             new implement.BTree(40),new implement.BTree(50)),
	          new implement.BTree(30,
	    		 new implement.BTree(70),new implement.BTree(80)));
	zig_zag_trav(implement.root);
    }
}
