/**
 * 
 */
package serviceLocatorPattern.com.dotedlabs.sample;

import serviceLocatorPattern.com.dotedlabs.sample.services.Service;

/**
 * @author Sandeep K Nair
 * 
 *         The client class that is used for testing
 *
 */
public class Client {
	public static void main(String[] args) {
		// Search for the first service, if not present creates a new service
		// object and caches it
		Service service = ServiceLocator.getService("FIRST_SERVICE");
		service.execute();

		// Search for the second service, if not present creates a new service
		// object and caches it
		service = ServiceLocator.getService("SECOND_SERVICE");
		service.execute();

		// This time load from the cash
		service = ServiceLocator.getService("FIRST_SERVICE");
		service.execute();

		// This time load from the cash
		service = ServiceLocator.getService("SECOND_SERVICE");
		service.execute();
	}
}
