import java.util.Scanner;
public class ArrayRotation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose Drection left or right - ");
		String dir = sc.nextLine();
		
		System.out.print("How many times the array should be rotated - ");
		int k = sc.nextInt();
		ArrayCreation(k, dir);
	}	
	
	public static void ArrayCreation(int k, String dir) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of the array - ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array - ");
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+"th element = ");
			arr[i] = sc.nextInt();
		}
		
		if(dir == "left")
		{
			rotateleft(arr,k);
		}
		
		else//(dir == "right")
		{
			rotateRight(arr,k);
		}
	}
	
	//  1 2 3 4 5
	public static void rotateleft(int[] arr ,int k)
	{
		for(int i=0; i<k; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		System.out.println("Printing the Array after rotating");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+", ");
		}
	}
	
	//  1 2 3 4 5
	public static void rotateRight(int[] arr ,int k)
	{
		for(int i=0; i<k; i++)
		{
			for(int j=0; j<arr.length-1; j++)
			{
				int temp = arr[(arr.length-1)-j];
				arr[(arr.length-1)-j] = arr[(arr.length-2)-j];
				arr[(arr.length-1)-j] = temp;
			}
		}
		
		System.out.println("Printing the Array after rotating");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+", ");
		}
	}
}
