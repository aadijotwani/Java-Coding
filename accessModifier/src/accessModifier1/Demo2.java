package accessModifier1;
import accessModifier.Demo;
public class Demo2
{

	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		System.out.println(obj.y);
		//these are default, private and protected respectively
		/*System.out.println(obj.x);
		System.out.println(obj.z);
		System.out.println(obj.h);*/
	}

}
