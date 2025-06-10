package number;

public class SquareRoot_Q5 
{
	public static void sqrt(int[] arr)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("square root calculation");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(Math.sqrt(arr[i])+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {4,9,16,25,36,49,64,81};
		sqrt(arr);
	}

}
