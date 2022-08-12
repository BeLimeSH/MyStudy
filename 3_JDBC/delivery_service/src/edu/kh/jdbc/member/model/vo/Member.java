package edu.kh.jdbc.member.model.vo;

import java.sql.Date;

public class Member {
	
	//필드
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberName;
	private char memberGender;
	private String memberAdress;
	private Date enrollDate;
	private char secessionFlag;
	private String phone;
	private String memberNickname;
	private int memberAge;
	
	//기본 생성자
	public Member() {}

	//매개변수 생성자(내 정보 수정용)
	public Member(int memberNo, String memberAdress, String phone, String memberNickname) {
		super();
		this.memberNo = memberNo;
		this.memberAdress = memberAdress;
		this.phone = phone;
		this.memberNickname = memberNickname;
	}
	
	//매개변수 생성자(회원가입용)
	public Member(String memberId, String memberPw, String memberName, char memberGender, String memberAdress,
			String phone, String memberNickname, int memberAge) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAdress = memberAdress;
		this.phone = phone;
		this.memberNickname = memberNickname;
		this.memberAge = memberAge;
	}

	//매개변수 생성자(로그인용)
	public Member(int memberNo, String memberId, String memberName, char memberGender, String memberAdress,
			Date enrollDate, String phone, String memberNickname, int memberAge, String memberPw) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAdress = memberAdress;
		this.enrollDate = enrollDate;
		this.phone = phone;
		this.memberNickname = memberNickname;
		this.memberAge = memberAge;
		this.memberPw = memberPw;
	}

	public Member(int memberNo, String memberId, String memberPw, String memberName, char memberGender,
			String memberAdress, Date enrollDate, char secessionFlag, String phone, String memberNickname,
			int memberAge) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAdress = memberAdress;
		this.enrollDate = enrollDate;
		this.secessionFlag = secessionFlag;
		this.phone = phone;
		this.memberNickname = memberNickname;
		this.memberAge = memberAge;
	}

	//getter/setter
	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public char getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(char memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberAdress() {
		return memberAdress;
	}

	public void setMemberAdress(String memberAdress) {
		this.memberAdress = memberAdress;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public char getSecessionFlag() {
		return secessionFlag;
	}

	public void setSecessionFlag(char secessionFlag) {
		this.secessionFlag = secessionFlag;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMemberNickname() {
		return memberNickname;
	}

	public void setMemberNickname(String memberNickname) {
		this.memberNickname = memberNickname;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
}
