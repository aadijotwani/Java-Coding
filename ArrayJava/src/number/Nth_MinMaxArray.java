package number;
import java.util.Scanner;
public class Nth_MinMaxArray 
{
	public static void print(int[] arr, int num)
	{
		System.out.println("Original Array ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}

	public static void ArraySort(int[] arr)
	{
		int size = arr.length;
		int[] newarr = new int[size];
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		System.out.println("Sorted Array is : ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]>=arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(newarr[i]+", ");
		}
		System.out.println("\n");
	}
	
	public static void Min(int[] arr, int num)
	{
		ArraySort(arr);
		
		if(num <= arr.length)
		{
			System.out.println(num+"th smallest number is : "+arr[num-1]);
		}
		else
		{
			System.out.println("Immpossible to find");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter a number to find its Nth Minimum value ");
		int num = obj.nextInt();
		int[] arr = {12,23,34,58,57,60,77,8,59};
		print(arr, num);
		System.out.println("\n");
		Min(arr, num);
		
	}

}
