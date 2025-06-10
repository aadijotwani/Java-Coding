package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the cost of item");
		int n = scanner.nextInt();
		if(n>=100)
		{
			System.out.println("your final price after discount is ₹"+((n*10)/100+n));
		}
		else {
			System.out.println("your item is less than ₹100 so your final price is ₹"+n);
		}
	}
}