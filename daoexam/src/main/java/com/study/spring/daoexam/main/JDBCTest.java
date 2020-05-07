package com.study.spring.daoexam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.daoexam.config.ApplicationConfig;
import com.study.spring.daoexam.dao.RoleDao;
import com.study.spring.daoexam.dto.Role;

public class JDBCTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		RoleDao roleDao = ac.getBean(RoleDao.class);
		
		Role role1 = new Role();
//		role.setRoleId(500);
//		role.setDescription("test insert");
		
//		int count = roleDao.insert(role);
//		System.out.println("insert " + count + " data");
		
		role1.setRoleId(2);
		role1.setDescription("'data updated'");
		int count = roleDao.update(role1);
		System.out.println("update " + count + " line");
		
		Role resultRole = roleDao.selectById(2);
		System.out.println(resultRole);
				
		int deleteCount = roleDao.deleteById(500);
		System.out.println(deleteCount + "건 삭제하였습니다.");
			
		Role resultRole2 = roleDao.selectById(500);
		System.out.println(resultRole2);
	}
}
