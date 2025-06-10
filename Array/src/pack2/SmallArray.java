package pack2;
import java.util.Scanner;
public class SmallArray
{
	public static void check(int[] arr,int num)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=num; j>=0; j--)
			{
				if(arr[i]==j)
				{
					System.out.println(j);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,77,86,25,4};
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		check(arr, num);

	}

}
