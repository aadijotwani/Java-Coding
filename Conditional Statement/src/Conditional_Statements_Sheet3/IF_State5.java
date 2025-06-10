package Conditional_Statements_Sheet3;
import java.util.Scanner;
public class IF_State5 
{
	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Please enter below the marks obtained out of 80 by students in each subject");
		System.out.print("MATHEMATICS : ");
		int m = scanner.nextInt();
		System.out.print("PHYSICS : ");
		int p = scanner.nextInt();
		System.out.print("CHEMISTRY : ");
		int c = scanner.nextInt();
		System.out.print("BIOLOGY : ");
		int b = scanner.nextInt();
		System.out.print("COMPUTERS : ");
		int comp = scanner.nextInt();
		int calculation = (m+p+c+b+comp)*100/400;
		if(calculation >= 60)
		{
			System.out.println("FIRST DIVISION");
		}
		else if(calculation >= 50 && calculation <=59)
		{
			System.out.println("SECOND DIVISION");
		}
		else if(calculation >= 40 && calculation <=59)
		{
			System.out.println("THIRD DIVISION");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}
