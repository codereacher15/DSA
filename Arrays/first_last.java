import java.util.Arrays;

public class first_last{
	  static int[] searchRange(int arr[], int n, int x) {
	  int[] ans=new int[2];
      ans[0]=firstoccurence(arr, n, x);
      ans[1]=lastoccurence(arr, n, x);
     return ans;
}
	   static int firstoccurence(int arr[], int n, int x) {
		   int pos=-1;
		   int start=0;
		   int end=n;
		   while(start<=end) {
			   int mid=start+(end-start)/2;
			   if(arr[mid]<x) {
				   start=mid+1;
			   }
			   else if(arr[mid]>x) {
				   end=mid-1;
			   }
			   else {
				   pos=mid;
				   end=mid-1;
			   }
		   }
		   return pos;
	   }
	   static int lastoccurence(int arr[], int n, int x) {
		   int pos=-1;
		   int start=0;
		   int end=n;
		   while(start<=end) {
			   int mid=start+(end-start)/2;
			   if(arr[mid]<x) {
				   start=mid+1;
			   }
			   else if(arr[mid]>x) {
				   end=mid-1;
			   }
			   else {
				   pos=mid;
				   start=mid+1;
			   }
		   }
		   return pos;
	   }
public static void main(String[] args){
	int []arr= {5,7,7,8,8,10};
	int x=8;
	System.out.println(Arrays.toString(searchRange(arr,arr.length-1,x)));
}
}
