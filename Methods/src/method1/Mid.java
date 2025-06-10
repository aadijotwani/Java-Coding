package method1;
import java.util.Scanner;
public class Mid 
{
	static String str(String w) 
	{
		return w;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scanner.nextLine();
		System.out.println(str(word));
		int length =0;
		for(int n=0; n<=word.length(); n++)
		{
			length =n;
		}
		System.out.println(length);
	}
}
