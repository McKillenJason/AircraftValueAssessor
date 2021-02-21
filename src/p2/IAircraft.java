package p2;
/**
 * 
 * @author 40175087 Jason McKillen
 *
 */
public interface IAircraft {
	
	/** Declares the method to be implemented by all classes which implement the IAircraft interface
	 * 
	 * @return The implemented methods should return a value of type double, 
	 * which is the minutes required to reach the airfield,
	 * given a set speed and distance
	 */
	
	//Returns a double as it represents minutes
	public double timeToAirfield();
}
