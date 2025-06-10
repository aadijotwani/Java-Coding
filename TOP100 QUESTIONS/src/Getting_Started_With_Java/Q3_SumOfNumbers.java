package Getting_Started_With_Java;
import java.util.Scanner;
public class Q3_SumOfNumbers 
{
	public static void Sum(int num)
	{
		int count = 0;
		for(int i=0; i<=num; i++)
		{
			count += i;
		}
		System.out.print("Sum of numbers till the entered Number is : "+count);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to find its sum: ");
		int n = sc.nextInt();
		Sum(n);
	}

}
