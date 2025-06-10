package Getting_Started_With_Java;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int n=1000000;
		int start = 1;				
		for(int i=0; i<1000000; i++)           		//0				
		{
			int temp = start;					// 1	6	
			n--; 								// 5    4
			for(int j=0; j<=i; j++) 
			{
				System.out.print(temp+" ");		//1	6
				temp -= (n+i-j);			
			}		
			start += n;							//6				
			System.out.println();
		}
	}
}
