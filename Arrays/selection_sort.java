import java.util.Arrays;

public class selection_sort {
	static void sort(int arr[],int n) {
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				   int temp;
					temp=arr[min];
				    arr[min]=arr[i];
				    arr[i]=temp;
				}
			}
		}
	}
public static void main(String[] args) {
	int arr[]= {12,5,13,44,6,0};
	sort(arr, arr.length);				
	System.out.println(Arrays.toString(arr));
}
}
