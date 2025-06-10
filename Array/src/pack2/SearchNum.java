package pack2;
import java.util.Scanner;
public class SearchNum 
{
	public static void NSearch(int[] arr, int num)
	{
		//to find if the given user input is sum of two numbers present in an array
		System.out.print("Original Array : ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		int count = 0;
		boolean temp = true;
		System.out.println("\n");
		for(int i=0; i<arr.length; i++)
		{
			int j;
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i] + arr[j] == num)
				{
					System.out.println("Sum is Possible with the two given numbers : "+arr[i]+" and "+arr[j]);
					temp = false;
				}
			}
			if(i == arr.length-1 && temp == true)
			{
				System.out.println("NOT");
				break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int[] arr = {0,-1,2,-3,1};
		System.out.println("Please enter a number which is sum of two given numbers in the array");
		int num = obj.nextInt();
		NSearch(arr, num);
	}

}
