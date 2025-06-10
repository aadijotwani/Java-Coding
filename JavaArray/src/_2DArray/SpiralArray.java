package _2DArray;
import java.util.Scanner;
public class SpiralArray 
{
	public static void spiral(int[][] arr, int r, int c)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println();

		int counti = 0;
		int countj = 0;
		int j=0;
		
		for(int i=counti; i<r-1; i++)
		{
			System.out.print(arr[i][j]+",  ");
			counti = i;
		}
			
		for(j=0; j<c-1; j++)
		{
			System.out.print(arr[counti+1][j]+",  ");
			countj = j;
		}
			
		for(int i = counti+1; i>0; i--)
		{
			System.out.print(arr[i][j]+",  ");
		}
		
		for(j = countj+1; j>0; j--)
		{
			System.out.print(arr[counti+1][j]+",  ");
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
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j]= sc.nextInt(); 
			}
		}
		spiral(arr, r, c);
	}
}
