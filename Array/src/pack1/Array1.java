package pack1;

public class Array1 
{

	public static void main(String[] args) 
	{
		int[] arr;
		arr = new int[] {1,2,3,4,5};
		//Forward Traversing 
		for(int i = 0; i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		System.out.println();
		//Reverse Traversing
		for(int i=4;i<=(arr.length-1);i--)
		{
			System.out.println(arr[i]);
		}
	}
}