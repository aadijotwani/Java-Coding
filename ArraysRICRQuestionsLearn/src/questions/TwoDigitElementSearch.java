package questions;

public class TwoDigitElementSearch 
{
	public static void main(String[] args) 
	{
		
		
		int[] arr = {22, 309, 4, 55};
		
		for(int i=0; i<arr.length; i++)
		{
			int count = 0 ;
			int temp = arr[i];
			while(temp>0)
			{
				temp/=10;
				count++;
			}
			System.out.println(arr[i] + " is a " + count +" digit number");
		
		}
	}

}
