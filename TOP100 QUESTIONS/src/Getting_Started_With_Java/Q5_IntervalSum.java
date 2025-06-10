package Getting_Started_With_Java;
import java.util.Scanner;
public class Q5_IntervalSum 
{
	public static void method1(int d, int end)
	{
		int count = 0;
		for(int i=0; i<end; i++)
		{
			count += i;
		}
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the Common differnce : ");
		int d = sc.nextInt();
		System.out.print("Please enter the end point : ");
		int end = sc.nextInt();
		method1(d, end);
	}

}
