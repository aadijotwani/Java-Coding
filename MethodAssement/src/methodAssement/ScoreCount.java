package methodAssement;

public class ScoreCount 
{
	int calculateTotalScore(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		ScoreCount obj = new ScoreCount();
		System.out.println(obj.calculateTotalScore(5,40));
	}

}
