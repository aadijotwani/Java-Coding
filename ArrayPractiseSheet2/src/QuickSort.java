public class QuickSort 
{
	public static void creation()
	{
		int[] arr = {19, 17, 15, 12, 16, 18, 4, 11, 13};
		int pivot = arr[arr.length-1];
		Iterate(arr, pivot);
	}
	
	public static void Iterate(int[] arr, int p)
	{
		int i=-1;
		for(int j=0; j<arr.length; j++)
		{
			if(arr[j]<p)
			{
				i++;
				int temp = arr[j];
				arr[j] = arr[i]; 
				arr[i] = temp;
			}
			
			else if(arr[j] == p)
			{
				int temp = arr[j];
				arr[j] = arr[i+1]; 
				arr[i+1] = temp;
			}
	
		}
		
		for(int j=0; i<arr.length; i++)
		{
			System.out.print(arr[j]+" ");
		}
	}

	public static void main(String[] args) 
	{
		creation();
	}

}
