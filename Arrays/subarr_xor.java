import java.util.HashMap;

public class subarr_xor {
	static int subarr_xor(int []arr,int k) {
		HashMap<Integer, Integer> hm=new HashMap();  //HashMap to store the prefix_xor along with their number of occurences
		int count=0;   //Total subarrays with xor k(answer)
		int xor=0;  //variable to store prefix_xor
		
		//Looping through the array
		
		for(int i:arr) {
			//calculating prefix xor
			xor^=i;
			//if prefix xor equals k then increase count
			if(xor==k) {
				count++;
			}
			//also if the xor of prefix_xor till that point and k exists then add the occurences of that xor as
			//that also signifies subarrays with xor k 
			if(hm.containsKey(xor^k)) {
				count+=hm.get(xor^k);
			}
			//this part for inserting value in hashmap
			//if hashmap contains xor then update val+1 to the value already in hashmap
			if(hm.containsKey(xor)) {
				hm.put(xor, hm.get(xor)+1);
			}
			//else put xor,1 in map
			else {
				hm.put(xor, 1);
			}
			
		}
		
		return count;
	}
 public static void main(String[] args) {
	int[] arr= {5, 6, 7, 8, 9};
	int k=5;
	System.out.println(subarr_xor(arr, k));
}
}
