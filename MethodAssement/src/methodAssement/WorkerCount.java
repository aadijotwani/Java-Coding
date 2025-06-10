package methodAssement;

public class WorkerCount 
{
	int calculateTotalWorkers(int a, int b)
	{
		return a*b;
	}
	public static void main(String[] args) 
	{
		WorkerCount obj = new WorkerCount();
		System.out.println(obj.calculateTotalWorkers(10,4));
	}
}

