
//Program to find the ceiling and floor of the target number using binary search

public class ceil_floor {
	
	//for finding the floor of the target number(<=)
	
	static int floor(int[] arr,int n,int x) {
		
	//for solving the question we will just use binary search but if we dont find the number 
	//we will return end which after violation of while loop end will point to the next smallest number after target
	//if number is less than the lowest number that is first index number we will return -1	
		
		int start=0;
		int end=arr.length-1;
		 if (x < arr[0]) {
	            return -1;
	        }
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				start=mid+1;
			}
			else if(arr[mid]>x) {
				end=mid-1;
			}
		}
			return end;
	}
	//for finding the ceil of the target number(>=)
	
	static int ceil(int[] arr,int n,int x) {
		
		//for solving the question we will just use binary search but if we dont find the number 
		//we will return end which after violation of while loop start will point to the next greatest number after target
		//if number is less than the lowest number that is first index number we will return -1	
		
		int start=0;
		int end=arr.length-1;
		 if (x > arr[arr.length - 1]) {
	            return -1;
	        }
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]<x) {
				start=mid+1;
			}
			else if(arr[mid]>x) {
				end=mid-1;
			}
		}
		
		return start;
	}
 public static void main(String[] args) {
	int [] arr= {2, 3, 5, 9, 14, 16, 18};
	int x=15;
	System.out.println(ceil(arr,arr.length-1,x));
	System.out.println(floor(arr,arr.length-1,x));
}
}
