
public class Boeing747_200B extends Airplane {

		private static String name = "Boeing 747-200B"; // The name of the plane model
		private static int capacity = 490; // Max. number of passengers
		private static int carryingCapacity = 67360; // Max. commercial loading (kg)
		private static int flightRange = 10660; // Flight range with max. loading (km)
		private static int fuelConsumption = 14500; // Hourly fuel consumption (kg)
		
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
