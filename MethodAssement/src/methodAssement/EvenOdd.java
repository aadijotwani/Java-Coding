package methodAssement;

public class EvenOdd 
{
	boolean isNumberOdd(int b)
	{
		if(b%2==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		EvenOdd objEvenOdd = new EvenOdd();
		System.out.println(objEvenOdd.isNumberOdd(24));
	}

}
