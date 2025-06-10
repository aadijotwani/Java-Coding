package pack1;

public class ArrayRotate 
{
	public static void rotate(int[] arr, int num)
	{
	
		if(num >arr.length)
		{
			num %= arr.length;
		}
		int sizeofArr = arr.length; // 9
		int sizeofArr1 = (arr.length-num) ;//  9 - 3 = 6
		int sizeofArr2 = num ; // 3 
		
		int startofArr1 = 0;
		int endofArr1 = sizeofArr1-1; // 5
		
		int startofArr2 = endofArr1+1 ; // 6
		int endofArr2 =  sizeofArr-1; // 8
		
		for(int i = startofArr1 ; i<sizeofArr1/2; i++)
		{
			 int temp = arr[i];
			 arr[i] = arr[endofArr1-i];
			 arr[endofArr1-i] = temp;
		}
	
		for(int i = 0 ; i<sizeofArr2/2; i++)
		{
			 int temp = arr[startofArr2+i];
			 arr[startofArr2+i] = arr[endofArr2-i];
			 arr[endofArr2-i] = temp;
		}

		
		for(int i = startofArr1 ; i<= endofArr2/2; i++)
		{
			 int temp = arr[i];
			 arr[i] = arr[sizeofArr-i-1];
			 arr[sizeofArr-i-1] = temp;
		}
		
		for(int i = 0 ; i<sizeofArr; i++)
		{
			System.out.print(arr[i] + " " );
		}
		
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};		
		int num = 18;		
		rotate(arr, num);	
	}

}
