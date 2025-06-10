package HollowLoops;

public class LoopHt14 {
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=x; y<5; y++)
			{
				System.out.print("  ");
			}
			for(int z=2; z<=x; z++)
			{
				if(x==5||z==2)
				{
				System.out.print("* ");
				}
				else  
				{
					System.out.print("  ");
				}
			}
			for(int i=1; i<=x; i++)
			{
				if(x==5||x==i)
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
			for(int y=1; y<x; y++)
			{
				System.out.print("  ");
			}
			for(int z=x+1; z<=5; z++)
			{
				if(x==1||z==x+1)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int i=x; i<=5; i++)
			{
				if(x==1||i==5)
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
