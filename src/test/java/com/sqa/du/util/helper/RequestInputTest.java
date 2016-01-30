package com.sqa.du.util.helper;

import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class RequestInputTest {

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#addStringElement(java.lang.String[], java.lang.String)}
	 * .
	 */
	@Test
	public void testAddStringElement() {
		// Initialize an array with elements
		String[] myElements = new String[] { "baseball", "soccer ball", "football", "tennis ball" };
		// Add another element to it
		String[] myNewElements = RequestInput.addStringElement(myElements, "racket ball");
		// Display old array of elements
		System.out.println("Old elements:" + Arrays.toString(myElements));
		// Display new array of elements
		System.out.println("New elements:" + Arrays.toString(myNewElements));
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getBoolean(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetBoolean() {
		boolean value = RequestInput.getBoolean("Are you learning anything today?");
		System.out.println("The result of your learning is " + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getChar(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetCharString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getChar(java.lang.String, char[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetCharStringCharArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getDouble(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetDouble() {
		Double value = RequestInput.getDouble("How much cash do you have on hand?");
		System.out.println("The amount of money in your pocket is $" + value);
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getInt(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getString(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.sqa.CM.util.helper.RequestInput#getString(java.lang.String, java.lang.String[])}
	 * .
	 */
	@Test
	@Ignore
	public void testGetStringStringStringArray() {
		fail("Not yet implemented");
	}

}
