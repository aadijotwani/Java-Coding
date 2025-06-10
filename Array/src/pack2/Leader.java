package pack2;

public class Leader 
{
	public static void check(int[] arr)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {13,2,4,9,3,2,1,5,7,6};
		check(arr);
	}

}
