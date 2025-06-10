package _1DArray;
import java.util.Scanner;
public class Creation 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}
