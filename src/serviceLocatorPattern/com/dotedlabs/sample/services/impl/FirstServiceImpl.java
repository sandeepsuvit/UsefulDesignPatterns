/**
 * 
 */
package serviceLocatorPattern.com.dotedlabs.sample.services.impl;

import serviceLocatorPattern.com.dotedlabs.sample.services.Service;

/**
 * @author Sandeep K Nair
 * 
 *         The implementation class for the service interface
 *
 */
public class FirstServiceImpl implements Service {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * serviceLocatorPattern.com.dotedlabs.sample.services.Service#getServiceName
	 * ()
	 */
	@Override
	public String getServiceName() {
		return "FIRST_SERVICE";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * serviceLocatorPattern.com.dotedlabs.sample.services.Service#execute()
	 */
	@Override
	public void execute() {
		System.out.println("Executing FIRST_SERVICE...");
	}

}
