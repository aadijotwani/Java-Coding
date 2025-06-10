package Getting_Started_With_Java;
import java.util.Scanner;
public class Q1_PositiveNegativeNum 
{
	public static void method1(int num)
	{
		if(num>0)
		{
			System.out.println("The entered number is positive");
		}
		else if(num<0)
		{
			System.out.println("The entered number is negative");
		}
		else
		{
			System.out.println("The entered number is equal to zero(0)");
		}
	}
	
	public static void method2(int num)
	{
		System.out.println(num > 0 ? "Number is positive" : "Number is negative");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to check wether the number is negative or positive");
		int num = sc.nextInt();
		method1(num);
		method2(num);
	}

}
