package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State8 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the the total amount of the books you are buying");
		System.out.print("total amount = ₹");
		int cost = scanner.nextInt();
		if(cost<500)
		{
			System.out.println("sorry you are not eligible for any discount");
		}
		else if(cost>=500 && cost<=1000)
		{
			System.out.println("congratualtion, you are eligible for a discount of 5%");
			System.out.println("your total amount has beed modified to ₹"+(cost-(cost*5/100)));
		}
		else if(cost>1000 && cost<=5000)
		{
			System.out.println("congratualtion, you are eligible for a discount of 10%");
			System.out.println("your total amount has beed modified to ₹"+(cost-(cost*10/100)));	
		}
		else 
		{
			System.out.println("congratualtion, you are eligible for a discount of 15%");
			System.out.println("your total amount has beed modified to ₹"+(cost-(cost*15/100)));
		}
	}
}