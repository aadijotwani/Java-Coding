package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State5 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to checkk wether it is even or odd");
		int n = scanner.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is even number");
		}
		else if(n%2!=0)
		{
			System.out.println(n+" is odd number");
		}
		else {
			System.out.println(n+" is neither odd number nor even number");
		}
	}
}
// Second way could be i could also use if else condition directly 