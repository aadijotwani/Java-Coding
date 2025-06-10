package pack2;

public class Sorting 
{
	public static void ArraySort(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		int size = arr.length;
		int[] newarr = new int[size];
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		System.out.println("Sorted Array is : ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]>=arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,-1,3,8,4,2};
		ArraySort(arr);
	}

}
