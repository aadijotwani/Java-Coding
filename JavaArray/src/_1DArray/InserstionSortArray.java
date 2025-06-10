package _1DArray;
//import java.util.Scanner;
public class InserstionSortArray 
{
	public static void InsertionSort(int[] arr)
	{
		//    i j
		// 10,8,2,3,9,2,29,1,29,8,0,-2
		for(int i=0; i<arr.length-1; i++)
		{
			int j=i+1;
			int temp = arr[i]; //2
			for(int k=i; k>=0; k--)
			{
				
			}
			if(arr[j]<arr[i]) 
			{		
				arr[i] = arr[j]; 
				arr[j] = temp;
				i=-1;
			}
			
			// 8 10 2 3 9 2 29
			//    i j
			//
		}	
		System.out.println("\n \nSorted Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {10,8,2,3,9,2,29,1,29,8,0,-2};
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		InsertionSort(arr);

	}

}
