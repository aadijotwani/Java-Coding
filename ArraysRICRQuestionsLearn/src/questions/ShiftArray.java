package questions;

public class ShiftArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int temp = arr[arr.length-1];
		
		for(int i=1; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];	
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
