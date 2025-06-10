package pack2;
public class ArraySumDif
{
	public static void Sum(int[] arr1, int[] arr2)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println("\n");
		
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+", ");
		}
		
		int x = 0;
		int y = 0;
		if(arr1.length >= arr2.length)
		{
			x = arr2.length;
			y = arr1.length;
		}
		else if(arr2.length > arr1.length)
		{
			x = arr1.length;
			y = arr2.length;
		}	
		System.out.println("\n");
		System.out.print("Sum of both arrays is ");
		
		int count =0;
		
		for(int i=x; i<y; i++)
		{
			if(arr1.length >= arr2.length)
			{
			count = arr1.length;
			}
			else if(arr2.length > arr1.length)
			{
			count = arr2.length;
			}
		}
		
		int[] arr3 = new int[count];
		
		
		for(int i=0; i<x; i++)
		{
			arr3[i] = arr1[i]+arr2[i];
		}
		for(int i=x; i<y; i++)
		{
			if(arr1.length >= arr2.length)
			{
				arr3[i] = arr1[i];
			}
			
			else if(arr2.length > arr1.length)
			{
			arr3[i] = arr2[i];
			}
		}
		System.out.print("Sum of both arrays is : ");
		for(int i=0; i<arr3.length; i++)
		{
			System.out.print(arr3[i]+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4}; 
		int[] arr2 = {1,2,3,4,5};
		Sum(arr1, arr2);
	}
}
