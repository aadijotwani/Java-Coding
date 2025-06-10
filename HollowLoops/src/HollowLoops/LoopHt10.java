package HollowLoops;

public class LoopHt10 
{
	public static void main(String[] args) 
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=x; y<=5; y++)
			{
				if(x==1||x==y||y==5)
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
