package pack2;
public class RotationArray
{
	public static void Rotate(int[] arr, int num)
	{
		System.out.print("Original Array : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.print("New Shifted array is : ");
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
			}
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,6,7,8,3,4,5};
		int num = 1;
		Rotate(arr, num);
	}
}
