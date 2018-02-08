
public class An_148_100Е extends Airplane {

	private static String name = "An-148-100Е"; // The name of the plane model
	private static int capacity = 80; // Max. number of passengers
	private static int carryingCapacity = 9000; // Max. commercial loading (kg)
	private static int flightRange = 4400; // Flight range with max. loading (km)
	private static int fuelConsumption = 1650; // Hourly fuel consumption (kg)
	

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
