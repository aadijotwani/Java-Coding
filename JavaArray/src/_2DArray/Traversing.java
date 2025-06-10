package _2DArray;
import java.util.Scanner;
public class Traversing
{

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Please enter No. of Rows : ");
		int r = obj.nextInt();
		System.out.println();
		System.out.print("Please enter No. of columns : ");
		int c = obj.nextInt();
		int[][] arr = new int[r][c];
		
		System.out.print("Please enter the elements of the array : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr[i][j] = obj.nextInt();
			}
			//System.out.println();
		}
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println("\n");
		}
		System.out.println(arr.length);
	}
}
