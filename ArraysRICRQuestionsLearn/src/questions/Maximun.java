package questions;

public class Maximun 
{
	static int[] arr = {4,5,3,2,9};
	public static int mincount = arr[0],maxcount = arr[0];
	
	static 
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] >= maxcount)
			{
				maxcount = arr[i];
			}				
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] <= mincount)
			{
				mincount = arr[i];
			}
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println(maxcount);
	}

}
