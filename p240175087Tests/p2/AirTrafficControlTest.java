package p2;
/**
* 
* @author 40175087 Jason McKillen
*
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import p2.AirTrafficControl;

class AirTrafficControlTest {
	
	/**
	 * Instantiates the variables to be used in testing
	 */
	int currentSpeedValid, currentSpeedValidLower, currentSpeedValidUpper, currentSpeedInvalidLower, currentSpeedInvalidUpper;
	int distanceToAirfieldValid,distanceToAirfieldValidLower, distanceToAirfieldValidUpper, distanceToAirfieldInvalid,distanceToAirfieldInvalidLower, distanceToAirfieldInvalidUpper;
	int timeValid;
	String aircraftCodeValid, aircraftCodeInvalid, engineTypeValidJet, engineTypeValidPropeller, engineTypeInvalid;
	ArrayList<Airline> airlineList= new ArrayList<Airline>();
	Airline airline1;
	Airline airline2;
	Airline airline3;
	
	
	/**
	 * Assigns the values to the instantiated variables to avoid code repetition
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		currentSpeedValid = 400;
		currentSpeedValidLower = 0;
		currentSpeedValidUpper = 800;
		currentSpeedInvalidLower = -1;
		currentSpeedInvalidUpper = 801;
		distanceToAirfieldValid = 400;
		distanceToAirfieldValidLower = 1;
		distanceToAirfieldValidUpper = 20000;
		distanceToAirfieldInvalidLower = 0;
		distanceToAirfieldInvalidUpper = 20001;
		aircraftCodeValid = "A12345";
		aircraftCodeInvalid = "";
		engineTypeValidJet = "jet";
		engineTypeValidPropeller = "propeller";
		engineTypeInvalid = "";
		airline1 = new Airline(currentSpeedValid, distanceToAirfieldValid, aircraftCodeValid, engineTypeValidJet);
		airline2 = new Airline(currentSpeedValidLower, distanceToAirfieldValidLower, aircraftCodeValid, engineTypeValidJet);
		airline3 = new Airline(currentSpeedValidUpper, distanceToAirfieldValidUpper, aircraftCodeValid, engineTypeValidPropeller);
		airlineList.add(airline1);
		
	}

	/** Tests each method in the utility class by checking if the search has returned an array containing the correct objects and omitting the incorrect ones
	 * 
	 */
	@Test
	void testSearchBySpeed() {
		
		ArrayList<Airline> results = AirTrafficControl.searchBySpeed(airlineList, currentSpeedValidLower, currentSpeedValid);
		assertTrue(results.contains(airline1));
		assertFalse(results.contains(airline3));
	}

	@Test
	void testSearchByEngineType() {
		ArrayList<Airline> results = AirTrafficControl.searchByEngineType(airlineList, engineTypeValidJet);
		assertTrue(results.contains(airline1));
		assertFalse(results.contains(airline3));
	}

	@Test
	void testSearchForLandingList() {
		ArrayList<Airline> results = AirTrafficControl.searchForLandingList(airlineList, engineTypeValidJet, 0, 500);
		assertTrue(results.contains(airline1));
	}

}
