import java.util.HashMap;

public class subarr_zero {
	static int max_zero(int[] arr) {
	  HashMap<Integer, Integer> hm=new HashMap<>();// map for storing prefix sum with index
		int sum=0;//prefix sum
		int maxi=0;//max length of subarray 
		
		//Looping through the array
		
		 for(int i=0;i<arr.length;i++) {
			//calculating prefix sum
			 
			 sum+=arr[i];
			 
			// if prefix sum is 0 update maxi as max of length stored in maxi and the length of new subarray
			 
			 if(sum==0) {
				 maxi=Math.max(maxi, i+1);
			 }
			
			 // if prefix sum already present in map then the subarray after the occurence of that sum must be zero
			 //update maxi as max of length stored in maxi and the length of that subarray
			 
			 if(hm.containsKey(sum)) {
				 maxi=Math.max(maxi, i-hm.get(sum));
				 hm.put(sum, i);
			 }
			 
			//else put xor,index in map
			 
			 else {
				 hm.put(sum, i);
			 }
		 }
		 return maxi;
		
	}
	 public static void main(String[] args) {
	
		 int nums[]=  {1,3,-5,6,-2};
		 System.out.println(max_zero(nums));
  
	 }
	 }

