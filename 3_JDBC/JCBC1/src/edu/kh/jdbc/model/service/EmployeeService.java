package edu.kh.jdbc.model.service;

import java.util.List;

import edu.kh.jdbc.model.dao.EmployeeDAO;
import edu.kh.jdbc.model.vo.Employee;


//Service : 요청에 맞는 기능을 수행하여 결과를 제공
//- 전달 받은 데이터 또는 DAO 수행 결과 데이터를 필요한 형태로 가공처리
public class EmployeeService {
	
	private EmployeeDAO dao = new EmployeeDAO();

	/**
	 * 전체 사원 정보 조회 서비스
	 * @return
	 */
	public List<Employee> selectAll() {
		
		// 별도 가공할 내용이 없으면 바로 DAO 호출
		List<Employee> empList = dao.selectAll();
		
		return empList;
	}

	
	/** 사번으로 사원 정보 조회 Service
	 * @param input
	 * @return emp
	 */
	public Employee selectOne(int input) {
		
		Employee emp = dao.selectOne(input);
		
		return emp; //DAO 호출 결과를 바로 View로 반환
	}


	public List<Employee> selectSalary(int input) {
		
		List<Employee> empList = dao.selectSalary(input);
		
		return empList;
	}


	//새로운 사원 정보 추가 서비스
	public int insertEmployee(Employee emp) {
		
		int result = dao.insertEmployee(emp);
		return result;
	}

	//사원 정보 삭제 서비스
	public int deletemployee(int input) {
		
		int result = dao.deleteEmployee(input);
		return result;
	}


	
	/** 사번으로 사원 정보 수정 Service
	 * @param emp
	 * @return result
	 */
	public int updateEmployee(Employee emp) {
		
		int result = dao.updateEmployee(emp);
		
		return result;
	}


	/** 부서 코드로 보너스율 수정
	 * @param emp
	 * @return result
	 */
	public int updateBonus(Employee emp) {
		
		int result = dao.updateBonus(emp);
		
		return result;
	}



}
