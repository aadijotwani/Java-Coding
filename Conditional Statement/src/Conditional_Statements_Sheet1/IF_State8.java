package Conditional_Statements_Sheet1;
import java.util.Scanner;
public class IF_State8 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 Characters to check wether it is vowel or consonant");
		char c = scanner.next().charAt(0);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			System.out.println("it is an vowvel");
		}
		else {
			System.out.println("it is an consonant");
		}
	}
}