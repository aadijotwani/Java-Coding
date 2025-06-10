package HollowLoops;

public class LoopHt12 
{
	public static void main(String[] args)
	{
		for(int x=1; x<=5; x++)
		{
			for(int y=x; y<5; y++)
			{
				System.out.print("  ");
			}
			for(int z=1; z<=x; z++)
			{
				if(x==z||x==5||z==1)
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