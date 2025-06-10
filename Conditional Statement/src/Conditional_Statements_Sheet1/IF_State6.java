package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State6 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please write the year to check wether it is leap year or not");
		int y = scanner.nextInt();
		if(y%4==0)
		{
			System.out.println(y+" is a leap year");
		}
		else
		{
			System.out.println(y+" is not a leap year");	
		}
	}
}

