package pack2;

public class Array3 
{

	public static void frequency(int[] arr)
	{
		String[] arrd =  new String[arr.length];
		String mask = " ";
		
		for(int i=0; i<arr.length; i++)
		{
			int count =1;
			
			for(int j=i+1; j<arr.length; j++)
			{
				
				if(arr[i] == arr[j])
				{
					count++;
					arrd[j]=mask;
				}
			}
			if(arrd[i] != mask)
			{
				arrd[i] = Integer.toString(count);
			}
		}
//..............Traversing.................................................................
		for(int i=0; i<arr.length;i++)
		{
			
			if(arrd[i] == ("-1"))
			{
				arrd[i] = " ";
			}
			System.out.println(arrd[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,4,2,5};
		frequency(arr);
	}

}
