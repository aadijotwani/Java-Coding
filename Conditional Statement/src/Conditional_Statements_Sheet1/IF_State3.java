package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to check wether it is positive, Negative, or Zero");
		int n = scanner.nextInt();
		if(n>0)
		{
			System.out.println(n+" -Number is Positive");
		}
		else if(n<0)
		{
			System.out.println(n+" -Number is Negative");
		}
		else 
		{
			System.out.println(n+" -Number is equal to zero");
		}
	}

}
