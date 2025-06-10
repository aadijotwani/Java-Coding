package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_Statel0 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Basic Salary");
		int s = scanner.nextInt();
		int da;
		int hra;
		int total;
		if(s<=10000)
		{
			da = (80*s)/100;
			hra = (20*s)/100;
			total = s+da+hra;
			System.out.println("Gross salary = ₹"+total);
		}
		else if(s<=20000)
		{
			da = (90*s)/100;
			hra = (25*s)/100;
			total = s+da+hra;
			System.out.println("Gross salary = ₹"+total);
		}
		else if (s>20000)
		{
			da = (95*s)/100;
			hra = (30*s)/100;
			total = s+da+hra;
			System.out.println("Gross salary = ₹"+total);
		}
		else
		{
			System.out.println("sorry wrong input");
		}
	}
}
