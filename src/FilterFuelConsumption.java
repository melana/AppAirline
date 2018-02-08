import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilterFuelConsumption {

	public StringBuilder FilterFuelConsumption (Airline airline, int a, int b) {
    		List<Airplane> filterfleet = new ArrayList <> ();
    		

    		for ( int i = 0 ; i < airline.fleetOfAirplanes.size(); i++ ) {
    			if (airline.fleetOfAirplanes.get(i).getFuelConsumption() >= a &&  airline.fleetOfAirplanes.get(i).getFuelConsumption() <= b ) {
    				filterfleet.add(airline.fleetOfAirplanes.get(i));
    			}
    		}
    		
    		StringBuilder builder = new StringBuilder();
    		for(int i = 0 ; i < filterfleet.size(); i++){
    			builder.append(filterfleet.get(i).getName() + 
    			   			   "  - hourly fuel consumption is " + 
    			   			filterfleet.get(i).getFuelConsumption() + " kg" + "\n");
            }
    		
    		return builder;
	}		
    	
	
}
