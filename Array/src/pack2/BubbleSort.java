package pack2;

public class BubbleSort 
{
	public static void sort(int[] arr)
	{
		System.out.println("Sorted Array is :");
		for(int i=0; i<arr.length-1; i++)
		{
			boolean flag = false;
			for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp =arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			if(flag == false)
			{
				break;
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {16,17,4,3,5,2};
		sort(arr);
	}

}
