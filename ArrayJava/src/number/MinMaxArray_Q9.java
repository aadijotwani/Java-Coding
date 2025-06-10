package number;

public class MinMaxArray_Q9 
{
	public static void Max(int[] arr)
	{
		int count = 0;
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("To check the largest element in the array");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > count)
			{
				count = arr[i];
			}
			else 
			{
				continue;
			}
		}
		System.out.println("\n"+"Largest elemnt in the array is "+count);
	}
	
	public static void Min(int[] arr)
	{
		int count = 99;
		System.out.println("To check the Smallest element in the array");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < count)
			{
				count = arr[i];
			}
			else 
			{
				continue;
			}
		}
		System.out.println("\n"+"Smallest element in the array is "+count);
	}

	public static void main(String[] args)
	{
		int[] arr = {18,25,13,24,57,64,74,68,99};
		Max(arr);
		System.out.println();
		Min(arr);
	}
}
