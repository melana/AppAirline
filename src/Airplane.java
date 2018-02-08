
public abstract class Airplane {
	
	private String name; // The name of the plane model
	private int capacity; // Max. number of passengers
	private int carryingCapacity; // Max. commercial loading (kg)
	private int flightRange; // Flight range with max. loading (km)
	private int fuelConsumption; // Hourly fuel consumption (kg)
	
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
