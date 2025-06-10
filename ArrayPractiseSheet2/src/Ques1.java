import java.util.Scanner;
public class Ques1 
{
	
	// 1 5 3 8 4 2 0
	// 8 5 3 1 4 2 0
	// 10 20 20 30 40 
	public static void nth_Largest(int[] arr, int n)
	{
		int nthlargest = arr[0];
		int index = 0;
		for(int j=0; j<n; j++)
		{
			for(int i=j; i<arr.length; i++)
			{
				if(nthlargest >= arr[i])
				{
					nthlargest = arr[i];
					index = i;
				}
				else 
				{
					//nthlargest = arr[i+1];
					//index = i+1;
					break;
				}
				
			}
			arr[index] = arr[j];
			arr[j] = nthlargest;
			nthlargest = arr[1];
			System.out.println("arr[0] "+arr[0]);
			System.out.println("arr[1] "+arr[1]);
			System.out.println("arr[2] "+arr[2]);
			System.out.println("arr[3] "+arr[3]);
			System.out.println("arr[4] "+arr[4]);
			//System.out.println("arr[5] "+arr[5]);
		}
		
		//System.out.println("arr[2] "+arr[2]);
		System.out.println("nth largest = "+nthlargest);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the size of the array - ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array");
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(i+"th element = ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Please enter a number to find that numnbers largest element in the array");
		int n = sc.nextInt();
		nth_Largest(arr,n);
	}
}
