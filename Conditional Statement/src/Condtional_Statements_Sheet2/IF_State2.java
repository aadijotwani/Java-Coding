package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State2
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number to tell the initialized week name of that specific number");
		int n = scanner.nextInt();
		if(n==1)
		{
			System.out.println("JANUARY");
		}
		else if(n==2)
		{
			System.out.println("FEBRUARY");
		}
		else if(n==3)
		{
			System.out.println("MARCH");
		}
		else if(n==4)
		{
			System.out.println("APRIL");
		}
		else if(n==5)
		{
			System.out.println("MAY");
		}
		else if(n==6)
		{
			System.out.println("JUNE");
		}
		else if(n==7)
		{
			System.out.println("JULY");
		}
		else if(n==8)
		{
			System.out.println("AUGUST");
		}
		else if(n==9)
		{
			System.out.println("SEPTEMBER");
		}
		else if(n==10)
		{
			System.out.println("OCTOBER");
		}
		else if(n==11)
		{
			System.out.println("NOVEMBER");
		}
		else if(n==12)
		{
			System.out.println("DECEMBER");
		}
		else {
			System.out.println("Wrong input :(");
		}
	}
}
