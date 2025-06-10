package HollowLoops;

public class LoopHt13 
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=6; x++)
		{
			for(int y=x; y<6; y++)
			{
				System.out.print("  ");
			}
			for(int z=2; z<=x; z++)
			{
				if(z==2||x==6)
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
				if(x==i||x==6)
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
		for(int x=2; x<=6; x++)
		{
			for(int y=1; y<x; y++)
			{
				System.out.print("  ");
			}
			for(int z=x+1; z<=6; z++)
			{
				if(x+1==z)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int i=x; i<=6; i++)
			{
				if(i==6)
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
