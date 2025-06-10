package pack2;

public class ArraySum 
{
	public static void Sum(int[] arr1, int[] arr2)
	{
		int arr1size = arr1.length;
		int arr2size = arr2.length;
		int size = arr1size > arr2size ? arr1size : arr2size;
		int[] arrn = new int[size];                   //Creation of new Array
		
		System.out.println("Size of Array 1 is :"+arr1size);
		System.out.println("Size of Array 2 is :"+arr2size+"\n");
		System.out.println("Size of New Arrays is : "+ arrn.length);
		
		int i=0;
		while(i<size)
		{
			if(arr1size>arr2size && i<arr2size)
			{
				arrn[i] = arr1[i]+arr2[i];
			}
			else if(arr2size>arr1size && i<arr1size)
			{
				arrn[i] = arr1[i]+arr2[i];
			}
			else 
			{ 
				if(arr1size>arr2size)
				{
					arrn[i] = arr1[i];
				}
				else 
				{
					arrn[i] = arr2[i];
				}
			}
			i++;		
		}
		
		for(i=0; i<arrn.length; i++)
		{
			System.out.print(arrn[i]+", ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5,6};
		Sum(arr1, arr2);
	}
}
