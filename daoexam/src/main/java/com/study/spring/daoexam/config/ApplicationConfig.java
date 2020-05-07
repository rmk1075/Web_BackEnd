package com.study.spring.daoexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.study.spring.daoexam.dao"})
@Import({DBConfig.class})
public class ApplicationConfig {
	
}
