package pack1;


public class MultipleArray 
{
	public static int Max(int[] arr)
	{
		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >= count)
			{
				count = arr[i];
			}
		}
		return count;
	}
	
	public static int Min(int[] arr)
	{
		int count = 1000;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] < count)
			{
				count = arr[i];
			}
		}
		return count;
	}
	
	public static void span(int[] arr)
	{
		System.out.println("Difference between the max and min values is "+(Max(arr) - Min(arr)));
	}
	
	public static void even(int[] arr)
	{
		System.out.println("Even Array is :");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+", ");
			}
			
			else 
			{
				continue;
			}
		}
	}
	
	public static void odd(int[] arr)
	{
		System.out.println("Even Array is :");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+", ");
			}
			
			else 
			{
				continue;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Largest Number is "+Max(arr));
		System.out.println();
		System.out.println("Smallest Number is "+Min(arr));
		System.out.println();
		span(arr);
		System.out.println("\n");
		even(arr);
		System.out.println("\n");
		odd(arr);
		
		
	}

}
