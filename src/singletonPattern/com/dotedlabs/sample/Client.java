/**
 * 
 */
package singletonPattern.com.dotedlabs.sample;

/**
 * @author Sandeep K Nair
 * 
 *         The client class that is used for testing
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle vehicle = Vehicle.getInstance();

		vehicle.getVehicleType();
	}

}
