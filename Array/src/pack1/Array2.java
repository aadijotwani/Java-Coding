package pack1;

public class Array2 
{
//*********************************** PRINT ELEMENTS ******************************
	public static void traversing(int[] arr)
	{
		System.out.println("Traversing");
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
//*********************************SUM ELEMENTS************************************
	public static int Sum(int[] arr)
	{
		System.out.println("Sum of all elements is ");
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			sum += arr[i];
			
		}
		return sum;
	}
	//*********************************Swapping Elements********************************
	
	public static void Swapping(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
		System.out.println("After Swaping");
		for(int u = 0; u<arr.length; u++)
		{
			System.out.println(arr[u]);
		}

	}
//************************************Prime Elements*************************************
	public static void PrimeElements(int[] arr)
	{
		//int[] arr = {1,12,13,41,55,62,78,81,90};
		int count = 0;
		boolean temp = true;
		
		System.out.println("Orignal Array");
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("New Array");
				
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<1)
			{
				System.out.println(arr[i]+" It is not a prime number");
				break;
			}
			
			else 
			{
				temp = true;
				for(int j = 2; j<arr[i]; j++)
				{
					if(arr[i]%j==0)
					{
						System.out.println(arr[i]+ " It is not a prime number");
						temp = false;
						break;
					}
				}
				
				if(temp == true || arr[i]==1) 
				{
					System.out.println(arr[i]+ " is a prime number");
					count++;
					
				}
			}
		}
		int[] prime = new int[count];
		int start = 0;
		int end = prime.length-1;	
			
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<1)
			{
				break;
			}
				
			else    
			{
				temp = true;
				
				for(int j = 2; j<arr[i]; j++)
				{
					if(arr[i]%j==0)
					{
						temp = false;
						break;
					}
				}
				
				if(temp == true || arr[i]==1) 
				{
					while(start<=end)
					{
						prime[start]= arr[i];
						start++;
						break;
					}
				}
			}
		}
		System.out.println();
		System.out.print("prime array = ");
		for(int i = 0 ; i<prime.length ; i++)
		{
			System.out.print(prime[i] + " ");
				
		}
	}
	
	//*************************odd array**********************
	
	public static void oddArray(int [] arr)
	{
		int count = 0;
		System.out.print("original array = ");
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
			if(arr[i]%2!=0)
			{
				count++;
				
			}
			
		}
		
		int [ ] odd = new int[count];
		int start = 0 ;
		int end = odd.length-1;
		
		for(int i = 0 ; i<arr.length;i++)
		{
			
			if(arr[i]%2!=0)
			{
				
				while(start<=end)
				{
					odd[start]= arr[i];
					start++;
					break;
				}
			}
		}
		System.out.println();
		System.out.print("odd array = ");
		for(int i = 0 ; i<odd.length ; i++)
		{
			System.out.print(odd[i] + " ");
			
		}	
		
	}
	
	
	
	public static void main(String[] args) 
	{
		int[] arr = {1,12,13,41,31,62,78,81,90};
		traversing(arr);
		System.out.println(Sum(arr));
		Swapping(arr, 3, 8);
		oddArray(arr);
		PrimeElements(arr);
	}

}
