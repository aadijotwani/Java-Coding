package Designing;
import java.util.Scanner;
public class Table 
{
	int height;
	int width;
	String material;
	String color;
//  THIS IS A CONSTRUCTOR;
	public Table(int height, int width, String material, String color)
	{
		this.height = height;
		this.width = width;
		this.color = color;
		this.material = material;
	}
//  this is a method;
	public void weight(int w)
	{
		if(w>=50)
		{
			System.out.println("table can support the weight of 50KG or more");
		}
		else 
		{
			System.out.println("Table cannot support a weight of more than 50");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter material, color, height, width of the table");
		String m = scanner.nextLine();
		String c  = scanner.nextLine();
		int h = scanner.nextInt();
		int we = scanner.nextInt();

		
	//	System.out.println("also please enter the weight to check support weight of table");
	//	int w = scanner.nextInt();
		Table obj = new Table(h, we, m, c);
		//obj.weight(w);
		System.out.println(obj.color + " " + obj.height +" " +obj.material + " "+obj.width);
		
	}

}
