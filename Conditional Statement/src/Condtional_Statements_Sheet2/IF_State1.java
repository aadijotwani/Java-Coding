package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number to tell the initialized week name of that specific number");
		int n = scanner.nextInt();
		if(n==1)
		{
			System.out.println("MONDAY");
		}
		else if(n==2)
		{
			System.out.println("TUESDAY");
		}
		else if(n==3)
		{
			System.out.println("WEDNESDAY");
		}
		else if(n==4)
		{
			System.out.println("THURSDAY");
		}
		else if(n==5)
		{
			System.out.println("FRIDAY");
		}
		else if(n==6)
		{
			System.out.println("SATURDAY");
		}
		else if(n==7)
		{
			System.out.println("SUNDAY");
		}
		else {
			System.out.println("Wrong input :(");
		}
	}
}
