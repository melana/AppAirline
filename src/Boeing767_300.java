
public class Boeing767_300 extends Airplane {
	
	private static String name = "Boeing 767-300"; // The name of the plane model
	private static int capacity = 328; // Max. number of passengers
	private static int carryingCapacity = 40230; // Max. commercial loading (kg)
	private static int flightRange = 9700; // Flight range with max. loading (km)
	private static int fuelConsumption = 4500; // Hourly fuel consumption (kg)
	

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
