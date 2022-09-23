import java.util.Arrays;

public class valuesort {

	public static void main(String[] args) {
		int[] arr= {5,6,4,2,1};
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			while(arr[start]<=4) {
				start++;
			}
			while(arr[end]>=4) {
				end--;
			}
			if(start<end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
