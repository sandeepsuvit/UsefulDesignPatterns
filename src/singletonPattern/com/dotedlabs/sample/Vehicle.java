/**
 * 
 */
package singletonPattern.com.dotedlabs.sample;

/**
 * @author Sandeep K Nair
 * 
 *         A Vehicle class that returns a instance of the vehicle
 *
 */
public class Vehicle {
	private static Vehicle vehicleInstance = new Vehicle();

	private Vehicle() {
	}

	public static Vehicle getInstance() {
		return vehicleInstance;
	}

	public void getVehicleType() {
		System.out.println("I am a CAR");
	}

}
