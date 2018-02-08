import java.util.ArrayList;
import java.util.*;

public class Airline {
	
	String name; // The  company's name
	List <Airplane> fleetOfAirplanes;  // Тhe airline's fleet of aircraft
	
	// Constructor
	public Airline () {
		String name;
		List <Airplane> fleetOfAirplanes = new  ArrayList <>();	
	}

	// Getters & Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Airplane> getFleetOfAirplanes() {
		return fleetOfAirplanes;
	}

	public void setFleetOfAirplanes(List<Airplane> fleetOfAirplanes) {
		this.fleetOfAirplanes = fleetOfAirplanes;
	}

	// Method for counting total capacity
	public int totalCapacity (){
		int result = 0;
		for (int i = 0; i < fleetOfAirplanes.size(); i ++ ) {
			result += fleetOfAirplanes.get(i).getCapacity();
		}
		return result;
	}
	
	// Method for counting total carrying capacity
		public int totalCarryingCapacity (){
			int result = 0;
			for (int i = 0; i < fleetOfAirplanes.size(); i ++ ) {
				result += fleetOfAirplanes.get(i).getCarryingCapacity();
			}
			return result;
		}
	
}
