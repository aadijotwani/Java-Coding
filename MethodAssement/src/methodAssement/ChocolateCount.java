package methodAssement;

public class ChocolateCount
{
	int calculateTotalChocolates(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		ChocolateCount obj = new ChocolateCount();
		System.out.println(obj.calculateTotalChocolates(4,30));
	}

}
