package arrays;

public class AppeaersOne {

	public static void main(String[] args) {
		int arr[]= {2,1,3,4,5,6,5,4,3,1,3};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
			
		}

	}

}
