package methodAssement;

public class AeroplaneCount 
{
	public int calculateRequiredAeroplanes(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) 
	{
		AeroplaneCount obj = new AeroplaneCount();
		System.out.println(obj.calculateRequiredAeroplanes(180, 60));
	}
}
