package pack2;

public class NearestSmallestNumber 
{
	public static void Check(int[] arr, int num)
	{
		System.out.println("Original Array ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println("\n");
		//	To check the nearest smallest number hereby we will solve the code accordingly
		int[] newarr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
			//System.out.print(newarr[i]+", ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			newarr[i] = arr[i] - num;
			//System.out.print(arr[i]+", ");
			System.out.print(newarr[i]+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,22,3,56,12,76,34,27,26};
		int num = 12;
		Check(arr, num);		
	}

}
