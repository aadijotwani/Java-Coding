package HollowLoops;

public class LoopHt16
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=x; y++)
			{
				if(x==y||y==1)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int z=x; z<5; z++)
			{
				System.out.print("  ");
			}
			for(int i=x; i<5; i++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=x; k++)
			{
				if(x==k||k==1)
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
		
		for(int x=1; x<=5; x++)
		{
			for(int y=x; y<=5; y++)
			{
				if(x==y||y==5||x==1)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int z=1; z<x; z++)
			{
				System.out.print("  ");
			}
			for(int i=1; i<x; i++)
			{
				System.out.print("  ");
			}
			for(int k=x; k<=5; k++)
			{
				if(x==1||k==5||x==k)
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
