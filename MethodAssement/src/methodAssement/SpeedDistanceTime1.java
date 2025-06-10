package methodAssement;

public class SpeedDistanceTime1 
{
	void timeCalculator(float d, float s)
	{
		float t = d/s;
		System.out.println("time taken by the vehicle to travel "+d+ " Km with a speed of "+s+" Km/Hr is "+t+" hour");
	}
	public static void main(String[] args) 
	{
		SpeedDistanceTime1 obj = new SpeedDistanceTime1();
		obj.timeCalculator(90, 60);
	}

}
