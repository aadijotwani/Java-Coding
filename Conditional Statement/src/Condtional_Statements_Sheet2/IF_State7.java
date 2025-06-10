package Condtional_Statements_Sheet2;
import java.util.Scanner;
public class IF_State7
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the quadratic equation down :");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println(a+"x² + "+b+"x + "+c);
		
		double k = (Math.sqrt(b*b - (4*a*c)) - b)/(2*a);
		double s = -(Math.sqrt(b*b - (4*a*c)) - b)/(2*a);
		System.out.println("The roots of the equation are "+k+" and "+s);
		double d = (b*b) - 4*a*c;
		if(d == 0)
		{
			System.out.println("The roots are real and equal");
		}
		else if(d>=0)
		{
			System.out.println("The roots are real and distinct");
		}
		else 
		{
			System.out.println("The roots of the equation are non real");
		}
	}
}
