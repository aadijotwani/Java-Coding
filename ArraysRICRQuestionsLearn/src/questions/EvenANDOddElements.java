package questions;
import java.util.Iterator;
import java.util.Scanner;

public class EvenANDOddElements 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int[] evenarr, oddarr;
		int ecount = 0,ocount = 0, eindex = 0, oindex = 0 ;
		
		
		
		System.out.print("Plase enter the elements of the array: ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				ecount++;
			}
			else 
			{
				ocount++;
			}
		}
		evenarr = new int[ecount];
		oddarr = new int[ocount];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenarr[eindex] = arr[i];
				eindex++;
			}
			else 
			{
				oddarr[oindex] = arr[i];
				oindex ++;
			}
		}
		
		System.out.println("Even and Odd array are below:- ");
		for(int i=0; i<evenarr.length; i++)
		{
			System.out.print(evenarr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<oddarr.length; i++)
		{
			System.out.print(oddarr[i]+" ");
		}
		
		
	}

}
