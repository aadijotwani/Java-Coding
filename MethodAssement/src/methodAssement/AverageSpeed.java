package methodAssement;

public class AverageSpeed 
{
	void calculateAverageSpeed(int distance, int time)
	{
		int speed = distance/time;
		System.out.println("Average speed is "+speed);
	}
	public static void main(String[] args) 
	{
		AverageSpeed obj = new AverageSpeed();
		obj.calculateAverageSpeed(450, 9);
	}

}
