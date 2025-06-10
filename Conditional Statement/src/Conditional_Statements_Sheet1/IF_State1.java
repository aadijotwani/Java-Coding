package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State1 
{
	public static void main(String[] args) 
	{
		
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int num1 = number.nextInt();
		System.out.println("Number 1 = "+ num1);
		int num2 = number.nextInt();
		System.out.println("Number 2 = "+ num2);
		if(num1>num2)
		{
			System.out.println("Number 1 is Greater");
		}
		else if(num2>num1)
		{
			System.out.println("Number 2 is Greater");
		}
		else 
		{
				System.out.println("Both are equall");
		}
	}
}
