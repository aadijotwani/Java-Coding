public class Swap_2DArray
{
	public static void main(String[] args) 
	{
		int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

		for(int i=0; i<arr[0].length; i++)
		{
				int temp = arr[0][i];
				arr[0][i] = arr[arr.length-1][i];
				arr[arr.length-1][i] = temp;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int k=0; k<arr[0].length; k++)
			{
				System.out.print(arr[i][k]+" ");
			}
			System.out.println();
		}
	}
}


