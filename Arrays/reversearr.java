public class reversearr {
   static void reverse(int arr[],int n,int i,int j) {
	    if(i>j) {
	    	return;
	    }
	    int t=arr[i];
	    arr[i]=arr[j];
	    arr[j]=t;
	    reverse(arr,n,i+1,j-1);
	    
   }
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	reverse(arr, 6, 0,5);
	for (int j2 = 0; j2 < arr.length; j2++) {
		System.out.print(arr[j2]+" ");
	}
}
}
