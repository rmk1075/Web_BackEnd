package com.study.spring.calculatorcli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CalculatorServiceTest {
	@Autowired
	CalculatorService calculatorService;
	
	@Before
	public void init() {
		this.calculatorService = new CalculatorService();
	}
	
	@Test
	public void plus() throws Exception {
		int val1 = 10;
		int val2 = 5;
		
		int result = calculatorService.plus(val1, val2);
		
		Assert.assertEquals(15, result);
	}
	
	@Test
	public void divide() throws Exception {
		int val1 = 10;
		int val2 = 5;
		
		int result = calculatorService.divide(val1, val2);
		
		Assert.assertEquals(2, result);
//		Assert.assertEquals(3, result);
	}
	
	@Test
	public void divideExceptionTest() throws Exception {
		int val1 = 10;
		int val2 = 0;
		
		try {
			calculatorService.divide(val1, val2);
		} catch (ArithmeticException e) {
			Assert.assertTrue(true);
			return ;
		}
		Assert.fail();
	}
}
