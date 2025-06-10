package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State4 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to check wether it is divisible by 5 or 11");
		int n = scanner.nextInt();
		if(n%11==0 && n%5==0)
		{
			System.out.println(n+ " is divisiblee by both 11 and 5");
		}
		else if(n%11==0)
		{
			System.out.println(n+" is divisible by 11");
		}
		else if(n%5==0)
		{
			System.out.println(n+" is divisible by 5");
		}
		else 
		{
			System.out.println("Number "+n+" is neither divisible by 11 nor by 5");
		}
	}
}
