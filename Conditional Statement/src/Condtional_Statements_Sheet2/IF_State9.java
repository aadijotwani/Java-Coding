package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State9 
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
		if(calculation >= 90)
		{
			System.out.println("GRADE A");
		}
		else if(calculation >= 80)
		{
			System.out.println("GRADE B");
		}
		else if(calculation >= 70)
		{
			System.out.println("GRADE C");
		}
		else if(calculation >= 60)
		{
			System.out.println("GRADE D");
		}
		else if(calculation >= 40)
		{
			System.out.println("GRADE E");
		}
		else 
		{
			System.out.println("GRADE F");
		}
	}
}
