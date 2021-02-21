package p2;

/**
 * 
 * @author 40175087 Jason McKillen
 *
 */
public abstract class Aircraft {

	/** Instantiates the three reference variables
	 * 
	 */
	private int currentSpeed; 
	private int distanceToAirfield; 
	private String aircraftCode; 

	/**
	 * Default constructor
	 */
	public Aircraft() {

	}

	/**
	 * Constructor with args
	 * @param currentSpeed
	 * @param distanceToAirfield
	 * @param aircraftCode
	 */
	public Aircraft(int currentSpeed, int distanceToAirfield, String aircraftCode) {
		this.currentSpeed = currentSpeed;
		this.distanceToAirfield = distanceToAirfield;
		this.aircraftCode = aircraftCode;
	}

	/**
	 * 
	 * @return Returns the current speed in miles per hour as an integer
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * 
	 * @param currentSpeed
	 * Business rules applied: Must be between 0 and 800 mph (inclusive).
	 */
	public void setCurrentSpeed(int currentSpeed) throws IllegalArgumentException {
		if(currentSpeed >=0 && currentSpeed <=800) {
			this.currentSpeed = currentSpeed;
		} else {
			throw new IllegalArgumentException("INVALID SPEED. VALUES MUST BE BETWEEN 0 AND 800 (INCLUSIVE).");
		}
	}

	/**
	 * 
	 * @return Returns an int of the distance to the airfield in miles
	 */
	public int getDistanceToAirfield() {
		return distanceToAirfield;
	}

	/**
	 * 
	 * @param distanceToAirfield
	 * Business rules applied: Must be between 1 and 20000 miles (inclusive).
	 */
	public void setDistanceToAirfield(int distanceToAirfield) throws IllegalArgumentException {
		if(distanceToAirfield >= 1 && distanceToAirfield <=20000) {
			this.distanceToAirfield = distanceToAirfield;
		} else {
			throw new IllegalArgumentException("INVALID DISTANCE TO AIRFIELD. VALUES MUST BE BETWEEN 1 AND 20000 (INCLUSIVE).");
		}
		

	}

	/**
	 * @return the aircraftCode
	 */
	public String getAircraftCode() {
		return aircraftCode;
	}

	/**
	 * 
	 * @param aircraftCode
	 * Business rules applied: Must be 6 characters in length, with no whitespace. Must begin with "A", and "A" must be uppercase.
	 */
	public void setAircraftCode(String aircraftCode) throws IllegalArgumentException  {
		String aircraftCodeStripped = aircraftCode.stripTrailing();
		if(aircraftCodeStripped.length() == 6 && aircraftCodeStripped.startsWith("A")) {
			this.aircraftCode = aircraftCodeStripped;
		} else {
			throw new IllegalArgumentException("INVALID CODE. CODE MUST BE SIX CHARACTERS LONG, BEGIN WITH A AND HAVE NO WHITESPACE");
		}
	}
	
	

}
