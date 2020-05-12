package com.spring.study.guestbook.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "com.spring.study.guestbook.dao",  "com.spring.study.guestbook.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}