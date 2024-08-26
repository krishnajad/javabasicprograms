package arrays;

public class DisplayDuplicateElement {

	public static void main(String[] args) {
		int arr[]= {4,1,1,2,2,3,3,4,4,56,6,67};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j< arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}

	}

}
