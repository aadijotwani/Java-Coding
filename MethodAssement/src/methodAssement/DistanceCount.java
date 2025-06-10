package methodAssement;

public class DistanceCount 
{
	int calculateTotalKilometers(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		DistanceCount obj = new DistanceCount();
		System.out.println(obj.calculateTotalKilometers(10, 15));
	}

}
