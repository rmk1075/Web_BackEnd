package com.study.spring.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.out.println("init complete!");
		
		UserBean userBean = (UserBean)ac.getBean("userBean"); // search the element from the "applicationContext.xml"
		userBean.setName("kang");
		
		System.out.println(userBean.getName());
		
		UserBean userBean2 = (UserBean)ac.getBean("userBean");
		
		// these objects are same. -> because of singleton pattern - generate only one object
		if(userBean == userBean2) System.out.println("same instance");
	}
}
