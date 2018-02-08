
public class Boeing737_400 extends Airplane {
	
	private static String name = "Boeing 737-400"; // The name of the plane model
	private static int capacity = 171; // Max. number of passengers
	private static int carryingCapacity = 18260; // Max. commercial loading (kg)
	private static int flightRange = 3500; // Flight range with max. loading (km)
	private static int fuelConsumption = 2600; // Hourly fuel consumption (kg)


	public String getName() {
		return name;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getCarryingCapacity() {
		return carryingCapacity;
	}
	
	public int getFlightRange() {
		return flightRange;
	}
	
	public int getFuelConsumption() {
		return fuelConsumption;
	}

}
