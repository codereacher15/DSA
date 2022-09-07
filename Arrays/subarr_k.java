import java.util.HashMap;

//we will use prefix sum and hashmap for this question

public class subarr_k {
	static int max_k(int[] arr,int k) {
		HashMap<Integer, Integer> hm=new HashMap<>();//hashmap to store the sum along with last known position
		int sum=0;int maxi=0;//sum for prefix sum and maxi for longest subarray
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];//calculate prefix sum
			
			//if prefix sum is equals to k
			if(sum==k) {
				maxi=i+1;//maximum length equal to the index number+1
			}
			//if hashmap contains prefix sum -k that means the subarray between must have the value k
			if(hm.containsKey(sum-k)) {
				maxi=Math.max(maxi, i-hm.get(sum-k));//make maxi max of maxi and the length of subarray
			}
			
				hm.put(sum, i);//add sum and its last known position
			
		}
		return maxi;
		
	}
  public static void main(String[] args) {
	int  arr[]= {2,3,5,1,9}, k = 10;
	System.out.println(max_k(arr, k));
}
}
