package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State6 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your details below");
		System.out.print("Please enter your maritual status (married/unmarried) : ");
		String m = scanner.nextLine();
		System.out.print("Please enter your gender : ");
		String g = scanner.nextLine();
		System.out.print("Please enter your age : ");
		int age = scanner.nextInt();
		if(m.equals("married"))
		{
			System.out.println("you are eligible for insurance");
		}
		else if(m=="unmarried" && g=="male" && age>=30)
		{
			System.out.println("you are eligible for insurance");
		}
		else if (m=="unmarried" && g=="female" && age>=25)
		{
			System.out.println("you are eligible for insurance");
		}
		else
		{
			System.out.println("you do not meet the requirements for the eligibility of insurance");
		}
	}
}