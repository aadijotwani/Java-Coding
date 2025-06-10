package number;

public class EvenOdd_Q3 
{
	public static void evenodd(int[] arr)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Even Array");
		for(int i=0; i<arr.length; i++)
		{
			
			if(i%2==0)
			{
				System.out.print(arr[i]+", ");
			}
		}
		
		System.out.println("\n");
		
		System.out.println("Odd Array");
		for(int i=0; i<arr.length; i++)
		{
			
			if(i%2!=0)
			{
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		evenodd(arr);
	}

}
