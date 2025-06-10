package HollowLoops;

public class LoopHt17 
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<x; y++)
			{
				System.out.print("  ");
			}
			for(int z=x; z<=5; z++)
			{
				if(x==1||x==z)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int k=x; k<5; k++)
			{
				if(x==1||k==4)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		for(int x=2; x<=5; x++)
		{
			for(int y=x; y<5; y++)
			{
				System.out.print("  ");
			}
			for(int z=1; z<=x; z++)
			{
				if(x==1||x==5||z==1)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int k=1; k<x; k++)
			{
				if(x==5||k==x-1)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
