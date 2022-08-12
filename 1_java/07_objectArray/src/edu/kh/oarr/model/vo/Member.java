package edu.kh.oarr.model.vo;

public class Member {
	
	//�ʵ�(==��� ����)
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region; // ����(����, ���, ���, ���� ���)
	
	//������
	public Member() {}	//�⺻ ������
	
	public Member(String memberId, String memberPw, String memberName, 
				  int memberAge, String region) {
		
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
		
	}	//�Ű����� ������
	
	//�޼���
	
	//getter / setter
	
	//memberId
	
	public String getMemberId() {
		return memberId;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
		
		return;
		
		//��� �޼���� return ������ �ۼ��Ǿ�� ������, void�� ��� ���� �����ϴ�.
		// -> ���� �� �����Ϸ��� �ڵ� �߰�
	}
	
	//memberPw
	public String getMemberPw() {
		return memberPw;
	}
	
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	//memberName
	public String getMemberName() {
		return memberName;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//memberAge
	public int getMemberAge() {
		return memberAge;
	}
	
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	//region
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}

}
