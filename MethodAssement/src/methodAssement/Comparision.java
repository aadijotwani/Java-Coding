package methodAssement;

public class Comparision 
{
	public boolean compare(int num1, int num2)
	{
		if(num1>num2)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) 
	{
		Comparision obj = new Comparision();
		System.out.println(obj.compare(24, 23));
	}

}
