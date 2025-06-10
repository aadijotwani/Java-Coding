package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_StateI0 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter all 3 angles of triangle");
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		int s = a1+a2+a3;
		if(s==180)
		{
			System.out.println("It is a Valid Triangle");
		}
		else 
		{
			System.out.println("It is not a Valid Triangle");
		}
	}
}
