import java.util.*;

public class ApplicationTest {

	public static void main(String[] args) {
		
		
	// Create new airline company
		Airline airline = new Airline();
		airline.setName("My company");
		List<Airplane> fleetOfAirplanes = new ArrayList <> ();
		airline.setFleetOfAirplanes(fleetOfAirplanes);
		
	// Fill airline's fleet of aircraft
		airline.fleetOfAirplanes.add(new Boeing747_200B());
		airline.fleetOfAirplanes.add(new Boeing747_200B());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing767_300());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new Boeing737_400());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_148_100Е());
		airline.fleetOfAirplanes.add(new An_158());
		airline.fleetOfAirplanes.add(new An_158());
		airline.fleetOfAirplanes.add(new An_158());
		airline.fleetOfAirplanes.add(new An_158());
		
		
		
//		System.out.println(airline.totalCapacity());
//		System.out.println(airline.totalCarryingCapacity());
		
//		System.out.print (new SortFlyRange().SortFlyRange(airline));
		System.out.print (new FilterFuelConsumption().FilterFuelConsumption(airline, 1000,15000));
	
		
//		System.out.print ("min" + new FilterFuelConsumption().MinFuelConsumpt(airline));
	}

}
