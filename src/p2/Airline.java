package p2;
/**
* 
* @author 40175087 Jason McKillen
*
*/
public class Airline extends Aircraft implements IAircraft {
	
	/** Instantiates the reference variable of the subclass
	 * 
	 */
	private String engineType;
	
	/** 
	 * Default constructor 
	 */
	public Airline() {
	
	}
	
	/**
	 * Constructor with args
	 * @param currentSpeed
	 * @param distanceToAirfield
	 * @param aircraftCode
	 * @param engineType
	 */
	public Airline(int currentSpeed, int distanceToAirfield, String aircraftCode, String engineType) {
		super(currentSpeed, distanceToAirfield, aircraftCode);
		this.engineType = engineType;
	}
	
	/**
	 * 
	 * @return A string of the type of engine
	 */
	public String getEngineType() {
		return engineType;
	}
	/**
	 * 
	 * @param engineType to be set.
	 * Business rules applied: Must be a value of either jet or propeller. 
	 */
	public void setEngineType(String engineType) throws IllegalArgumentException {
		if(engineType.equalsIgnoreCase("jet") || engineType.equalsIgnoreCase("propeller")) {
			this.engineType = engineType;
		} else {
			throw new IllegalArgumentException("INVALID ENGINE TYPE. TYPE MUST BE EITHER JET OR PROPELLER");
		}
	}
	
	
	/**
	 * Override attribute not needed here because the parent class does not implement this method.
	 * @implNote Implements the method as required by the IAircraft interface.
	 * @return Returns the time to an airfield in minutes, as determined by the airline's current speed and distance to the airfield.
	 */
	
	public double timeToAirfield() {
		double time = this.getDistanceToAirfield() / this.getCurrentSpeed() * 60;
		return time;
	}
	
	
}
