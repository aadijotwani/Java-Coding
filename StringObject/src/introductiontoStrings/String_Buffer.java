package introductiontoStrings;
public class String_Buffer 
{
	public static void main(String[] args) 
	{
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("Helloasdfghjklqwe");
	System.out.println(sb.capacity());
	}
}