package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State4 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your Basic Salary");
		int s = scanner.nextInt();
		int da;
		int hra;
		int total;
		if(s<1500)
		{
			da = (90*s)/100;
			hra = (10*s)/100;
			total = s+da+hra;
			System.out.println("Gross salary = ₹"+total);
		}
		else if(s>=1500)
		{
			da = (98*s)/100;
			hra = 500;
			total = s+da+hra;
			System.out.println("Gross salary = ₹"+total);
		}
		else 
		{
			System.out.println("sorry wrong input");
		}
	}
}
