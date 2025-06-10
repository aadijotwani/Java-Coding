package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_Statel0 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write anything to check wether it is a digit or alphabet");
		char c = scanner.next().charAt(0);
		{
			if(c>='a' && c<='z')
			{
				System.out.println("Inputed charecter is in LowerCase");
			}
			else if(c>='A' && c<='Z')
			{
				System.out.println("Inputed charecter is in UpperCase");
			}
			else 
			{
				System.out.println("Sorry Special case and Digits not allowed, try again :(");
			}
		}
	}
}
