package number;

public class TwoDigit_Q4 
{
	public static void Twodigit(int[] arr)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("2 digit elements only");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>9 && arr[i]<100)
			{
				System.out.print(arr[i]+", ");
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,21,535,249,05,6,73,88,9};
		Twodigit(arr);
	}

}
