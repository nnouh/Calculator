package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import calculator.Calculator;

public class CalculatorTest {

	private Calculator cal;
	@BeforeTest
	public void setup() {
		cal = new Calculator();
	}
	@Test
	public void testAdd() { 
		int a = 15; int b = 20; 
		int expectedResult = 35;
		long result = cal.add(a, b);
		Assert.assertEquals(expectedResult, result);

	}
	@Test
	public void testSubtract() {
		int a = 25; int b = 20; 
		int expectedResult = 5; 
		long result = cal.subtract(a, b);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testMultiply() {
		int a = 10; int b = 25;
		long expectedResult = 250;
		long result = cal.multiply(a, b);
		Assert.assertEquals(expectedResult, result);
	}

	@Test
	public void testDivide() {
		int a = 56; int b = 10; 
		double expectedResult = 5.6; 
		double result = cal.divid(a, b);
		Assert.assertEquals(expectedResult, result,0.00005); 
	}
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testDivideByZero() { 
		int a = 15; int b = 0;
		cal.divid(a, b);
	} 



}
