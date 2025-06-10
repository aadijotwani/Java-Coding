package HollowLoops;

public class LoopHt15 
{
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
				if(z==2)
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
				if(x==i)
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
		for(int x=1; x<=4; x++)
		{
			for(int y=1; y<=x; y++)
			{
				System.out.print("  ");
			}
			for(int z=x; z<=4; z++)
			{
				if(x==z)
				{
				System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			for(int i=x; i<=4; i++)
			{
				if(i==3)
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
