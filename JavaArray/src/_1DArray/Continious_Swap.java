package _1DArray;
import java.util.Scanner;
public class Continious_Swap 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of the array");
		int size = sc.nextInt();
		System.out.print("Please  enter the elements of the array");
		int[] arr = new int[size];
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(i+"th element is -");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[(arr.length-1)-i];
			arr[(arr.length-1)-i] = temp;
		}
		
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
