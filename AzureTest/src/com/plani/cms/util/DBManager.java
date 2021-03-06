package com.plani.cms.util;

import java.sql.*;

public class DBManager {
	
	public static Connection getConnection() {
		
		Connection conn = null;

		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://eclipsekayh.mysql.database.azure.com:3306/test?useSSL=true&requireSSL=false", 
					"dbadmin@eclipsekayh", "1q2w3e4r!"); // 이 곳을 알맞게 수정
			System.out.println("DB 연결 성공 :  " + conn);			

		} catch (SQLException ex) {
			System.out.println("SQLException" + ex);
		}

		catch (Exception ex) {
			System.out.println("Exception" + ex);
		}
		
		return conn;
	
	}
	
	// select을 수행한 후 리소스 해제를 위한 메소드
	public static void close(Connection conn, Statement stmt, ResultSet rs){
		try{
			rs.close();
			stmt.close();
			conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// DML(insert, update, delete)을 수행한 후 리소스 해제를 위한 메소드
	public static void close(Connection conn, Statement stmt){
		try{
			stmt.close();
			conn.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
