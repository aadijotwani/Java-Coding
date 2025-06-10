package pack2;

public class Abs extends Abstrat
{
	@Override
	void age()
	{
		System.out.println("His/Her age is not defined");
	}
	@Override
	void printing()
	{
		System.out.println("Nothing to print");
	}
	public static void main(String[] args) 
	{
		Abs ab1 = new Abs();
		ab1.age();
		ab1.printing();
	}
}
