package arrays;

import java.util.HashSet;

public class MergingTwoArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,5,6};
		int arr2[]= {6,7,8,9,9};
		HashSet<Integer> hs=new HashSet<>(); 
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++) {
			hs.add(arr2[j]);
		}
		for(int n:hs) {
			System.out.print  (n+" ");
		}

	}

}
