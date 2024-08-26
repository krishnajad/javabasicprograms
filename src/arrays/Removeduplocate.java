package arrays;

public class Removeduplocate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5,1, 2, 3,  4, 5, 5, 6 ,31};
		int temp[] = new int[arr.length];
		int j = 0;
		for(int k=0;k<arr.length;k++) {
			for(int l=k+1;l<arr.length;l++) {
				int stemp=arr[k];
				arr[k]=arr[l];
				arr[l]=stemp;
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
				
			}
		}
		// TODO Auto-generated method stub
		for(int k=0;k<temp.length;k++) {
			System.out.print(temp[k]+" ");
		}

	}

}
