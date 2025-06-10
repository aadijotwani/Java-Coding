package _2DArray;
import java.util.Scanner;
public class MissingElement 
{
	public static void find(int[][] arr,int num)
	{
		boolean temp = true;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
			{
				if(num == arr[i][j])
				{
					System.out.println("The no. is present in the given array");
					System.out.println("row = "+ i);
					System.out.println("column = "+ j);
					temp = false;
				}
			}
		}
		if(temp == true)
		{
				System.err.println("entered number is not present in the array");
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
		
		System.out.println("Please enter a number ot find wether it is present in the given array or not");
		int num = sc.nextInt();
		
		find(arr, num);
	}

}
