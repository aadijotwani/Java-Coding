package Getting_Started_With_Java;
import java.util.Scanner;
public class Q4_SumOfRange 
{
	public static void Sum(int s, int e)
	{
		int count = s;
		for(int i=s; i<=e; i++)
		{
			count += i;
		}
		System.out.println("The Sum of Number "+count);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the starting Number for the range ");
		int start = sc.nextInt();
		System.out.println("Please enter the ending Number for the range ");
		int end = sc.nextInt();
		Sum(start, end);
	}

}
