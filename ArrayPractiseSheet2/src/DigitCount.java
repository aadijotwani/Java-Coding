import java.util.Scanner;
public class DigitCount 
{
	public static int Count(int digit)
	{
		int count = 0;
		while(digit>0)
		{
			digit = digit/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any digit number to calculate the no. of digits - ");
		int digit = sc.nextInt();
		System.out.println(Count(digit));
	}

}
