package edu.kh.jdbc.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jdbc.model.vo.Employee;

//DAO(Data Access Object) : 데이터 접근 객체
//- DB와 연결되어 SQL을 수행하고 결과를 반환 받는 역할
public class EmployeeDAO {
	
	//JDBC 객체 저장용 참조 변수 필드 선언
	
	private Connection conn;
	//DB 연결 정보를 담은 객체(java - DB 사이의 통로 역할)
	
	private Statement stmt;
	//Connection을 통해 SQL을 수행하고 결과를 반환 받는 객체
	
	private PreparedStatement pstmt;
	//Statement의 자식으로 좀 더 향상된 기능을 제공
	//- ?(위치홀더)를 이용하여 SQL에 작성되는 리터럴을 동적으로 제어 함.
	//--> 오타 위험 감소, 가독성 상승
	
	private ResultSet rs;
	//SELECT 수행 후 반환되는 객체
	
	
	/** 전체 사원 정보 조회 DAO
	 * @return
	 */
	public List<Employee> selectAll() {
		
		//결과 저장용 변수 준비
		List<Employee> empList = new ArrayList<Employee>();
		
		try {
		//1) Oracle JDBC Driver 메모리 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2) DB 연결 작업(Connection 얻어오기)
		String type = "jdbc:oracle:thin:@"; //오라클 드라이버 타입
		
//		String ip = "localhost"; //루프백 아이피와 같음(자기 컴퓨터)
//		String ip = "127.0.0.1"; //루프백 아이피(자기 컴퓨터)
		String ip = "115.90.212.22";
		
		String port = ":20000";  //개인컴퓨터는 1521 or 1522
		
		String sid = ":xe";  //접속할 DB 이름

		String user = "ksh"; //사용자 계정 명
		
		String pw = "ksh1234"; //사용자 계정 비밀번호
		
		conn = DriverManager.getConnection(type + ip + port + sid, user, pw);
		//DriverManager : Connection 생성 메서드 제공
		
		//3) 수행할 SQL 작성
		String sql = "SELECT * FROM EMPLOYEE2 ORDER BY EMP_ID";
				// *** SQL 작성시 세미콜론 작성X ***
		
		//4) Statement 객체 생성
		stmt = conn.createStatement();
		
		//5) SQL 수행 후 결과(ResultSet 반환 받기)
		rs = stmt.executeQuery(sql);
		// executeQuery() : SELECT문 수행 후 ResultSet 결과를 반환
		
		//6) 결과를 List에 옮겨 담기
		//-> ResultSet을 한 행씩 접근하여 컬럼값을 얻어와
		//   한 행의 정보가 담긴 Employee 객체를 생성하고
		//   이를 empList에 추가
		
		while(rs.next()) {
			//rs.next() : 다음 행이 있으면 true, 호출시 마다 다음 행으로 이동
			
			int empId = rs.getInt("EMP_ID"); //현재 행의 EMP_ID 컬럼 값을 int 자료형으로 얻어옴
			String empName = rs.getString("EMP_NAME");
			String empNo = rs.getString("EMP_NO");
			String email = rs.getString("EMAIL");
			String phone = rs.getString("PHONE");
			String deptCode = rs.getString("DEPT_CODE");
			String jobCode = rs.getString("JOB_CODE");
			String salLevel = rs.getString("SAL_LEVEL");
			int salary = rs.getInt("SALARY");
			double bonus = rs.getDouble("BONUS");
			int managerId = rs.getInt("MANAGER_ID");
			Date hireDate = rs.getDate("HIRE_DATE");
			Date entDate = rs.getDate("ENT_DATE");
			char entYn = rs.getString("ENT_YN").charAt(0);
			
			//rs.getChar()는 존재하지 않음
			//자바에서는 char 개념이 있지만 DB에서는 오로지 문자열 개념만 존재함.
			//-> String.chatAt(0)을 이용함
			
			//언어온 컬럼 값으로 객체 생성 후 초기화
			Employee emp = new Employee(empId, empName, empNo, email, phone,
										deptCode, jobCode, salLevel, salary,
										bonus, managerId, hireDate, entDate, entYn);
			//empList에 추가
			empList.add(emp);
		}
		} catch(Exception e) {
			//-> try에서 발생하는 모든 예외를 잡아서 처리
			
			e.printStackTrace();
		} finally {
			//7) 사용한 JDBC 자원 반환(close)
			
			try {
				if(rs != null)  rs.close();
				if(stmt != null)  stmt.close();
				if(conn != null)  conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
				
		}
		
		//8) List 호출부로 반환
		return empList;
	}


	/** 사번으로 사원 정보 조회 DAO
	 * @param input
	 * @return emp
	 */
	public Employee selectOne(int input) {
		
		Employee emp = null; //결과 저장용 변수
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String type = "jdbc:oracle:thin:@"; //오라클 드라이버 타입
			String ip = "115.90.212.22";
			String port = ":20000";  //개인컴퓨터는 1521 or 1522
			String sid = ":xe";  //접속할 DB 이름
			String user = "ksh"; //사용자 계정 명
			String pw = "ksh1234";
			
			conn = DriverManager.getConnection(type + ip + port + sid, user, pw);
			
			String sql = "SELECT * FROM EMPLOYEE2 WHERE EMP_ID = " + input;
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			//조회 결과가 있다면 1행 밖에 나오지 않으므로 
			//while 대신 if문을 사용
			if(rs.next()) {
				//조회 결과가 있으면 rs.next() == true == if문 수행
				//조회 결과가 없으면 rs.next() == false == if문 수행X -> Employee 객체 생성X
				
				int empId = rs.getInt("EMP_ID"); //현재 행의 EMP_ID 컬럼 값을 int 자료형으로 얻어옴
				String empName = rs.getString("EMP_NAME");
				String empNo = rs.getString("EMP_NO");
				String email = rs.getString("EMAIL");
				String phone = rs.getString("PHONE");
				String deptCode = rs.getString("DEPT_CODE");
				String jobCode = rs.getString("JOB_CODE");
				String salLevel = rs.getString("SAL_LEVEL");
				int salary = rs.getInt("SALARY");
				double bonus = rs.getDouble("BONUS");
				int managerId = rs.getInt("MANAGER_ID");
				Date hireDate = rs.getDate("HIRE_DATE");
				Date entDate = rs.getDate("ENT_DATE");
				char entYn = rs.getString("ENT_YN").charAt(0);
				
				emp = new Employee(empId, empName, empNo, email, phone,
						deptCode, jobCode, salLevel, salary,
						bonus, managerId, hireDate, entDate, entYn);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//조회 결과 있으면 Employee 객체 주소
		//없으면 null 반환
		return emp;
	}


	
	
	
	public List<Employee> selectSalary(int input) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		
		try {
		//1) Oracle JDBC Driver 메모리 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2) DB 연결 작업(Connection 얻어오기)
		String type = "jdbc:oracle:thin:@";
		String ip = "115.90.212.22";
		String port = ":20000"; 
		String sid = ":xe";
		String user = "ksh";
		String pw = "ksh1234";
		
		conn = DriverManager.getConnection(type + ip + port + sid, user, pw);
		//DriverManager : Connection 생성 메서드 제공
		
		//3) 수행할 SQL 작성
		String sql = "SELECT * FROM EMPLOYEE2 WHERE SALARY >= " + input + " ORDER BY EMP_ID";
		
		//4) Statement 객체 생성
		stmt = conn.createStatement();
		
		//5) SQL 수행 후 결과(ResultSet 반환 받기)
		rs = stmt.executeQuery(sql);
		
		
		//6) 결과를 List에 옮겨 담기
		while(rs.next()) {
			
			int empId = rs.getInt("EMP_ID");
			String empName = rs.getString("EMP_NAME");
			String empNo = rs.getString("EMP_NO");
			String email = rs.getString("EMAIL");
			String phone = rs.getString("PHONE");
			String deptCode = rs.getString("DEPT_CODE");
			String jobCode = rs.getString("JOB_CODE");
			String salLevel = rs.getString("SAL_LEVEL");
			int salary = rs.getInt("SALARY");
			double bonus = rs.getDouble("BONUS");
			int managerId = rs.getInt("MANAGER_ID");
			Date hireDate = rs.getDate("HIRE_DATE");
			Date entDate = rs.getDate("ENT_DATE");
			char entYn = rs.getString("ENT_YN").charAt(0);
			
			//언어온 컬럼 값으로 객체 생성 후 초기화
			Employee emp = new Employee(empId, empName, empNo, email, phone,
										deptCode, jobCode, salLevel, salary,
										bonus, managerId, hireDate, entDate, entYn);
			//empList에 추가
			empList.add(emp);
			
		}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//7) 사용한 JDBC 자원 반환(close)
			try {
				if(rs != null)  rs.close();
				if(stmt != null)  stmt.close();
				if(conn != null)  conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		
		return empList;
	}


	/** 새로운 사원 정보 추가 DAO
	 * @param emp
	 * @return result
	 */
	public int insertEmployee(Employee emp) {
		
		int result = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String type = "jdbc:oracle:thin:@"; //오라클 드라이버 타입
			String ip = "115.90.212.22";
			String port = ":20000";  //개인컴퓨터는 1521 or 1522
			String sid = ":xe";  //접속할 DB 이름
			String user = "ksh"; //사용자 계정 명
			String pw = "ksh1234";
			
			conn = DriverManager.getConnection(type + ip + port + sid, user, pw);
			// -> 생성된 커넥션을 이용해 SQL을 수행하면 자동 커밋이 된다(기본값)
			// --> 자동 커밋 기능을 끄고 개발자가 트랜잭션을 직접 제어하는게 좋음.
			
			conn.setAutoCommit(false); //자동 커밋 기능 비활성화
			// -> 자동 커밋을 비활성화 시켜도 
			//	  conn.close가 실행되면 남은 트랜잭션 내용이 모두 commit 된다. 
			
			//SQL 작성
			
			String sql = "INSERT INTO EMPLOYEE2 VALUES(?, ?, ?, ?, ?, ?, ?, 'S5', ?, ?, 200, SYSDATE, NULL, 'N')";
					// ? 기호 == 위치 홀더
			
			//Statement : 커넥션 생성 - SQL 작성 - Statement 객체 생성 - SQL 수행 후 결과 반환
			
			//PreparedStatement : 커넥션 생성 - SQL 작성(? 사용) - PreparedStatement 객체 생성(SQL 적재)
			//					- 위치홀더에 알맞은 값 대입 - SQL수행 후 결과 반환
			
			//PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			
			//위치홀더에 알맞은 값 대입
			//pstmt.set[Type](위치 홀더 순서, 값)
			
			pstmt.setInt(1, emp.getEmpId()); //입력받은 사번을 1번 ? 위치홀더에 세팅	
			pstmt.setString(2, emp.getEmpName());
			pstmt.setString(3, emp.getEmpNo());
			pstmt.setString(4, emp.getEmail());
			pstmt.setString(5, emp.getPhone());
			pstmt.setString(6, emp.getDeptCode());
			pstmt.setString(7, emp.getJobCode());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getBonus());
			
			//SQL 수행 후 결과 반환 받기
			//1) Statement - SELET			: stmt.executeQuery(sql);	
			//2) PeparedStatement - SELET 	: pstmt.executeQuery();
			
			// *** DML 수행 시 executeUpdate 사용 ***
			//3) Statement - DML			: stmt.executeUpdate(sql);
			//4) PreparedStatement - DML	: pstmt.executeUpdate(); <- sql 담지 않음!
			
			result = pstmt.executeUpdate(); //INSERT, UPDATE, DELETE가 성공한 행의 개수를 반환
											//조건에 맞는 행이 없으면 0 반환
			
			// ***** 트랜잭션 제어 *****
			if(result > 0) conn.commit(); //DML 성공 시 commit 수행
			else		   conn.rollback(); //DML 실패 시 rollback 수행
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}	
		return result;
	}


	/** 사번으로 사원 정보 삭제
	 * @param input
	 * @return result
	 */
	public int deleteEmployee(int input) {
		
		int result = 0;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String type = "jdbc:oracle:thin:@"; //오라클 드라이버 타입
			String ip = "115.90.212.22";
			String port = ":20000";  //개인컴퓨터는 1521 or 1522
			String sid = ":xe";  //접속할 DB 이름
			String user = "ksh"; //사용자 계정명
			String pw = "ksh1234";
			
			conn = DriverManager.getConnection(type + ip + port + sid, user, pw);
			
			conn.setAutoCommit(false); //자동 커밋 비활성화
			// -> 활성화 상태일 경우 sql이 실행되자마자 commit이 되어버림.
			
			String sql = "DELETE FROM EMPLOYEE2 WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input);
			
			result = pstmt.executeUpdate();
			
			if(result > 0) conn.commit(); //DML 성공 시 commit 수행
			else		   conn.rollback(); //DML 실패 시 rollback 수행
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return result;
	}


	/** 사번으로 사원 정보 수정 DAO (PreparedStatement)
	 * @param emp
	 * @return result
	 */
	public int updateEmployee(Employee emp) {
		
		int result = 0; //결과 저장용 변수
		
		try {
			//oracle jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//커넥션 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.90.212.22:20000:xe", "ksh", "ksh1234");
			
			//자동 커밋 비활성
			conn.setAutoCommit(false);			
			
			//sql 작성 (위치홀더 포함)
			String sql = "UPDATE EMPLOYEE2 SET EMAIL = ?, PHONE = ?, SALARY = ? WHERE EMP_ID = ?";
			
			//PreparedStatement 생성
			pstmt = conn.prepareStatement(sql);
			
			//위치 홀더에 알맞은 값 대입
			
			//setString()을 통해 위치홀더에 문자열 값을 대입하면 
			//문자열 양쪽에 ''(홑따옴표)가 포함된 상태로 추가된다!
			
			//ex) pstmt.setString(1, "abc");
			//	   --> 위치홀더 자리 'abc'
			// * setInt는 붙지 않음.
			
			pstmt.setString(1, emp.getEmail());
			pstmt.setString(2, emp.getPhone());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setInt(4, emp.getEmpId());
			
			//SQL 수행
			result = pstmt.executeUpdate();
			
			//트랜잭션 제어
			if(result > 0) 	conn.commit();
			else			conn.rollback();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(pstmt != null) 	pstmt.close();
				if(conn != null)	conn.close();
				
			} catch (SQLException e){
				e.printStackTrace();
			}
			
		}
		return result;
	}
	
	
	
	
	/** 사번으로 사원 정보 수정2 DAO (Statement)
	 * @param emp
	 * @return result
	 */
	public int updateEmployee2(Employee emp) {
		
		int result = 0;
		
		try {
			
			//oracle jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//커넥션 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.90.212.22:20000:xe", "ksh", "ksh1234");
			
			//자동 커밋 비활성
			conn.setAutoCommit(false);			
			
			//sql 작성(문자열 데이터 양쪽에 ''붙이는거 잊지않기!!)
			String sql = "UPDATE EMPLOYEE2 SET EMAIL = '" + emp.getEmail() 
										 + "', PHONE = '" + emp.getPhone() 
										 + "', SALARY = " + emp.getSalary() 
										 + " WHERE EMP_ID = " + emp.getEmpId();
			
			//Statement 객체 생성
			stmt = conn.createStatement();
			
			//sql 수행
			result = stmt.executeUpdate(sql);
			
			//트랜잭션 제어
			if(result > 0) 	conn.commit();
			else			conn.rollback();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(pstmt != null) 	pstmt.close();
				if(conn != null)	conn.close();
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}		
		return result;
	}

	
	/** 부서코드로 보너스율 수정
	 * @param emp
	 * @return result
	 */
	public int updateBonus(Employee emp) {
		
		int result = 0;
		
		try {
			//oracle jdbc driver 메모리 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//커넥션 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.90.212.22:20000:xe", "ksh", "ksh1234");
			
			//자동 커밋 비활성
			conn.setAutoCommit(false);
			
			//sql작성
			String sql = "UPDATE EMPLOYEE2 SET BONUS = " + emp.getBonus() 
								 + " WHERE DEPT_CODE = '" + emp.getDeptCode() + "'";
			
			//statement 객체 생성
			stmt = conn.createStatement();
			
			//sql 수행
			result = stmt.executeUpdate(sql);
			
			//트랜젝션 제어
			if(result > 0 )	conn.commit();
			else			conn.rollback();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				
			}	
		}
		return result;
	}
}
