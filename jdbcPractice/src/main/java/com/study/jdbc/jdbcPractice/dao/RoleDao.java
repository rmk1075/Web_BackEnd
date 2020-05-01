package com.study.jdbc.jdbcPractice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import com.study.jdbc.jdbcPractice.dto.Role;

public class RoleDao {
	private static String url = "jdbc:mysql://localhost:3306/backEnd";
	private static String user = "backEnd";
	private static String password = "backEnd";
	
	public List<Role> getRoles() {
		List<Role> list = new ArrayList<Role>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		String sql = "select * from role order by role_id";
		try (Connection conn = DriverManager.getConnection(url, user, password); PreparedStatement stmt = conn.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					list.add(new Role(rs.getInt("role_id"), rs.getString("description")));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Role getRole(Integer roleId) {
		Role role = null;
		
		// db connection
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select role_id, description from role where role_id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, roleId);
			
			rs = stmt.executeQuery();
			if(rs.next()) {
				role = new Role(rs.getInt("role_id"), rs.getString("description"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return role;
	}
	
	public int addRole(Role role) {
		int insertCount = 0;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into role (role_id, description) values(?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, role.getRoleId());
			stmt.setString(2, role.getDescription());
			
			insertCount = stmt.executeUpdate();
		} catch (MySQLIntegrityConstraintViolationException e) {
			// insert duplicate key error
			System.out.println("Error: there is a duplicate data for key '" + role.getRoleId() + "'");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return insertCount;
	}
	
	public int updateRole(Role role) {
		int updateCount = 0;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "update role set description = ? where role_id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, role.getDescription());
			stmt.setInt(2, role.getRoleId());
			
			updateCount = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return updateCount;
	}
	
	public int removeRole(Integer roleId) {
		int deleteCount = 0;
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "delete from role where role_id = ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, roleId);
			
			deleteCount = stmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
 			}catch (Exception e) {
 				e.printStackTrace();
			}
		}
		
		return deleteCount;
	}
}
