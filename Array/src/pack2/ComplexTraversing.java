package pack2;

public class ComplexTraversing 
{
	public static void traversing(int[] arr)
	{
		int count = arr[0];
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Leaders in Array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					System.out.print(arr[i]+", ");
					break;
				}
				else 
				{
					break;
				}
			}
		}
	}


	public static void main(String[] args) 
	{
		int[] arr = {13,2,4,9,3,2,1,5,7,6};
				//{13,2,9,3,5,7,6};
		traversing(arr);
	}

}
