package introductiontoStrings;

public class MutableImmuatable 
{

	public static void main(String[] args) 
	{
		String s = new String("AADI");
		s.concat("JOTWANI");
		System.out.println(s);
		
		StringBuffer str = new StringBuffer("AADI");
		str.append("JOTWANI");
		System.out.println(str);
	}
}
