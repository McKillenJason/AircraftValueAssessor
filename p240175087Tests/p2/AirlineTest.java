package p2;
/**
* 
* @author 40175087 Jason McKillen
*
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirlineTest {
	/**
	 * Instantiates the variables to be used in testing
	 */
	int currentSpeedValid, currentSpeedValidLower, currentSpeedValidUpper, currentSpeedInvalid, currentSpeedInvalidLower, currentSpeedInvalidUpper;
	int distanceToAirfieldValid,distanceToAirfieldValidLower, distanceToAirfieldValidUpper, distanceToAirfieldInvalid,distanceToAirfieldInvalidLower, distanceToAirfieldInvalidUpper;
	double timeValid;
	String aircraftCodeValid, aircraftCodeInvalid, engineTypeValidJet, engineTypeValidPropeller, engineTypeInvalid;
	
	
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
		currentSpeedInvalid = -50;
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
		timeValid = 60;
		
	}
	
	/**
	 * Calls the default constructor and asserts that the instance of the Airline object has been created
	 */
	@Test
	void testAirline() {
		Airline myAirline = new Airline();
		assertNotNull(myAirline);
	}

	/**
	 * Calls the constructor with args and asserts that the instance both exists and contains the data passed to it
	 */
	@Test
	void testAirlineIntIntStringString() {
		Airline myAirline = new Airline(currentSpeedValid, distanceToAirfieldValid, aircraftCodeValid, engineTypeValidJet);
		assertNotNull(myAirline);
		assertEquals(currentSpeedValid, myAirline.getCurrentSpeed());
		assertEquals(distanceToAirfieldValid, myAirline.getDistanceToAirfield());
		assertEquals(aircraftCodeValid, myAirline.getAircraftCode());
		assertEquals(engineTypeValidJet, myAirline.getEngineType());
		
	}

	
	/** Testing of each of the getters and setters, including those inherited from the parent Aircraft class
	 * 
	 */
	@Test
	void testGetEngineType() {
		Airline myAirline = new Airline();
		myAirline.setEngineType(engineTypeValidJet);
		assertEquals(engineTypeValidJet, myAirline.getEngineType());
	}

	@Test
	void testSetEngineType() {
		Airline myAirline = new Airline();
		assertThrows(IllegalArgumentException.class, () -> {
			myAirline.setEngineType(engineTypeInvalid);
		});
	}

	@Test
	void testGetCurrentSpeed() {
		Airline myAirline = new Airline();
		myAirline.setCurrentSpeed(currentSpeedValid);
		assertEquals(currentSpeedValid, myAirline.getCurrentSpeed());
	}

	@Test
	void testSetCurrentSpeed() {
		Airline myAirline = new Airline();
		assertThrows(IllegalArgumentException.class, () -> {
			myAirline.setCurrentSpeed(currentSpeedInvalid);
		});
	}

	@Test
	void testGetDistanceToAirfield() {
		Airline myAirline = new Airline();
		myAirline.setDistanceToAirfield(distanceToAirfieldValid);
		assertEquals(distanceToAirfieldValid, myAirline.getDistanceToAirfield());
	}

	@Test
	void testSetDistanceToAirfield() {
		Airline myAirline = new Airline();
		assertThrows(IllegalArgumentException.class, () -> {
			myAirline.setDistanceToAirfield(distanceToAirfieldInvalid);
		});
	}

	@Test
	void testGetAircraftCode() {
		Airline myAirline = new Airline();
		myAirline.setAircraftCode(aircraftCodeValid);
		assertEquals(aircraftCodeValid, myAirline.getAircraftCode());
	}

	@Test
	void testSetAircraftCode() {
		Airline myAirline = new Airline();
		assertThrows(IllegalArgumentException.class, () -> {
			myAirline.setAircraftCode(aircraftCodeInvalid);
		});
	}
	
	/**
	 * Tests the timeToAirfield method which is implemented from the IAircraft interface
	 */
	@Test
	void testTimeToAirfield() {
		Airline myAirline = new Airline();
		myAirline.setCurrentSpeed(currentSpeedValid);
		myAirline.setDistanceToAirfield(distanceToAirfieldValid);
		assertEquals(timeValid, myAirline.timeToAirfield());
	}

}
