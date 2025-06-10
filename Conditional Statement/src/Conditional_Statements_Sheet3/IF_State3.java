package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the year in which you joined our organization");
		int year = scanner.nextInt();
		System.out.println("Pleas enter the current year");
		int cyear = scanner.nextInt();
		if(cyear-year>=3)
		{
			System.out.println("Congratualtion you are at our organization since 3 years");
			System.out.println("Bonus quest unlocked of ₹"+2500);
		}
		else {
			System.out.println("sorry you are not eligible for our bonus quest program");
		}
	}
}