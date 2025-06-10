package accessModifier;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(obj.y);
		//the below code gives error as integer z is PRIVATE
		//System.out.println(obj.z);
		System.out.println(obj.h);
	}
}

