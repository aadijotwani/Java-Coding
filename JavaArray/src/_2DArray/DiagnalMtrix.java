package _2DArray;
import java.util.Scanner;
public class DiagnalMtrix 
{
	public static void Matrix(int[][] arr)
	{
		int count;
		for(int k=0; k<arr.length; k++)
		{
			//System.out.println("k value "+k);
			count = 0;
			for(int i=0; i<arr.length-k; i++)
			{
				for(int j=k; j<arr[0].length;)
				{
					System.out.print(arr[i][j+count]+"  ");
					count++;
					break;
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. of rows : ");
		int r = sc.nextInt();
		System.out.print("Please enter the no. of columns : ");
		int c = sc.nextInt();
		
		System.out.println("Please enter the elements of the matrix : ");
		int[][] arr = new int[r][c]; 
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j]= sc.nextInt(); 
			}
		}
		
		Matrix(arr);
	}
}
