package methodAssement;

public class SpeedDistanceTime2 
{
	void calculateSpeed(int d, int t)
	{
		int speed = d/t;
		System.out.println("speed of the vehicle is "+speed);
	}
	
	public static void main(String[] args) 
	{
		SpeedDistanceTime2 obj = new SpeedDistanceTime2();
		obj.calculateSpeed(125, 5);
	}

}
