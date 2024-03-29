package edu.kh.test.user.model.dao;

import static edu.kh.test.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.kh.test.user.vo.User;

public class UserDAO {
	
	PreparedStatement pstmt;
	ResultSet rs;

	/**
	 * 유저 조회 DAO
	 * @param conn
	 * @param userNo
	 * @return user
	 * @throws Exception
	 */
	public User selectUser(Connection conn, int userNo) throws Exception{
		User user = new User();
		
		try {
			String sql = "SELECT * FROM TB_USER WHERE USER_NO = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userNo);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user.setUserNo(userNo);
				user.setUserId(rs.getString("USER_ID"));
				user.setUserName(rs.getString("USER_NAME"));
				user.setUserAge(rs.getInt("USER_AGE"));
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return user;
	}
}
