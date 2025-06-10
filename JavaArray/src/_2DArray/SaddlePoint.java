package _2DArray;
import java.util.Scanner;
public class SaddlePoint 
{
	public static void Find(int[][] arr)
	{
		int i=0, j=0;
		int counti=0;
		int countj=0;
		for(int k=0; k<arr.length; k++)
		{
			i=k;
			for(j=0; j<arr[0].length-1; j++)
			{
				if(arr[i][j] < arr[i][j+1])
				{
					countj = arr[i][j];
				}
				else 
				{
					countj = arr[i][j+1];
				}
			}
			
			for(i=0; i<arr.length-1; i++)
			{
				if(arr[i][j-1] > arr[i+1][j-1])
				{
					counti = arr[i][j];
				}
				else 
				{
					counti = arr[i+1][j-1];
				}
			}

			                
			if(counti == countj)
			{
				System.out.println("Saddle point is "+ counti);
			}
			else {
				System.out.println("there is no saddle point");
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
		
		System.out.println("Please enter the elements of the matrix : ");
		int[][] arr = new int[r][c]; 
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j]= sc.nextInt(); 
			}
		}
		Find(arr);

	}

}
