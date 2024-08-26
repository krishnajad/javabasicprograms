package arrays;

import java.util.Iterator;

public class Second_largest {

	public static void main(String[] args) {
		int arr[]= {2,6,4,1,8,8,9,6};
		int max=0;
		int secmax=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]>max)
			{
				secmax=max;
				max=arr[k];
			}
		}
		//System.out.print(arr[k]+" ");
		System.out.println("The largest element is - "+max);
		
		System.out.print("The secondlargest element is - "+secmax);
		
		

	}

}
