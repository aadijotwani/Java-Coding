package methodAssement;

public class MinuteCount 
{
	int calculateTotalMinutes(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		MinuteCount obj = new MinuteCount();
		System.out.println(obj.calculateTotalMinutes(60, 3));
	}
}
