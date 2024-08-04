package com.indus.training.core.svc;

/**
 * Defines Interface for basic arithmetic operations
 */
public interface ICalci {

	/**
	 * Adds two double values.
	 *
	 * @param param1 the first double value
	 * @param param2 the second double value
	 * @return the result of adding param1 and param2
	 */
	public abstract double addition(double param1, double param2);

	/**
	 * Subtracts the second double value from the first double value.
	 *
	 * @param param1 the first double value
	 * @param param2 the second double value
	 * @return the result of subtracting param2 from param1
	 */
	public abstract double subtract(double param1, double param2);

	/**
	 * Multiplies two double values.
	 *
	 * @param param1 the first double value
	 * @param param2 the second double value
	 * @return the result of multiplying param1 and param2
	 */
	public abstract double multiply(double param1, double param2);

	/**
	 * Divides the first double value by the second double value.
	 *
	 * @param param1 the first double value
	 * @param param2 the second double value
	 * @return the result of dividing param1 by param2
	 */
	public abstract double division(double param1, double param2);

}
