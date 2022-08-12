package edu.kh.jdbc.member.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.getConnection;
import static edu.kh.jdbc.common.JDBCTemplate.close;
import static edu.kh.jdbc.common.JDBCTemplate.commit;
import static edu.kh.jdbc.common.JDBCTemplate.rollback;

import java.sql.Connection;

import edu.kh.jdbc.member.model.dao.MemberDAO;
import edu.kh.jdbc.member.model.vo.Member;

public class MemberService {
	
	private MemberDAO dao = new MemberDAO();
	
	/** 아이디, 닉네임 중복검사 Service
	 * @param memberId
	 * @param memberNickname
	 * @return result
	 * @throws Exception
	 */
	public int duplicateCheck(String memberId, String memberNickname) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.duplicateCheck(conn, memberId, memberNickname);
		
		close(conn);
		
		return result;
	}

	/** 회원가입 Service
	 * @param signUpMember
	 * @return result
	 * @throws Exception
	 */
	public int signUp(Member signUpMember) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.signUp(conn, signUpMember);
		
		if (result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 로그인 Service
	 * @param mem
	 * @return loginMember
	 * @throws Exception
	 */
	public Member login(Member mem) throws Exception {
		
		Connection conn = getConnection();
		
		Member loginMember = dao.login(conn, mem);
		
		close(conn);
		
		return loginMember;
	}

	/** 닉네임 변경 Service
	 * @param memberNickname
	 * @param loginMember
	 * @return result
	 * @throws Exception
	 */
	public int updateNickname(String memberNickname, Member loginMember) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.updateNickname(memberNickname, loginMember, conn);
		
		if(result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 프로필 변경 Service
	 * @param updateMember
	 * @return result
	 * @throws Exception
	 */
	public int updateProfile(Member updateMember) throws Exception {

		Connection conn = getConnection();
		
		int result = dao.updateProfile(conn, updateMember);
		
		if(result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 비밀번호 변경 Service
	 * @param memberNo
	 * @param currentPw
	 * @param newPw
	 * @return result
	 * @throws Exception
	 */
	public int updatePw(int memberNo, String newPw) throws Exception {
		Connection conn = getConnection();
		
		int result = dao.updatePw(conn, memberNo, newPw);
		
		if(result > 0)	commit(conn);
		else			rollback(conn);
		
		close(conn);
		
		return result;
	}

	/** 회원 탈퇴 Service
	 * @param memberNo
	 * @param currentPw
	 * @return result
	 * @throws Exception
	 */
	public int secession(int memberNo, String currentPw) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.secession(conn, memberNo, currentPw);
		
		if(result > 0) commit(conn); 
		else 		   rollback(conn);
		
		close(conn);
		
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
