/**
 * 
 */
package factoryPattern.com.dotedlabs.sample.vehicle.impl;

import factoryPattern.com.dotedlabs.sample.vehicle.Car;

/**
 * @author Sandeep K Nair
 * 
 *         Implementation class for Benz
 */
public class Benz implements Car {

	/*
	 * (non-Javadoc)
	 * 
	 * @see factoryPattern.com.dotedlabs.sample.vehicle.Car#getModelName()
	 */
	@Override
	public String getModelName() {
		return "Mercedes-Benz A-Class";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factoryPattern.com.dotedlabs.sample.vehicle.Car#getCost()
	 */
	@Override
	public String getCost() {
		// TODO Auto-generated method stub
		return "Rs27.94 - 28.96 lakhs";
	}

}
