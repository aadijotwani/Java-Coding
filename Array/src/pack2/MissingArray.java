package pack2;
import java.util.Scanner;
public class MissingArray 
{
	public static void missing(int[] arr)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Array is ");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();    
		System.out.print("Please enter a number ");
		int num = obj.nextInt();
		System.out.println();
		
		boolean temp = true;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == num )
			{
				System.out.println("The number is at array on index "+ i);
				temp = false;
				break;
			}
		}
		if(temp == true)
		{
			System.out.println("The number does not exist please enter a valid input");
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {12,34,45,32,67,78,79,68};
		missing(arr);
	}

}
