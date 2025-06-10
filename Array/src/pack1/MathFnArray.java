package pack1;

public class MathFnArray 
{

	public static void SuareandCube(int[] arr)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Cube is");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(Math.pow(arr[i], 3)+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Square is");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(Math.pow(arr[i], 2)+", ");
		}
		System.out.println("\n");
	}
	
	public static void Squareroot(int[] arr1)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Square is");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print(Math.sqrt(arr1[i])+", ");
		}
		System.out.println("\n");
	}
	
	public static void Cuberoot(int[] arr2)
	{
		System.out.println("Original Array");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i]+", ");
		}
		
		System.out.println("\n");
		
		System.out.println("Cube is");
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(Math.cbrt(arr2[i])+", ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr1 = {4,9,16,25,36,49,64,81};
		int[] arr2 = {1,8,27,64,125,216,343,512,729,1000};
		SuareandCube(arr);
		Squareroot(arr1);
		Cuberoot(arr2);
	}

}
