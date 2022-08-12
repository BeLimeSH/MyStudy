package edu.kh.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {

	public static void main(String[] args) {
		
		//예제 1번 다시 써보면서 분석하기
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int sum = 0;
		
		try {
			
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.
			String type = "jdbc:oracle:thin:@";
			String ip = "115.90.212.22";
			String port = ":20000";
			String sid = ":xe";
			String user = "ksh";
			String pw = "ksh1234";
			
			conn = DriverManager.getConnection(type + ip + port + sid, user, pw);
			
			//3. Statement 객체에 적재할 SQL 작성하기
			String sql = "SELECT EMP_ID, EMP_NAME, SALARY, DEPT_CODE FROM EMPLOYEE ORDER BY EMP_NAME";
			
			//4. Statement 객체 생성
			stmt = conn.createStatement();
			
			//5. SQL을 Statement에 적재 -> DB로 전달하여 수행한 후 
			// 결과를 반환 받아와 rs 변수에 대입
			rs = stmt.executeQuery(sql);
			
			// [3단계] SELECT 수행 결과를 한 행씩 접근하여 원하는 컬럼 값 얻어오기
			while(rs.next()) {
				
				int empId = rs.getInt("EMP_ID");
				String empName = rs.getString("EMP_NAME");
				int salary = rs.getInt("SALARY");
				String deptCode = rs.getString("DEPT_CODE");
				
				//결과 출력
				System.out.printf("사번 : %d  이름 : %s  급여 : %d  부서코드 : %s\n",
								   empId, empName, salary, deptCode);
				
				sum += salary;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("OJDBC 라이브러리 미등록 또는 경로 오타");
			e.printStackTrace();
			
		} finally {
			//사용한 자원 닫아주기
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
										
				} catch (SQLException e) {
					e.printStackTrace();
					
				}
		}
		System.out.println("급여 합계 : " + sum);	
	}
}
