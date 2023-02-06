import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class vertical_order {
	static class Triple{
		implement.BTree node;
		int level;//row
		int vertical;//col
		Triple(implement.BTree node,int l,int v){
			this.node=node;
			level=l;
			vertical=v;	
			
		}
	}
     
	static List<List<Integer>> vertical_trav(implement.BTree node) {
		TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map=new TreeMap<>();
		Queue<Triple> qu=new LinkedList<>();
		qu.offer(new Triple(node, 0, 0));
		while(!qu.isEmpty()) {
			Triple n=qu.poll();
			int l=n.level;//row
			int v=n.vertical;//col
			implement.BTree nod=n.node;
			
			if(!map.containsKey(l)) {
				map.put(l, new TreeMap<>());
			}
			if(!map.get(l).containsKey(v)) {
				map.get(l).put(v, new PriorityQueue<>());
			}
			map.get(l).get(v).offer(nod.data);
			
			if(nod.left!=null) {
				qu.offer(new Triple(nod.left,l-1,v+1 ));
			}
			if(nod.right!=null) {
				qu.offer(new Triple(nod.right, l+1, v+1));
			}
		}
		List<List<Integer>> li=new ArrayList<>();
		for(TreeMap<Integer, PriorityQueue<Integer>> ys:map.values()) {
			li.add(new ArrayList<>());
			for(PriorityQueue<Integer> p:ys.values()) {
				while(!p.isEmpty()) {
					
					li.get(li.size()-1).add(p.poll());
				}
			}
		}
		return li;
	}
	
	
	 public static void main(String[] args) {
			implement.root=new implement.BTree(10,new implement.BTree(20,
		             new implement.BTree(40),new implement.BTree(50)),
		          new implement.BTree(30,
		    		 new implement.BTree(70),new implement.BTree(80)));
			System.out.println(vertical_trav(implement.root));
			
}
}
