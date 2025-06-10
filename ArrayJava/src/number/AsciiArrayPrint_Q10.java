package number;

public class AsciiArrayPrint_Q10 
{
	public static void InttoChar(int[] arr)
	{
		System.out.println("Original Array is :");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("After converting from Integer to Chrecter New Array is : ");
		for(int i=0; i<arr.length; i++)
		{
			int z = arr[i];
			char temp = (char)z;
			System.out.print(temp+", ");
		}	
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		InttoChar(arr);
	}

}
