/**
 * 
 */
package factoryPattern.com.dotedlabs.sample.factory;

import factoryPattern.com.dotedlabs.sample.vehicle.Car;
import factoryPattern.com.dotedlabs.sample.vehicle.impl.Audii;
import factoryPattern.com.dotedlabs.sample.vehicle.impl.Benz;

/**
 * @author Sandeep K Nair
 * 
 * Factory for generating car manufacturer
 * object as per the request.
 *
 */
public class CarFactory {
	/**
	 * This will return you the car manufacturer
	 * object based on the request made
	 * 
	 * @param manufacturer
	 * @return
	 */
	public Car getCar(String manufacturer) {
		if (manufacturer == null) {
			return null;
		}

		switch (manufacturer) {
		case "BENZ":
			return new Benz();
		case "AUDII":
			return new Audii();

		default:
			return null;
		}
	}
}
