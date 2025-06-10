package methodAssement;

public class RelativeSpeedCount 
{
	void calculateRelativeSpeed(int s1, int s2)
	{
		int rs = s1 - s2;
		System.out.println("Relative Speed = "+rs);
	}
	public static void main(String[] args) 
	{
		RelativeSpeedCount obj = new RelativeSpeedCount();
		obj.calculateRelativeSpeed(80, 60);
	}

}
