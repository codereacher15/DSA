import java.util.Arrays;

// the goal is to push all the zeroes to the end of the array
//We will use two pointer approach

public class move_zeroes {
	//method to swap two numbers
	static void swap(int arr[],int i,int j) {
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	static void modify(int arr[],int n) {
		//to find the first occurence of zero 
		int pos=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==0) {
				pos=i;
				break;
			}
		}
		//looping from the end to the position and swapping all non zero occurences at j
		for(int j=n-1;j>=pos;j--) {
			if(arr[j]!=0) {
				swap(arr, pos, j);
				pos++;
			}
		}
	}
 public static void main(String[] args) {
	int[] arr= { 0 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
	int n=arr.length;
	modify(arr, n);
	System.out.println(Arrays.toString(arr));
}
}
