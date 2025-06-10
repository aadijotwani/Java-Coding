public class BinarySearch2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7};
		int k = 3;
		int num = 1;//2 3 4
		int temp = k;
		for(int i=0; i<arr.length+k; i++)// i=0,1,2,3 
		{								 // 6 5 4 3 2 1
			if(i <= arr.length-1)
			{
				if(arr[i] == num)
				{
					continue;
				}
				
				else 
				{
			//num++;
					k--;
				}
				num++;
			}
			else if(i>arr.length-1) 
			{
				num++;
			}
		}
		System.out.println(num-1);
	}
}
