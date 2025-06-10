package HollowLoops;

public class LoopHt11 
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
				if(z==x||x==1||z==5)
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
