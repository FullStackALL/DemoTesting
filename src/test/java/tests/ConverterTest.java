package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lib.Converter;

public class ConverterTest {
	
	@Test
	public void testKmToMile()
	{
		int length = 100;
		double exp = 62.1;
		
		double act=Converter.KmToMile(length);
		assertEquals(exp, act,0.01);
			
	}
	
	@Test
	public void testCelToFar()
	{
		int temp = 50;
		int exp = 122;
		
		int act = Converter.cToF(temp);
		assertEquals(exp,act);	
	}	
	
	@Test
	public void testmultiply()
	{
		System.out.println("This is multily method");
	}

}
