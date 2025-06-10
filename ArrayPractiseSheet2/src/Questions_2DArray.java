
public class Questions_2DArray 
{
	public static void Q1(int[][] arr)
	{
		System.out.println("Q1. Printing all the elements of the array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void Q2(int[][] arr)
	{
		System.out.println("Q2. Printing only the first and third row");
		for(int i=0; i<(arr[0].length+arr[2].length); i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(i==0 || i ==2)
					System.out.print(arr[0][i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		Q1(arr);
		System.out.println();
		Q2(arr);
		
	}

}
