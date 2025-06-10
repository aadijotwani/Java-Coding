package methodAssement;

public class PizzaCount 
{
	int calculateTotalPizzaSlices(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		PizzaCount obj = new PizzaCount();
		System.out.println(obj.calculateTotalPizzaSlices(5,4));
	}
}
