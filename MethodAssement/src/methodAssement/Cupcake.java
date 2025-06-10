package methodAssement;

public class Cupcake 
{
	int calculateCupcakesPerBox(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) 
	{
		Cupcake obj = new Cupcake();
		System.out.println(obj.calculateCupcakesPerBox(27,3));
	}

}
