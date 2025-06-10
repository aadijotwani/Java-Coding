package pack2;


public class AddArray 
{
	public static void add(int[] arr, int[] arr1)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println("\n");
		System.out.print("Added array : ");
		System.out.println("Direct Printing");
		for(int i=0; i<arr.length; i++)
		{
			int Sum = arr[i]+arr1[i];
			System.out.print(Sum+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("Prining after creating a new array :");
		int[] arrnew = new int[arr.length];
		for(int i=0; i<arrnew.length; i++)
		{
			arrnew[i] = arr[i]+arr1[i];
			System.out.print(arrnew[i]+" ");
		}
	}
	
	public static void diflength(int[] arr, int[] arr1)
	{
		int arrsize = arr.length;
		int arr1size = arr1.length;
		int[] c = new int[arrsize>arr1size ? arrsize : arr1size];
		
		for(int i=0; i<c.length; i++)
		{
			System.out.println(arr[i]+arr1[i]);
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,14};
		int[] arr1 = {12,23,34,45,56,67,78,89,90,100};
	//	add(arr,arr1);
		diflength(arr, arr1);
	}

}
