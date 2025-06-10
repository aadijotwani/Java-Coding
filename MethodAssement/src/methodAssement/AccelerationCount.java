package methodAssement;
public class AccelerationCount 
{
	void calculateAcceleration(int is, int fs, int t)
	{
		int a = (fs - is)/t;
		System.out.println("Distancce travelled = "+a);
	}
	public static void main(String[] args)
	{
		AccelerationCount obj = new AccelerationCount();
		obj.calculateAcceleration(0, 60, 10);
	}
}
