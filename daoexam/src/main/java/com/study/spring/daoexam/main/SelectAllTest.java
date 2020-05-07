package com.study.spring.daoexam.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.daoexam.config.ApplicationConfig;
import com.study.spring.daoexam.dao.RoleDao;
import com.study.spring.daoexam.dto.Role;

public class SelectAllTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao dao = ac.getBean(RoleDao.class);
		
		List<Role> list = dao.selectAll();
		for(Role role : list) {
			System.out.println(role);
		}		
	}
}
