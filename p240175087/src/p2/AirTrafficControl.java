package p2;
/**
* 
* @author 40175087 Jason McKillen
*
*/
import java.util.ArrayList;

public class AirTrafficControl {

	/**
	 * 
	 * @param airlineList A list of all airlines to be searched
	 * @param lowerSpeed The desired search term for the inclusive lower boundary of current speed
	 * @param upperSpeed The desired search term for the inclusive upper boundary of current speed
	 * @return Returns an arrayList of type airline, which includes all airlines with current speeds between the set boundaries
	 */
	
	public static ArrayList<Airline> searchBySpeed(ArrayList<Airline> airlineList, int lowerSpeed, int upperSpeed) {
		ArrayList<Airline> results = new ArrayList<Airline>();
		for(Airline airline:airlineList) {
			if(airline.getCurrentSpeed() >= lowerSpeed && airline.getCurrentSpeed() <= upperSpeed) {
				results.add(airline);
			}
		}
		return results;
	}
	
	/**
	 * 
	 * @param airlineList A list of all airlines to be searched
	 * @param engineType The desired search term for the type of engine in the airline
	 * @param timeLowerBoundary The desired search term for the inclusive lower boundary of the time until the airline reaches the runway
	 * @param timeUpperBoundary The desired search term for the inclusive lower boundary of the time until the airline reaches the runway
	 * @return Returns an arrayList of type airline, which includes all airlines with an engine type matching that of the search term and a time to landing within the specified boundaries
	 */
	
	public static ArrayList<Airline> searchByEngineType(ArrayList<Airline> airlineList, String engineType) {
		ArrayList<Airline> results = new ArrayList<Airline>();
		for(Airline airline:airlineList) {
			if(airline.getEngineType().equalsIgnoreCase(engineType)) {
				results.add(airline);
			}
		}
		return results;
	}
	
	/**
	 * 
	 * @param airlineList A list of all airlines to be searched
	 * @param engineType The desired search term for the type of engine in the airline
	 * @return Returns an arrayList of type airline, which includes all airlines with an engine type matching that of the search term
	 */
	
	public static ArrayList<Airline> searchForLandingList(ArrayList<Airline> airlineList, String engineType, int lowerTimeBoundary, int upperTimeBoundary) {
		ArrayList<Airline> results = new ArrayList<Airline>();
		for(Airline airline:airlineList) {
			if((airline.timeToAirfield() >= lowerTimeBoundary && airline.timeToAirfield() <= upperTimeBoundary) && airline.getEngineType().equalsIgnoreCase(engineType)) {
				results.add(airline);
			}
		}
		return results;
	}
}
 