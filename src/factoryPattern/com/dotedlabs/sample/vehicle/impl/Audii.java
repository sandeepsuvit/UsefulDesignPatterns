/**
 * 
 */
package factoryPattern.com.dotedlabs.sample.vehicle.impl;

import factoryPattern.com.dotedlabs.sample.vehicle.Car;

/**
 * @author Sandeep K Nair
 * 
 *         Implementation class for Audii
 *
 */
public class Audii implements Car {

	/*
	 * (non-Javadoc)
	 * 
	 * @see factoryPattern.com.dotedlabs.sample.vehicle.Car#getModelName()
	 */
	@Override
	public String getModelName() {
		return "Audi A3";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factoryPattern.com.dotedlabs.sample.vehicle.Car#getCost()
	 */
	@Override
	public String getCost() {
		// TODO Auto-generated method stub
		return "Rs24.56 - 34.06 lakhs";
	}

}
