package pack1;

public class ArraySwapping
{
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		int count = arr.length;
		int[] arrnew = new int[count];
		
		for(int k=0; k<arrnew.length; k++)
		{
			arrnew[k] = arr[k];
		}
		System.out.println("New Array After swapping is");
		for(int k=0; k<arrnew.length; k++)
		{
			System.out.println(arrnew[k]);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		swap(arr, 0, 8);
	}
}
