/**
 * 
 */
package factoryPattern.com.dotedlabs.sample;

import factoryPattern.com.dotedlabs.sample.factory.CarFactory;
import factoryPattern.com.dotedlabs.sample.vehicle.Car;

/**
 * @author Sandeep K Nair
 * 
 *         The client class that is used for testing
 *
 */
public class Client {

	public static void main(String[] args) {
		// Instantiate the car factory
		CarFactory factory = new CarFactory();

		// Get a Benz manufacturer instance object
		Car benz = factory.getCar("BENZ");
		System.out.println("Car Name: " + benz.getModelName());
		System.out.println("Car Cost:" + benz.getCost());

		// Get a Audii manufacturer instance object
		Car audii = factory.getCar("AUDII");
		System.out.println("Car Name: " + audii.getModelName());
		System.out.println("Car Cost:" + audii.getCost());
	}

}
