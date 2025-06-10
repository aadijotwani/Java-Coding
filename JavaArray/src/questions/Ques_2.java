package questions;
import java.util.Scanner;
public class Ques_2 
{
	//int[] arr = {-1, 0, 1, 2, -1, -4};
//	public static boolean duplicatecheck(int[] arr, int[] arr1, int i, int j, int k)
//	{
//		for(int x=0; x<arr.length; x++)
//		{
//			for(int y=x+1; y<arr.length; y++)
//			{
//				
//			}
//		}
//		return true;
//	}
	public static boolean isDuplicate(int[] nums, int i, int j, int k)
	{
	    for (int x = 0; x < i; x++) 
	    {// Outer loop (x)
	        for (int y = x + 1; y < nums.length - 1; y++)
	        { // Middle loop (y)
	            for (int z = y + 1; z < nums.length; z++) 
	            { // Inner loop (z)
	                if ((nums[x] == nums[i] && nums[y] == nums[j] && nums[z] == nums[k]) || (nums[x] == nums[j] && nums[y] == nums[k] && nums[z] == nums[i]) ||(nums[x] == nums[k]))
	                {
	                    return true;
	                }
	            }
	        }
	    }
	    return false;
	}
	
	public static void check(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						//int[] arr1 = {arr[i], arr[j], arr[k]};
						if(!isDuplicate(arr, i, j, k))
						{
							System.out.println(arr[i] +" "+ arr[j] +" "+ arr[k]);
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {-1, 0, 1, 2, -1, -4};
		check(arr);
	}

}
