//to find the max path between two arrays 

public class max_path {
	
	public static void main(String[] args) {
		int arr1[]= {2,3,7,10,12};
		int arr2[]= {1,5,7,8};
		int m=arr1.length;
		int n=arr2.length;
		int i=0,j=0,sum1=0,sum2=0,max=0;
		
    //We will loop till one or both the pointers reach the end
		while(i<m && j<n) {
			////if element pointed by i is lesser than pointed by j 
			if(arr1[i]<arr2[j]) { 
				sum1+=arr1[i];//add the value of arr1[i] to sum1
				i++;//increment i
			}
			//if element pointed by j is lesser than to pointed by i
			else if(arr1[i]>arr2[j]) {
				sum2+=arr2[j];//add the value of arr2[j] to sum2
				j++;//increment j
			}
			//if both are equal 
			else {
				max+=Math.max(sum1, sum2);//add max of sum1 and sum2 to max
				sum1=0;sum2=0;//reset both to 0 for the next half
				//while both are equal add value to max and increment both
				while(i<m && j<n && arr1[i]==arr2[j]) {
					max+=arr1[i];
					i++;
					j++;
				}
			}
		}	
		//add leftover element from both array and add to sum1 and sum2 resp
		 while(i<m) {
			 sum1+=arr1[i];
			 i++;
		 }
		 while(j<n) {
			 sum2+=arr2[j];
			 j++;
		 }
		 //finally add the maximum of both to max
		 max+=Math.max(sum1, sum2);
		 System.out.println(max);
	}
}
