package pack2;

public class DuplicateArray
{
	public static void duplicate(int[] arr)
	{
		int s = 0;
		System.out.println("Elements and there frequency ");
		
		for(int i=0; i<arr.length; i++)
		{		
			boolean x = false;
			
			for(int k=0; k<i; k++)
			{
				if(arr[i]==arr[k])
				{
					x = true;
					break;
				}
			}
			
			if(!x)
			{
				int count = 0;
				for(int k = 0 ; k<arr.length;k++)
				{
					if(arr[i] == arr[k])
					{
				
						count++;
					}
				}
				
				if(count>1)
				{
					//System.out.println(" frequency of " + arr[i] + " = "+ count);
					s++;
				}
			}		
		}
		int[] array = new int[s];
		int start = 0;
		int end = array.length - 1;
		
		for(int i=0; i<arr.length; i++)
		{		
			boolean x = false;
			
			for(int k=0; k<i; k++)
			{
				if(arr[i]==arr[k])
				{
					x= true;
					break;
				}
			}
			
			if(!x)
			{
				int count = 0;
				for(int k = 0 ; k<arr.length;k++)
				{
					if(arr[i]==arr[k])
					{
				
						count++;
					}
				}
				
				if(count>1)
				{
					System.out.println(" frequency of " + arr[i] + " = "+ count);
					while(start<=end)
					{
						array[start]= arr[i];
						start++;
						break;
					}
				}
			}		
		}
		System.out.println();
		System.out.print("new array = ");
		for(int i = 0 ; i<array.length ; i++)
		{
			System.out.print(array[i] + " ");
				
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {10,10,11,10,12,10,11,12,10,18,18,12};
		duplicate(arr);
	}
}