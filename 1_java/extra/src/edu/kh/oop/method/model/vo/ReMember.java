package edu.kh.oop.method.model.vo;

public class ReMember {
	
	//�ʵ�
	private String memberId; //���̵�
	private String memberPw; //��й�ȣ
	private String memberName; //�̸�
	private int memberIAge; //����
	
	//�⺻ ������
	public ReMember() {}
	
	//�Ű����� ������
	public ReMember(String memberId, String memberPw, String memberName, int memberAge) {
		
		//�Է� ���� ���� �ʵ忡 �Ű� ���
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberIAge = memberAge;
		
	}

	
	//���(getter/setter)
	
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

	public int getMemberIAge() {
		return memberIAge;
	}

	public void setMemberIAge(int memberIAge) {
		this.memberIAge = memberIAge;
	}
}
