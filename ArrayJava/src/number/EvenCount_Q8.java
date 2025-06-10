package number;
public class EvenCount_Q8 
{
	public static void Count(int[] arr)
	{
		int count = 0;
		
		System.out.println("Original array");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("No. of even elements in an array are "+count);
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Count(arr);

	}

}
