import java.util.Scanner;
public class Delete 
{
	//10 20 10 10 20 30 40 10
	public static void nCount(int[] arr)
	{
		
		int count = 2;
			for(int i=1; i<arr.length; i++)
			{
				if(arr[0] == arr[i])
				{
					continue;
				}
				else 
				{
					count++;
				}
			}
			System.out.println(count);
		int[] newarr = new int[count];
		
		//for(int j=0; j<arr.length; j++)
		//{
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i] != arr[i+1])
				{
					newarr[i] = arr[i];
					
				}
			}
			//break;
		//}

			for(int i=0; i<newarr.length; i++)
			{
				System.out.print(newarr[i]+" ");
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
		
		nCount(arr);
	}

}
