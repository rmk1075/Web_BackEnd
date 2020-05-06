package com.study.spring.calculatorcli;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {
	public int plus(int val1, int val2) {
		return val1 + val2;
	}
	
	public int minus(int val1, int val2) {
		return val1 - val2;
	}
	
	public int multiple(int val1, int val2) {
		return val1 * val2;
	}
	
	public int divide(int val1, int val2) throws ArithmeticException {
		return val1 / val2;
	}
}
