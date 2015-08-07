/**
 * 
 */
package serviceLocatorPattern.com.dotedlabs.sample.utils;

import java.util.ArrayList;
import java.util.List;

import serviceLocatorPattern.com.dotedlabs.sample.services.Service;

/**
 * @author Sandeep K Nair
 * 
 *         A utility method for cashing the services.
 * 
 *         Please note, this is not an actual caching mechanism. Only used for
 *         demo purpose. The actual caching implementation will use the caching
 *         api's.
 *
 */
public class ServiceCacheUtil {
	private List<Service> services;

	public ServiceCacheUtil() {
		services = new ArrayList<Service>();
	}

	/**
	 * Returns the Service that is cached
	 * 
	 * @param serviceName
	 * @return
	 */
	public Service getService(String serviceName) {

		for (Service service : services) {
			if (service.getServiceName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning cached  " + serviceName
						+ " object");
				return service;
			}
		}
		return null;
	}

	/**
	 * Adds the Service into the cache
	 * 
	 * @param newService
	 */
	public void addService(Service newService) {
		boolean exists = false;

		for (Service service : services) {
			if (service.getServiceName().equalsIgnoreCase(
					newService.getServiceName())) {
				exists = true;
			}
		}
		if (!exists) {
			services.add(newService);
		}
	}

}
