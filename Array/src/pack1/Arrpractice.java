package pack1;


public class Arrpractice 
{

	
	//**********************print elements of the array*****************
	
	public static void printElement(int[] arr)
	{
		System.out.println("printing array elements");
		for(int i = 0 ; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
				
	}
		
	//********************** adding all elements*************************
	public static int sumOfAllElements(int [] arr)
	{
		int sum = 0;
		for(int i = 0 ; i<arr.length ; i++)
		{
			sum += arr[i];
			
		}	
		
		return sum;
	}
	
	//************************ swapping two elements ********************
	
	public static void swap(int[] arr , int i ,int j)
	{
		
		System.out.println("before swaping the elements");
		for(int u = 0 ; u< arr.length;u++)
		{
			System.out.println(arr[u]);
		}
		
		
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]= temp;
		
		System.out.println("after swaping the elements");
		for(int u = 0 ; u< arr.length;u++)
		{
			System.out.println(arr[u]);
		}		
		
	}
	
	
	//************************ even number print****************
	
	public static void evennumber(int [] arr)
	{
		
		System.out.println("even postion number ");
		for(int i = 1 ; i<arr.length ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}		
		
	}
	// ************************** prime number print ***************
	
	public static void primePrint(int []arr)
	{
		//int[] arr = {1, 23, 12, 24 ,3 ,4 ,0, 89};
		// arr.length = 8
		
		for(int i = 0; i<arr.length ; i++)
		{
			
			if (arr[i]==1)
			{
				System.out.println(arr[i]+ " not a prime number");
			}
			
		
			else 
			{
				boolean flag = true;
				//System.out.println(flag);
				for(int u = 2; u<arr[i]; u++ )
				{
					if(arr[i]%u==0)
					{
						System.out.println(arr[i]+ " it is not a prime number");
						flag = false;
						break;
					}				
				}	
				//System.out.println(flag);
				if(flag == true)
				{
					System.out.println(arr[i] + " it is prime number");
				}
				
			}			
			
		}	
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		int[] arr = {1, 23, 12, 24 ,13 ,4 ,0, 89};
		//printElement(arr);
	//	System.out.println("sum of elements = " + sumOfAllElements(arr));
	//	swap(arr, 0, 3);
		//evennumber(arr);
		primePrint(arr);
	
	
		
		
		

	}

}
