package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State1 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the units of electricity consumned");
		float unit = scanner.nextFloat();
		if(unit<=50)
		{
			System.out.println("your bill is ₹"+(unit*0.50));
			System.out.println("your bill after additional 20% surcharge ₹"+(((unit*0.50*20)/100)+unit));
		}
		else if(unit<=150)
		{
			System.out.println("your bill is ₹"+(unit*0.75));
			System.out.println("your bill after additional 20% surcharge ₹"+(((unit*0.75*20)/100)+unit));
		}
		else if(unit<=250)
		{
			System.out.println("your bill is ₹"+(unit*1.20));
			System.out.println("your bill after additional 20% surcharge ₹"+(((unit*1.20*20)/100)+unit));
		}
		else 
		{
			System.out.println("your bill is ₹"+(unit*1.50));
			System.out.println("your bill after additional 20% surcharge ₹"+(((unit*1.50*20)/100)+unit));
		}
	}
}
