package accessModifier1;
import accessModifier.Demo;
public class Demo4 extends Demo
{
	public static void main(String[] args) 
	{
		Demo4 obj = new Demo4();
		//gives error as it is default
		//System.out.println(obj.x);
		System.out.println(obj.y);
		// gives error as it is private
		//System.out.println(obj.z);
		System.out.println(obj.h);
	}
}
