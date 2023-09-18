package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myApp.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd()
	{
		int a=20;
		int b=30;
		int express=50;
		
		int actres=Calculator.add(a, b);
		
		assertEquals(express,actres);
	}
	
	@Test
	public void testSubtract()
	{
		int express=20;
		int actres=Calculator.substract(50,30);
		assertEquals(express,actres);
	}
	
	@Test
	public void testMultiply()
	{
		int express=15;
		int actres=Calculator.multiply(5,3);
		assertEquals(express,actres);
	}
	
	@Test
	public void testDivide()
	{
		int express=5;
		int actres=Calculator.divide(15,3);
		assertEquals(express,actres);
	}

}
