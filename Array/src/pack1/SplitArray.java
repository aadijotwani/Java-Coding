package pack1;

public class SplitArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int split = arr.length/2;
		System.out.print("First Half Array is ");
		for(int i=0; i<split; i++)
		{
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.print("Second half Array is ");
		for(int i=split;i<arr.length; i++)
		{
			System.out.print(arr[i]+",");
		}
		
	}

}
