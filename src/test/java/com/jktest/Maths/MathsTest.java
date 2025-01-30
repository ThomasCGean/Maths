package com.jktest.Maths;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathsTest {

	@Test
	void addTest() {
		Maths test = new Maths();
		int sum = test.addition(5,10);
		assertEquals(15, sum);
	}
	@Test
	void diffTest() {
		Maths test = new Maths();
		int difference = test.subtraction(4, 1);
		assertEquals(3, difference);
	}
	@Test
	void multTest() {
		Maths test = new Maths();
		int product = test.multiplication(4, 3);
		assertEquals(12,product);
	}
	@Test
	void divTest() {
		Maths test = new Maths();
		double quotient = test.division(10, 2);
		assertEquals(5,quotient);
	}
}
