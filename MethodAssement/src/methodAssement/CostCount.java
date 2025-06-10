package methodAssement;

public class CostCount 
{
	double calculateTotalCost(double a, double b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		CostCount obj = new CostCount();
		System.out.println(obj.calculateTotalCost(20.0, 50.5));
	}
}
