package com.kk.strutscrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminImpl implements Admin {

	public static Connection getConnection() throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection("jdbc:oracle:thin:@10.165.187.249:1521:ORCL19C", "ALG_DEV", "ALG_DEV");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/websparrow", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}*/
	}
	
	@Override
	public int registerUser(String emp_name, String emp_email, String emp_pass, String emp_deg) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO employee VALUES (?,?,?,?)";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, emp_name);
			ps.setString(2, emp_email);
			ps.setString(3, emp_pass);
			ps.setString(4, emp_deg);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	@Override
	public ResultSet report() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT EMP_NAME,EMP_EMAIL,EMP_PASS,EMP_DEG FROM employee";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	@Override
	public ResultSet fetchUserDetails(String emp_email) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT EMP_NAME,EMP_EMAIL,EMP_PASS,EMP_DEG FROM employee WHERE EMP_EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, emp_email);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	@Override
	public int updateUserDetails(String emp_name, String emp_email, String emp_pass, String emp_deg, String emp_emailhidden)
			throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "UPDATE employee SET EMP_NAME=?,EMP_EMAIL=?,EMP_PASS=?,EMP_DEG=? WHERE EMP_EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, emp_name);
			ps.setString(2, emp_email);
			ps.setString(3, emp_pass);
			ps.setString(4, emp_deg);
			ps.setString(5, emp_emailhidden);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

	@Override
	public int deleteUserDetails(String emp_email) throws SQLException, Exception {
		getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "DELETE FROM employee WHERE EMP_EMAIL=?";
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setString(1, emp_email);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			getConnection().rollback();
			return 0;
		} finally {
			if (getConnection() != null) {
				getConnection().close();
			}
		}
	}

}
