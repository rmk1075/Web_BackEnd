package com.study.spring.calculatorcli;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	private final CalculatorService calculatorService;
	
	public MyService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public int execute(int val1, int val2) {
		return calculatorService.plus(val1, val2) * 2;
	}
}
