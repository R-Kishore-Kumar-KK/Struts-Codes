package com.kk.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.kk.actions.RegisterAction;

public class Admin {

	public static Connection conn() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@10.165.187.249:1521:ORCL19C","ALG_DEV","ALG_DEV");
	}

	public static int register(RegisterAction ra) {
		int flag = 0;
		try {
			PreparedStatement ps = conn().prepareStatement("INSERT INTO db_test_table VALUES(?,?,?,?)");
			ps.setInt(1, ra.getId());
			ps.setString(2, ra.getName());
			ps.setString(3, ra.getEmail());
			ps.setString(4, ra.getCity());
			flag = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	
}
