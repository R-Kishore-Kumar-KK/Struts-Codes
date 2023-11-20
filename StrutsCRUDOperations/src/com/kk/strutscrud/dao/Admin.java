package com.kk.strutscrud.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Admin {

	public int registerUser(String emp_name, String emp_email, String emp_pass, String emp_deg) throws Exception;
	
	public ResultSet report() throws SQLException, Exception;
	
	public ResultSet fetchUserDetails(String emp_email) throws SQLException, Exception;
	
	public int updateUserDetails(String emp_name, String emp_email, String emp_pass, String emp_deg, String emp_emailhidden) throws SQLException, Exception;
	
	public int deleteUserDetails(String emp_email) throws SQLException, Exception;
}
