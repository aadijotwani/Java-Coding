import java.util.Scanner;
public class NumberCount 
{
	//10 20 10 10 20 30 40 10
	public static void Count(int[] arr)
	{
		int count = 1;
		for(int j=0; j<arr.length; j++)
		{
			for(int i=1; i<arr.length; i++)
			{
				if(arr[j] == arr[i])
				{
					count++;
				}
				else 
				{
					continue;
				}
			}
			System.out.println(arr[j]+" = "+ count);
			for(int k=1;k<arr.length;k++)
			{
				if(arr[j] == arr[k])
				{
					j++;
				}
				else 
				{
					break;
				}
			}
			count = 0;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of the array - ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array :");
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+"th element is = ");
			arr[i] = sc.nextInt();
		}
		
		Count(arr);
	}

}
