import java.util.ArrayList;

//We will use two pointer method to find both union and intersection

public class union_intersection {
	//Union
	static ArrayList<Integer> FindUnion(int[] arr1,int[] arr2,int n,int m){
		 ArrayList<Integer> Union=new ArrayList<>();
		int i=0;int j=0;
		//We will loop till one or both the pointers reach the end
		while(i<n && j<m) {
			//if element pointed by i is lesser than pointed by j
			
			if(arr1[i]<arr2[j]) {
				//then if the union is empty or the last element present at list is not equal to present
				//element at i then add it into the list
				if(Union.size()==0 || Union.get(Union.size()-1)!=arr1[i]) 
					Union.add(arr1[i]);
			i++;//else just increase i
			}
			//if element pointed by j is lesser than or equal to pointed by i
			else {
				//then if the union is empty or the last element present at list is not equal to present
				//element at j then add it into the list
				if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j]) 
					Union.add(arr2[j]);
				j++;//else just increase j
	       }
			}
		//inserting any leftover elements
		while(i<n) {
			if(Union.size()==0 || Union.get(Union.size()-1)!=arr1[i]) 
				Union.add(arr1[i]);
				i++;	
		}
		while(j<m) {
			if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j]) 
				Union.add(arr2[j]);
				j++;
		}
		return Union;
	}
	//Intersection
	static ArrayList<Integer> FindInter(int[] arr1,int[] arr2,int n,int m){
		 ArrayList<Integer> Inter=new ArrayList<>();
		 int i=0;
		 int j=0;
		 
		//We will loop till one or both the pointers reach the end
	while(i<n && j<m) {
		
		//if element pointed by i is lesser than to pointed by j
		if(arr1[i]<arr2[j]) {
			
			i++;//increase i as the array is sorted so it will move closer till equal to j
		}
		//if element pointed by j is lesser than to pointed by i
		else if(arr1[i]>arr2[j]) {
			
			j++;//increase j as the array is sorted so it will move closer till equal to i
		}
		else {
			//if both are equal then add any one to the list and increment both
			Inter.add(arr1[i]);
			i++;
			j++;
		}
	}
	return Inter;
	}
 public static void main(String[] args) {
	 int n = 10, m = 7;
	  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
	  ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
	  ArrayList<Integer> Inter = FindInter(arr1, arr2, n, m);
	  System.out.println("Union-"+Union);
	  System.out.println("Inter-"+Inter);
}
}
