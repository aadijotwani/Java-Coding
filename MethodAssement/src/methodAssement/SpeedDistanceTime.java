package methodAssement;

public class SpeedDistanceTime 
{
	void calculateDistance(int speed, int time)
	{
		int d = speed*time;
		System.out.println("The speed of vehicle is "+speed);
		System.out.println("The time taken to cover a distance with that speed is "+time);
		System.out.println("Distance travelled by the vehicle is "+d);
	}
	public static void main(String[] args) 
	{
		SpeedDistanceTime obj = new SpeedDistanceTime();
		obj.calculateDistance(60, 4);
	}

}
