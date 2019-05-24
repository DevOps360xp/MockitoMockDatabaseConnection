package com.javacodegeeks.simpleJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.javacodegeeks.simpleJUnit.MessageUtil;

public class TestJUnit {

	protected int value1, value2;

	// assigning the values
	protected void setUp() {
		value1 = 3;
		value2 = 3;
	}

	// test method to add two values
	public void testAdd01() {
		double result = value1 + value2;
		assertTrue(result == 6);
	}

	@Test
	public void testAdd02() {
		String str = "Junit is working fine";
		assertEquals("Junit is working fine", str);
	}

	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, messageUtil.printMessage());
	}

	@Test
	public void testAdd() {
		// test data
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";

		// check for equality
		assertEquals("Junit is working fine", str);

		// check for false condition
		assertFalse(num > 6);

		// check for not null value
		//assertNotNull(temp);
	}

}
