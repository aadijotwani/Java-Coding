package methods;
import java.util.Scanner;
public class Method
{
	static int sum(int a,int b)
	{
		int c = a+b;
		return c;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please neter two number");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(sum(a,b));
	}
}