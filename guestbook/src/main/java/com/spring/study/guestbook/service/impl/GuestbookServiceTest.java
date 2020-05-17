package com.spring.study.guestbook.service.impl;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.study.guestbook.config.ApplicationConfig;
import com.spring.study.guestbook.dto.Guestbook;
import com.spring.study.guestbook.service.GuestbookService;

public class GuestbookServiceTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		GuestbookService guestbookService = ac.getBean(GuestbookService.class);
		
		Guestbook guestbook = new Guestbook();
		guestbook.setName("재민");
		guestbook.setContent("for exception test");
		guestbook.setRegdate(new Date());
		Guestbook result = guestbookService.addGuestbook(guestbook, "127.0.0.1");
		System.out.println(result);
		
		guestbookService.deleteGuestbook(8L, "127.0.0.1");
	}
}
