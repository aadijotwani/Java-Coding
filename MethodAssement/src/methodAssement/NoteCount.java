package methodAssement;

public class NoteCount
{
	int calculateTotalNotebooks(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		NoteCount obj = new NoteCount();
		System.out.println(obj.calculateTotalNotebooks(18, 5));
	}

}
