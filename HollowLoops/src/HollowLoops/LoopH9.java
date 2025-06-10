package HollowLoops;

public class LoopH9 
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<=x; y++)
			{
				if(x==5||y==1||x==y)
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
