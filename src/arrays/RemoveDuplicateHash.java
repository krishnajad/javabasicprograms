package arrays;

import java.util.HashSet;

public class RemoveDuplicateHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,6,5,7,5,3,2,1};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		for(int n:hs) {
			System.out.print(n+" ");
		}

	}

}
   