package edu.kh.jdbc.member.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import edu.kh.jdbc.member.model.vo.Member;

public class MemberDAO {
	
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Properties prop;
	
	//MemberDAO 기본 생성자
	public MemberDAO() {
		
		try {
			prop = new Properties();
			prop.loadFromXML(new FileInputStream("member-sql.xml"));
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/** 아이디, 닉네임 중복 검사 DAO
	 * @param conn
	 * @param memberId
	 * @param memberNickname
	 * @return result
	 * @throws Exception
	 */
	public int duplicateCheck(Connection conn, String memberId, String memberNickname) throws Exception  {
		
		int result = 0;
		
		try {
			//SQL 작성
			//memberNickname == null이면 아이디 중복검사
			//memberNickname != null이면 닉네임 중복검사
			if(memberNickname == null) {
				String sql = prop.getProperty("duplicateCheckId");
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, memberId);
				
			} else {
				String sql = prop.getProperty("duplicateCheckNick");
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, memberNickname);
				
			}
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = rs.getInt(1); // 1은 컬럼 순서
			}
			
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return result;
	}

	/** 회원가입 DAO
	 * @param conn
	 * @param signUpMember
	 * @return result
	 * @throws Exception
	 */
	public int signUp(Connection conn, Member signUpMember) throws Exception {
		
		int result = 0;
		
		try {
			String sql = prop.getProperty("signUp");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, signUpMember.getMemberId());
			pstmt.setString(2, signUpMember.getMemberPw());
			pstmt.setString(3, signUpMember.getMemberName());
			pstmt.setString(4, signUpMember.getMemberGender() + "");
			pstmt.setString(5, signUpMember.getMemberAdress());
			pstmt.setString(6, signUpMember.getPhone());
			pstmt.setString(7, signUpMember.getMemberNickname());
			pstmt.setInt(8, signUpMember.getMemberAge());
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		
		return result;
	}

	/** 로그인 DAO
	 * @param conn
	 * @param mem
	 * @return loginMember
	 * @throws Exception
	 */
	public Member login(Connection conn, Member mem) throws Exception {
		
		Member loginMember = null;
		
		try {
			String sql = prop.getProperty("login");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem.getMemberId());
			pstmt.setString(2, mem.getMemberPw());
			
			rs = pstmt.executeQuery();
			
			//if로 한 행 접근
			if(rs.next()) {
				int memberNo = rs.getInt("MEMBER_NO");
				String memberId = rs.getString("MEMBER_ID");
				String memberName = rs.getString("MEMBER_NM");
				char memberGender = rs.getString("MEMBER_GENDER").charAt(0);
				String memberAdress = rs.getString("MEMBER_ADRESS");
				Date enrollDate = rs.getDate("ENROLL_DATE");
				String phone = rs.getString("PHONE");
				String memberNickame = rs.getString("MEMBER_NICKNM");
				int memberAge = rs.getInt("MEMBER_AGE");
				String memberPw = rs.getString("MEMBER_PWD");
								
				//Member 객체 생성 후 loginMember에 저장
				loginMember = new Member(memberNo, memberId, memberName, memberGender, 
						memberAdress, enrollDate, phone, memberNickame, memberAge, memberPw);
			}
		} finally {
			//JDBC 객체 자원 반환
			close(rs);
			close(pstmt);
		}
		return loginMember;
	}

	/** 닉네임 변경 DAO
	 * @param memberNickname
	 * @param loginMember
	 * @return result
	 * @throws Exception
	 */
	public int updateNickname(String memberNickname, Member loginMember, Connection conn) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("updateNickname");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberNickname);
			pstmt.setInt(2, loginMember.getMemberNo());
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
			
		}
		return result;
	}

	/** 프로필 변경 DAO
	 * @param conn
	 * @param updateMember
	 * @return result
	 * @throws Exception
	 */
	public int updateProfile(Connection conn, Member updateMember) throws Exception {
		int result = 0;
		 
		try {
			String sql = prop.getProperty("updateProfile");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, updateMember.getMemberName());
			pstmt.setString(2, updateMember.getPhone());
			pstmt.setString(3, updateMember.getMemberAdress());
			pstmt.setInt(4, updateMember.getMemberNo());
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}

	/** 비밀번호 변경 DAO
	 * @param conn
	 * @param memberNo
	 * @param newPw
	 * @return result
	 * @throws Exception
	 */
	public int updatePw(Connection conn, int memberNo, String newPw) throws Exception {
		int result = 0;
		
		try {
			String sql = prop.getProperty("updatePw");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, newPw);
			pstmt.setInt(2, memberNo);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}

	/** 회원 탈퇴 DAO
	 * @param conn
	 * @param memberNo
	 * @param currentPw
	 * @return result
	 * @throws Exception
	 */
	public int secession(Connection conn, int memberNo, String currentPw) throws Exception {

		int result = 0;
		
		try {
			String sql = prop.getProperty("secession");
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			pstmt.setString(2, currentPw);
			
			result = pstmt.executeUpdate();
			
		} finally {
			close(pstmt);
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
