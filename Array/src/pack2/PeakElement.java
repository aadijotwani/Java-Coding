package pack2;

public class PeakElement 
{
	public static void Peak(int[] arr)
	{
		//2,8,3,16,32,26,5,67,92
		System.out.println("Peak elements in the array are: ");
		if(arr[0] > arr[1])
		{
			System.out.print(arr[0]+", ");
		}
		
		for(int i=1; i<arr.length-1; i++)
		{
			if(arr[i] > arr[i+1] && arr[i]>arr[i-1])
			{
				System.out.print(arr[i]+", ");
			}
		}
		
		if(arr[arr.length-1] > arr[arr.length-2])
		{
			System.out.print(arr[arr.length-1]);
		}
		
		else if(arr[0] == arr[1] || arr[arr.length-1] > arr[arr.length-2])
		{
			System.out.println("No peak element");
		}  
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {12,8};
		Peak(arr);
	}
 
}
