package questions;

public class SumAndProduct 
{
	static void Sum(int[] arr1, int[] arr2)
	{
		int[] sum;
		int i;
		
		if(arr1.length >= arr2.length) 
		{
			sum = new int[arr1.length];
			for(i=0; i<arr2.length; i++)
			{
				sum[i] = arr1[i] + arr2[i];
			}
			
			for(int j=i; j<arr1.length; j++)
			{
				sum[j] = arr1[j];
			}
			
		}
		
		else 
		{
			sum = new int[arr2.length];
			for(i=0; i<arr2.length; i++)
			{
				sum[i] = arr1[i] + arr2[i];
			}
			for(int j=i; j<arr1.length; j++)
			{
				sum[j] = arr2[j];
			}
		}
		
		for( i=0; i<sum.length; i++)
		{
			System.out.print(sum[i]+" ");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3};
		
		Sum(arr1, arr2);
	}
}
