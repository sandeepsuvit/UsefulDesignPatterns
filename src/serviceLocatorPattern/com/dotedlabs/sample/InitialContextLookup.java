/**
 * 
 */
package serviceLocatorPattern.com.dotedlabs.sample;

import serviceLocatorPattern.com.dotedlabs.sample.services.impl.FirstServiceImpl;
import serviceLocatorPattern.com.dotedlabs.sample.services.impl.SecondServiceImpl;

/**
 * @author Sandeep K Nair
 * 
 *         This is the context lookup class which is used to instantiate the
 *         service from service registry
 *
 */
public class InitialContextLookup {

	/**
	 * Looks up the service name in the registry and then returns the service
	 * object requested.
	 * 
	 * @param jndiName
	 * @return
	 */
	public Object lookup(String jndiName) {
		if (jndiName.equalsIgnoreCase("FIRST_SERVICE")) {
			System.out
					.println("Looking up and creating a new First Service object");
			return new FirstServiceImpl();
		} else if (jndiName.equalsIgnoreCase("SECOND_SERVICE")) {
			System.out
					.println("Looking up and creating a new Second Service object");
			return new SecondServiceImpl();
		}
		return null;
	}
}
