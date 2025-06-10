package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State9 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the age of all three ");
		System.out.println("age of ram is : ");
		int ram = scanner.nextInt();
		System.out.println("age of shyam : ");
		int shyam = scanner.nextInt();
		System.out.println("age of ajay : ");
		int ajay = scanner.nextInt();
		if(shyam<ram && shyam<ajay)
		{
			System.out.println("shyam is youngest of all");
		}
		else if(ram<shyam && ram<ajay) 
		{
			System.out.println("ram is youngest of all");
		}
		else
		{
			System.out.println("ajay is youngest of all");
		}
	}
}