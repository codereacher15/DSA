import java.util.Arrays;

public class merge_sort {
	
   static void merge(int arr[],int l,int m,int r) {
	   
	 int n1=m-l+1;
	 int n2=r-m;
	 int L[]=new int[n1];
	 int R[]=new int[n2];
	 
	 for (int i = 0; i < n1; i++) {
		L[i]=arr[i+l];
	}
	 for (int j = 0; j < n2; j++) {
		R[j]=arr[j+m+1];
	}
	 int i=0,j=0,k=l;
	 while(i<n1 && j<n2) {
		 if(L[i]<=R[j]) {
			 arr[k++]=L[i];
			 i++;
		 }
		 else {
			 arr[k++]=R[j];
			 j++;
		 }}
	 while(i<n1) {
		 arr[k]=L[i];
		 i++;
		 k++;
	 }
	 while(j<n2) {
		 arr[k]=R[j];
		 j++;
		 k++;
	 }
		 
	}
  
	static void sort(int arr[],int l,int r) {
		if(l<r) {
			int m=l+(r-l)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	public static void main(String[] args) {
	int arr[]= {12,5,13,44,6,0};
	sort(arr, 0, arr.length-1);				
	System.out.println(Arrays.toString(arr));
}
}
