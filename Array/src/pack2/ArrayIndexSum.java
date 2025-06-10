package pack2;

public class ArrayIndexSum 
{
	public static void Sum(int[] arr1, int[] arr2)
	{
		int count = 0;
		System.out.println("Original Array");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+", ");
			System.out.println(arr2[i]+", ");	
		}
		
		System.out.println();
		
		count = arr1.length;
		int[] arrnew = new int[count];

		for(int i=0; i<count; i++)
		{
			arrnew[i] = arr1[i]+arr2[i];
		}
		
		System.out.print("Sum of two Arrays is ");
		
		for(int i=arr1.length-1; i>0; i--)
		{
			System.out.print(arrnew[i]+", ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		int[] arr2 = {10,20,30,40,50,60,70,80,90};
		Sum(arr1, arr2);
	}
}
