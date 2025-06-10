package Getting_Started_With_Java;
import java.util.Scanner;
public class Q2_EvenOddNum 
{
	public static void method1(int num)
	{
		if(num%2==0)
		{
			System.out.println("The number entered is even");
		}
		else if(num%2!=0)
		{
			System.out.println("The number entered is odd");
		}
		else
		{
			System.out.println("The entered number isneither even no odd");
		}
	}
	
	public static void method2(int num)
	{
		System.out.println(num%2==0 ? "Number is even " : "Number is odd");
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter to check wether the number is even or odd");
		int num = sc.nextInt();
		method1(num);
		method2(num);
	}
}
