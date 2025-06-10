package _2DArray;

import java.util.Scanner;

public class ArrayPattern 
{
	public static void pattern(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				if(i == j)
				{
					System.out.print(arr[i][j]+"  ");
				}
			}
		}
		System.out.println("\n");
		for(int k=0; k<arr.length*arr[0].length; k++)
		{
			for(int i=k; i<arr.length; i++)
			{
				for(int j=i+1; j<arr[0].length; j++)
				{
					System.out.print(arr[i][j]+"  ");
					break;
				}
			}
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
		System.out.println("Please enter the no. of elements in the array");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j]= sc.nextInt(); 
			}
		}
		pattern(arr);
	}

}
