package number;

public class EvenSum_Q6 
{
	public static void sum(int[] arr)
	{
		int count = 0;
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Sum of even elements");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				count += arr[i];
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		sum(arr);
	}
}
