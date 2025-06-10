package _2DArray;
import java.util.Scanner;
public class MatrixMultiplication 
{
	public static void Multiplication(int[][] a, int[][] b, int r1, int r2, int c1, int c2)
	{
		System.out.println("elements for the first array : ");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("\n");
		System.out.println("elements for the second array : ");
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				System.out.print(b[i][j]+"    ");
			}
			System.out.println();
		}
		
		

		if(c1 == r2)
		{
			int[][] c= new int[r1][c2];
			
			for(int i=0 ; i<c.length; i++)
			{
				for(int j=0; j<c[0].length; j++)
				{
					for(int k=0; k<c.length; k++)
					{
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			
			System.out.println("elements for the final array : ");
			for(int i=0; i<r1; i++)
			{
				for(int j=0; j<c2; j++)
				{
					System.out.print(c[i][j]+"   ");
				}
				System.out.println();
			}
		}
		
		else 
		{
			System.out.println("Wrong Input");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. of rows for the 1st matrix : ");
		int r1 = sc.nextInt();
		System.out.print("Please enter the no. of columns for the 1st matrix : ");
		int c1 = sc.nextInt();
		int[][] arr1 = new int[r1][c1];
		System.out.print("Please enter the no. of rows for the 2nd matrix : ");
		int r2 = sc.nextInt();
		System.out.print("Please enter the no. of columns for the 2nd matrix : ");
		int c2 = sc.nextInt();
		int[][] arr2 = new int[r2][c2];
		
		System.out.println("Please enter the elements for the 1st array : ");
		for(int i=0; i<r1; i++)
		{
			for(int j=0; j<c1; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Please enter the elements for the 2nd array : ");
		for(int i=0; i<r2; i++)
		{
			for(int j=0; j<c2; j++)
			{
				arr2[i][j] = sc.nextInt();
			}
		}
		
		
		Multiplication(arr1, arr2, r1, r2, c1, c2);
	}

}
