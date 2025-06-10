package method1;
import java.util.Scanner;
public class M1 
{
	public static int greater(int a, int b)
	{
	if(a>b)
	{
		System.out.println("num1 is greater than num 2");
		int c = a;
		return c;
	}
	else {
		System.out.println("Num2 is greater than num1");
		int c = b;
		return c;
	}
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 number to check whch number is greater");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = greater(a,b);
		System.out.println("Largest value between these two numbers is "+c);
	}
}