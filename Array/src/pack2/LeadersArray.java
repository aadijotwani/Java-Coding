package pack2;

public class LeadersArray 
{
	public static void LeaderCheck(int[] arr)
	{
		//16,17,4,3,5,2
		System.out.println("Leaeders in array ");	
		for(int i=0; i<arr.length; i++)
		{
			int j;
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[j] > arr[i])
				{
					break;
				}			
			}
			
			if(j == arr.length)
			{
				System.out.print(arr[i]+" ");
			}
		}
			
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {13,2,4,9,3,2,11,5,7,6};
		LeaderCheck(arr);
		
	}

}
