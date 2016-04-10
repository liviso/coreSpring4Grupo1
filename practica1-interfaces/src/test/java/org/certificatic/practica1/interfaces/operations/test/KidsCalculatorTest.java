package org.certificatic.practica1.interfaces.operations.test;

import java.text.DecimalFormat;

import org.certificatic.practica1.interfaces.operations.api.IAdd;
import org.certificatic.practica1.interfaces.operations.api.ICalculator;
import org.certificatic.practica1.interfaces.operations.api.ISubtract;
import org.certificatic.practica1.interfaces.operations.api.impl.KidsCalculator;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KidsCalculatorTest {

	private DecimalFormat df = new DecimalFormat("#.00##");

	@Test
	public void kidsCalculatorTest(){
		log.info("kidsCalculatorTest -------------------");
		
		final ICalculator calculator = new KidsCalculator();
		final double expectedValue = 18D;
		calculator.set(5);
		((IAdd)calculator).add(5);
		((IAdd)calculator).add(10);
		((ISubtract)calculator).subtract(2);
		
		log.info("calculator.result()= {}", df.format(calculator.result()));
		
		Assert.assertEquals(expectedValue, calculator.result(), 0.0001);
	}
	
	@Test
	public void kidsCalculator2Test(){
		log.info("kidsCalculator2Test -------------------");
		
		final ICalculator calculator = new KidsCalculator();
		final double expectedValue = 18D;
		
		calculator.set(5);
		((ISubtract)calculator).subtract(2);
		((IAdd)calculator).add(10);
		((IAdd)calculator).add(5);
		
		log.info("calculator.result()= {}", df.format(calculator.result()));
		
		Assert.assertEquals(expectedValue, calculator.result(), 0.0001);
	}
	
}
