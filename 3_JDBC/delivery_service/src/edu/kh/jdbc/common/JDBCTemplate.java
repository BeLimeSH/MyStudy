package edu.kh.jdbc.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	
	//필드
	private static Connection conn;
	
	//메서드
	
	//DB 연결 정보를 담고있는 Connection 객체 반환 메서드
	public static Connection getConnection() {
		
		try {
			
			if(conn == null || conn.isClosed()) {
				
				Properties prop = new Properties();
				
				//driver.xml 파일 읽어오기
				prop.loadFromXML(new FileInputStream("driver.xml"));
				
				//커넥션 생성 준비
				String driver = prop.getProperty("driver");
				String url = prop.getProperty("url");
				String user = prop.getProperty("user");
				String password = prop.getProperty("password");
				
				//커넥션 생성
				// 1) jdbc 드라이버 메모리 로드
				Class.forName(driver);
				
				// 2) DriverManager를 통해 Connection 생성
				conn = DriverManager.getConnection(url, user, password);
				
				// 3) 트랜잭션 제어를 위한 자동 커밋 비활성화
				conn.setAutoCommit(false);		
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//close() 메서드 작성
	//Connection 반환 메서드
	public static void close(Connection conn) { 	
		try {
			//참조하는 Connection이 있으면서 닫혀있지 않은 경우
			if(conn != null && !conn.isClosed()) {
								//conn.isClosed() : 닫혀있으면 true
				conn.close();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Statement(부모), PreparedStatement(자식) 반환 메서드 (다형성 적용)
	public static void close(Statement stmt) { 	
		try {
			//참조하는 Statement이 있으면서 닫혀있지 않은 경우
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//ResultSet 반환 메서드
	public static void close(ResultSet rs) { 	
		try {
			//참조하는 ResultSet이 있으면서 닫혀있지 않은 경우
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//트랜잭션 제어
	
	//commit 메서드
	public static void commit(Connection conn) { 	
		try {
			//참조하는 Connection이 있으면서 닫혀있지 않은 경우
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//rollback 메서드
	public static void rollback(Connection conn) { 	
		try {
			//참조하는 Connection이 있으면서 닫혀있지 않은 경우
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
