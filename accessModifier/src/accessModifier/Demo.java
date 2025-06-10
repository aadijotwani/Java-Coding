package accessModifier;

public class Demo 
{
	//Using access modifiers;
	int x = 12;
	public int y = 13;
	private int z = 14;
	protected int h = 15;	

	public static void main(String[] args) 
	{
		//Creating object of the class itself
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.h);
		System.out.println(obj.y);
		System.out.println(obj.z);

	}

}
