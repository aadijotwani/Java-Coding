package _1DArray;
import java.util.Scanner;
public class Traversing 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of an array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Please enter the elements of the array ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
//start to end
		System.out.println("Traversing");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
//end to start
		System.out.println("\nReverse Traversing");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+", ");
		}
// start to half
		System.out.println("\nStart to half");
		for(int i=0; i<arr.length/2; i++)
		{
			System.out.print(arr[i]+", ");
		}
// end to half
		System.out.println("\nEnd to half");
		for(int i=arr.length-1; i>=(arr.length/2); i--)
		{
			System.out.print(arr[i]+", ");
		}
	}

}
