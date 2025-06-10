package introductiontoStrings;

public class Test 
{

	public static void main(String[] args) 
	{
		String str = new String("AADI");
		String str2 = str.concat(" JOTWANI");		
		System.out.println(str);
		System.out.println(str2);
		
		StringBuffer str1 = new StringBuffer("MAANAS");
		StringBuffer str3 = str1.append("JOTWANI");
		System.out.println(str1);
		System.out.println(str3);
		
	}
}
