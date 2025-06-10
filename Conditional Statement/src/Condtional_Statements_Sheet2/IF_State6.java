package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State6
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter length of all 3 side of triangle");
		int a1 = scanner.nextInt();
		int a2 = scanner.nextInt();
		int a3 = scanner.nextInt();
		if(a1==a2 && a1==a3 && a2==a3)
		{
			System.out.println("It is a Equilateral Triangle");
		}
		else if(a1==a2 && a1!=a3 || a1==a3 && a1!=a2 || a2==a3 && a2!=a1)
		{
			System.out.println("It is a Isosceles Triangle");
		}
		else {
			System.out.println("It is an Scalene Triangle");
		}
	}
}
