package Getting_Started_With_Java;
import java.util.Scanner;
public class Q7_Greatestamong3 
{
	public static void method(int a, int b, int c)
	{
		if(a>=b && a>=c)
		{
			System.out.println(a+" is the largest number among all the entered numbers");
		}
		else if(b>=a && b>=c )
		{
			System.out.println(b+" is the larest number among all the entered numbers");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 numbers to find the largest number among them ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	}

}
