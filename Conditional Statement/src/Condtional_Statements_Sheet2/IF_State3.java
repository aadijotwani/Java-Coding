package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the value of NOTE in Rupees (It should be ₹200 or ₹500)");
		int n = scanner.nextInt();
		System.out.println("Please the quantity of NOTES");
		int q = scanner.nextInt();
		int amount = n*q;
		if(amount>=10001)
		{
			System.out.println("amount exceeds limit of ₹10,000");
		}
		else {
			System.out.println("amount is within limit");
		}
		
	}
}
