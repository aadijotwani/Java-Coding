package HollowLoops;

public class LoopHt18 
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=x; y<=5; y++)
			{
				System.out.print("* ");
			}
			for(int z=1; z<x; z++)
			{
				System.out.print("  ");
			}
			for(int i=1; i<x; i++)
			{
				System.out.print("  ");
			}
			for(int j=x; j<=5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print("* ");
			}
			for(int z=x; z<5; z++)
			{
				System.out.print("  ");
			}
			for(int i=x; i<5; i++)
			{
				System.out.print("  ");
			}
			for(int j=1; j<=x; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
