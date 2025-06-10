package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State8 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the COST PRICE of the product : ");
		int cp = scanner.nextInt();
		System.out.print("Please enter the SELLING PRICE of the product : ");
		int sp = scanner.nextInt();
		int profit = sp - cp;
		int loss = cp - sp;
		if(sp>cp)
		{
			System.out.println("Its a profit of ₹"+profit);
		}
		else if(cp>sp)
		{
			System.out.println("Its a loss of ₹"+loss);
		}
		else 
		{
			System.out.println("Its neither a profit nor a loss");
		}
	}
}
