package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State7 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write anything to check wether it is a digit or alphabet");
		char c = scanner.next().charAt(0);
		{
			if(c>='a' && c<='z' || c>='A' && c<='Z')
			{
				System.out.println("Inputed charecter is a Aplphabet");
			}
			else if(c>='0' && c<='9')
			{
				System.out.println("Inputed charecter is a Digit");
			}
			else {
				System.out.println("It is netiher a digit nor a alphabet");
			}
		}
	}
}
