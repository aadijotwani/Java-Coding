package methodAssement;

public class FuelEfficiency 
{
	void calculateFuelEfficiency(float distance, float fuelConsumned)
	{
		float fuelEfficiency = distance/fuelConsumned;
		System.out.println("Fuel Efficiency = "+fuelEfficiency);
	}
	public static void main(String[] args) 
	{
		FuelEfficiency obj  =  new FuelEfficiency();
		obj.calculateFuelEfficiency(600, 40);
	}

}
