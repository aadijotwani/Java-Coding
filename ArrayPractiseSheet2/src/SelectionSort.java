
public class SelectionSort 
{
	public static void main(String[] args)
	{
		//           i     
		int[] arr = {7, 8, 10, 5, 2, 4};
		for(int i=0; i<arr.length-1; i++)
		{
			int min = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			//System.out.println(min+"\n");
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
