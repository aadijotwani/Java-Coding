package pack1;

public class encap 
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.set(200025689, 500078.00);
		Employee emp2 = new Employee();
		emp2.set(200025690, 92.69);
		emp1.get();
		emp2.get();
	}

}
