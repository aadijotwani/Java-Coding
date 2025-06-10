package number;

public class EvenProduct 
{
	public static void product(int[] arr)
	{
		int count = 1;
		System.out.println("original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
//		System.out.println("Product of all even numbers is");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				count *= arr[i];
			}
		}
		System.out.println("Product of all even elements is equal to "+ count);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		product(arr);
	}
}