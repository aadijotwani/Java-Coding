package HollowLoops;

public class LoopH5
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=5; y++)
			{
				if(x+y==6)
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
