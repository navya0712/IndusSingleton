package com.indus.training.core.impl;

import com.indus.training.core.svc.ICalci;

/**
 * Implements ICalci interface to provide basic arithmetic operations
 */
public class Calci implements ICalci {

	private static Calci calObj = null;

	/**
	 * Overloaded default constructor to restrict the instance creation from outside
	 */
	private Calci() {

	}

	/**
	 * Performs addition of two double values
	 */
	@Override
	public double addition(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 + param2;
		}
		return result;
	}

	/**
	 * Performs subtraction of two double values
	 */
	@Override
	public double subtract(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 - param2;
		}
		return result;
	}

	/**
	 * Performs multiplication of two double values
	 */
	@Override
	public double multiply(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 * param2;
		}
		return result;
	}

	/**
	 * Performs Division of two double values
	 */
	@Override
	public double division(double param1, double param2) {
		double result = 0.0;
		{

			result = param1 / param2;
		}
		return result;
	}

	/**
	 * To get instance if already exists or create new instance and returns it
	 * 
	 * @return the instance of Calci
	 */
	public static Calci createInstance() {
		if (calObj == null) {
			calObj = new Calci();
		}
		return calObj;
	}

}
