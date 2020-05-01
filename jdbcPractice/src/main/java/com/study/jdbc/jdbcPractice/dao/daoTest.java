package com.study.jdbc.jdbcPractice.dao;

import com.study.jdbc.jdbcPractice.dto.Role;

public class daoTest {

	public static void main(String[] args) {
		// getRole
		System.out.println("get Role");
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(1);
		System.out.println(role);
		System.out.println("------------------------------");
		
		// addRole
		System.out.println(dao.getRole(10)); // before insert
		role = new Role(10, "put data id = 10");
		dao.addRole(role);
		System.out.println(dao.getRole(10)); // after insert
		System.out.println("------------------------------");
		
		// getRoles
		System.out.println("get Roles");
		for(Role r : dao.getRoles()) System.out.println(r);
		System.out.println("-----------------------------");
		
		// updateRole
		System.out.println("update Role");
		role = new Role(10, "description changed");
		System.out.println(dao.updateRole(role) + " data changed.");
		role = dao.getRole(10);
		System.out.println(role);
		System.out.println("-----------------------------");
		
		//removeRole
		System.out.println("remove Role");
		System.out.println(dao.removeRole(10) + " data deleted");
		System.out.println(dao.getRole(10));
		System.out.println("----------------------------");
	}
}
