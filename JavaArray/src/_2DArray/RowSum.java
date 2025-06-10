package _2DArray;
import java.util.Scanner;
public class RowSum 
{
	public static void sum(int[][] arr)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 0;
			for(int j=0; j<arr[0]. length; j++)
			{
				count = count + arr[i][j];
			}
			System.out.println(count);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.print("Please enter the no. of columns : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c]; 
		System.out.println("Please enter the elements of the array");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		sum(arr);
	}
}
