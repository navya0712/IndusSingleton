package com.indus.training.core.svc;

import com.indus.training.core.impl.Calci;

import junit.framework.TestCase;

/**
 * Provides Test Cases for Calci Class
 */
public class TestCalci extends TestCase {

	private Calci calObj1 = null;
	private Calci calObj2 = null;

	/**
	 * Sets Up the test environment
	 */
	protected void setUp() throws Exception {
		calObj1 = Calci.createInstance();
		calObj2 = Calci.createInstance();

	}

	/**
	 * Tears down the test environment
	 */
	protected void tearDown() throws Exception {
		calObj1 = null;
		calObj2 = null;

	}

	/**
	 * Tests if only one instance of Class is Created Per JVM
	 */
	public void testScenario() {
		int hashcodeObj1 = calObj1.hashCode();
		int hashcodeObj2 = calObj2.hashCode();
		assertEquals(hashcodeObj1, hashcodeObj2, 0);
	}

}
