package assesment1;
import java.util.Scanner;
public class Q1
{
	public void Add() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 numbers to find there sum");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("Addition of two Numbers is "+(n1+n2));
	}
	public void Sub()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 numbers to find there Subtraction");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("Subtraction of two Numbers is "+(n1-n2));
	}
	public void Multiplication()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 numbers to find there Multiplication");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("Multiplication of two Numbers is "+(n1*n2));
	}
	public void Division()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter 2 numbers to find there Division");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("Division of two Numbers is "+(n1/n2));
	}
	public static void main(String[] args) 
	{
		Q1 obj = new Q1();
		obj.Add();
		obj.Sub();
		obj.Multiplication();
		obj.Division();
	}
}