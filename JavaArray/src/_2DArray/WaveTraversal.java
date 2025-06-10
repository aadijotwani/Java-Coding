package _2DArray;
import java.util.Scanner;
public class WaveTraversal 
{
	public static void transversal(int[][] arr, int r, int c)
	{
		int k=1;
		for(int i=0; i<=r*c; i++)
		{
			if(i<r )
			{
				for(int j=0; j<=r; j++)
				{
					System.out.print(arr[j][k]+", ");
				}
				k++;
			}
			
			if(i == r && k<c)
			{
				for(int j=arr.length-1; j>=0; j--)
				{
					System.out.print(arr[j][k]+", ");
				}
				k++;
			}
			
			if(i == r && k == c)
			{
				break;
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
		
		System.out.println("Please enter the elements of the Matrix");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		transversal(arr, r, c);
	}
}
