//return the only single occurring element in the array using binary search

public class single_sorted {
	 public static int singleNonDuplicate(int[] arr) {
	        int start=0;
	        int end=arr.length-1;
	       int n = arr.length;
	    if(n == 1)return arr[0];
	    
	    //boundary check-if the first or last element is the unique element
	    
	        if(arr[start]!=arr[start+1] || arr[end]!=arr[end-1]){
	            return arr[start]!=arr[start+1]?arr[start]:arr[end];
	        }
	    //binary search
	        
	        while(start<=end){
	            int mid=start+(end-start)/2;
	        //if middle is the unique element return it
	            
	            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
	                 return arr[mid];
	             }
	            else{
	            	
	            	//index check: before appearance of the unique element all the other element will be
	            	//first occurrence - even position , second occurrence - odd position
	            	//after occurrence the position will reverse
	            	//we will use that logic to build the cases
	            	
	                if(arr[mid]==arr[mid+1]){
	                 if(mid%2==0){
	                     start=mid+1;
	                 }
	                else{
	                    end=mid-1;
	                }}
	                else if(arr[mid]==arr[mid-1]){
	                 if(mid%2==0){
	                     end=mid-1;
	                     
	                 }
	                else{
	                    start=mid+1;
	                }
	                }
	            }
	        }
	        
	        return -1;
	    }
 public static void main(String[] args) {
	int[] arr= {1,1,2,3,3,4,4,8,8};
	System.out.println(singleNonDuplicate(arr));
	
}
}
