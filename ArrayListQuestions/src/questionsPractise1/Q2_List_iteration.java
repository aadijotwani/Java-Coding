package questionsPractise1;
import java.util.ArrayList;
import java.util.Iterator;

public class Q2_List_iteration 
{	
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		for(Iterator<Integer> itr = arrayList.iterator(); itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
	}

}
