package edu.kh.collection.model.vo;

import java.util.Objects;

public class Member {
	
	private String id;
	private String pw;
	private int age;
	
	public Member() {}

	public Member(String id, String pw, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.age = age;
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, id, pw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Member other = (Member) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
	
	
	//Object.equals() �������̵�
	//- ���� ��ü�� �Ű������� ���� ���� ��ü�� �ʵ尡 ������ ���ϴ� ���·� �������̵�
	
/*	@Override
	public boolean equals(Object obj) {
		
		//�Ű����� �ٿ�ĳ����
		Member other = (Member)obj;
		
		//�ʵ� �� ��
		return this.id.equals(other.id) && this.pw.equals(other.pw) && this.age == other.age;
		
	}
	
	//Object.hashCode() �������̵�
	@Override
	public int hashCode() {
		//�ʵ� ���� ���� ��ü�� ���� ������ ��ȯ�ؾ� �Ѵ�.
		//== �ʵ� ���� �̿��ؼ� ������ ����� �ȴ�.
		
		final int PRIME = 31; //31�� ����ӵ��� ���� �Ҽ� �� �ϳ�
				  //�Ҽ�
		
		int result = 1; //��� ���� ����
		
		result = result * PRIME * age;
		
		result = result * PRIME * (id==null ? 0 : id.hashCode());

		result = result * PRIME * (pw==null ? 0 : pw.hashCode());
		
		return result;
		
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
