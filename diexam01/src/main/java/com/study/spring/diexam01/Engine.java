package com.study.spring.diexam01;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public Engine() {
		System.out.println("Engine Constructor");
	}
	
	public void exec() {
		System.out.println("Engine executed");
	}
}
