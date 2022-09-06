//We will not use HashSet instead two pointers approach
//Space Optimised ,most efficient approach

public class remove_duplicate {

	// this function will return the position of array upto which we 
	//have stored the unique elements
  
	static int unique(int[] arr,int n) {
  
		//we will use two pointers 
		//i will track the last unique element position
    
		int i=0;
    
    //j will traverse the array
    
		for (int j = 1; j < arr.length; j++) {
    
    	//each time j encounters a unique element
      
			  if(arr[i]!=arr[j]) {
        
        //we will increment i and store the element at ith position
        
				  i++;	
				  arr[i]=arr[j];
			  }
		}
    
    	//finally return i+1 which is the size of the unique array
      
		return i+1;
	}
  public static void main(String[] args) {
	int []arr={1,1,2,2,2,3,3};
	int n=arr.length;
	int k=unique(arr,n);
	for (int i = 0; i < k; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
