package methodAssement;

public class TravelTimeCount 
{
	void calculateTotalTravelTime(float d1, float s1, float d2, float s2)
	{
		float t1 = d1/s1;
		float t2 = d2/s2;
		System.out.println("Total travel time = "+(t1+t2));
	}
	public static void main(String[] args)
	{
		TravelTimeCount obj = new TravelTimeCount();
		obj.calculateTotalTravelTime(150, 50, 200, 100);
	}
}
