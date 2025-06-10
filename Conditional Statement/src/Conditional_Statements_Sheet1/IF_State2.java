package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 3 number");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+ " is the largest number among all 3");
		}
		else if(n1>n2 && n3>n1)
		{
			System.out.println(n1+ " is greater than "+n2+" but less than "+n3);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+ " is the largest number among all 3");
		}
		else if(n2>n1 && n2<n3)
		{
			System.out.println(n2+ " is greater than "+n1+" but less than "+n3);
		}
		else if(n3>n2 && n3>n1)
		{
			System.out.println(n3+ " is the largest number among all 3");
		}
		else if(n3>n2 && n3<n1)
		{
			System.out.println(n3+ " is greater than "+n2+" but less than "+n1);
		}
		else 
		{
			System.out.println("All are equall");
		}
	}
}