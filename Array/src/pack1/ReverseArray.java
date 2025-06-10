package pack1;

public class ReverseArray
{
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		int start = 0;
		int end = arr.length-1;

		int temp =start;
		for(int i=0; i<arr.length/2; i++)
		{
			temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = temp;
			
		}
			
			for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}

	}

}
