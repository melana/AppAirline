
public class An_158 extends Airplane {
	
	private static String name = "An-158"; // The name of the plane model
	private static int capacity = 99; // Max. number of passengers
	private static int carryingCapacity = 9800; // Max. commercial loading (kg)
	private static int flightRange = 2500; // Flight range with max. loading (km)
	private static int fuelConsumption = 1800; // Hourly fuel consumption (kg)


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
