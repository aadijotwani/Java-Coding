package methodAssement;

public class TripCost 
{
	int calculateTripCost(int d, int Kmcost)
	{
		int totalTripCost = d*Kmcost;
		System.out.println("Total cost of trip = ₹"+totalTripCost);
		return totalTripCost;
	}
	public static void main(String[] args) 
	{
		TripCost obj = new TripCost();
		obj.calculateTripCost(250, 50);
	}

}
