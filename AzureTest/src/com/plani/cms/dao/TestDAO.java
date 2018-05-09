package com.plani.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.plani.cms.dto.TestVO;
import com.plani.cms.util.DBManager;

public class TestDAO {

	private static TestDAO instance = new TestDAO();
	
	public static TestDAO getInstance() {
		return instance;
	}
	
	public void writeTest(TestVO tVo) {
		
		String sql = "insert into test values(?, ?)";
						
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, tVo.getTestName());
			pstmt.setInt(2, tVo.getTestNum());
						
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally {
			DBManager.close(conn, pstmt);
			
		}	
	}
	
	public List<TestVO> listTest() {
		
		String sql = "select * from test";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<TestVO> list = new ArrayList<TestVO>();
		
		try {
			conn = DBManager.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				TestVO tVo = new TestVO();
			
				tVo.setTestName(rs.getString("testname"));
				tVo.setTestNum(rs.getInt("testnum"));				
				
				list.add(tVo);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, stmt, rs);
		}
		return list;	
	}
	
}
