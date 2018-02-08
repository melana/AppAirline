package com.Globallogic.GlJavaProCamp.Entrytask.Airline;
import java.util.*;

public class SortFlyRange {
	
    // Class for sorting fleet of airplanes by flight range 
	
	public StringBuilder SortFlyRange (Airline airline) {

		Collections.sort(airline.fleetOfAirplanes, new Comparator<Airplane>() {
        @Override
        public int compare(Airplane a, Airplane b) {
        	return Integer.compare(
        			a.getFlightRange(),
        			b.getFlightRange()
        			);
        	}
        });
		
	// Use 	StringBuilder for practical display
		
		StringBuilder builder = new StringBuilder();
		for(int i =0 ; i < airline.fleetOfAirplanes.size(); i++){
			builder.append(airline.fleetOfAirplanes.get(i).getName() + 
			   			   "  - flight range is " + 
			   			   airline.fleetOfAirplanes.get(i).getFlightRange()+ " km" + "\n");
        }
		return builder;
                   
	}
                      
}
