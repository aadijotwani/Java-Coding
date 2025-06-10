import java.util.Scanner;
public class BinarySearch 
{
	// s                                           e
	// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
	public static void Search(int[] arr, int num)
	{
		int s = arr[0];
		int e = arr.length-1;
		int mid = (e+s)/2;
		
		
		while(s<e)
		{
			if(mid<e)
			{
				
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to find its square root using binary search - ");		
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i;
		}
		Search(arr,num);

	}

}
