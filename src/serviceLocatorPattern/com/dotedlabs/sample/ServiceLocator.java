/**
 * 
 */
package serviceLocatorPattern.com.dotedlabs.sample;


import javax.naming.NamingException;

import serviceLocatorPattern.com.dotedlabs.sample.services.Service;
import serviceLocatorPattern.com.dotedlabs.sample.utils.ServiceCacheUtil;

/**
 * @author Sandeep K Nair
 * 
 *         The service locator class which would scan the services available in
 *         the cache. If the service is not available in the cache it would
 *         instantiate the service form the registry through JNDI lookup
 *
 */
public class ServiceLocator {
	private static ServiceCacheUtil cachedServices;

	static {
		cachedServices = new ServiceCacheUtil();
	}
	
	/**
	 * Get the service based on the service name
	 * 
	 * @param jndiName
	 * @return
	 * @throws NamingException
	 */
	public static Service getService(String jndiName){

		Service service = cachedServices.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContextLookup context = new InitialContextLookup();
		service = (Service) context.lookup(jndiName);
		cachedServices.addService(service);
		return service;
	}
}
