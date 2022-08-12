package edu.kh.oop.cls.model.vo;

public class User {
	
	//�Ӽ�(== �ʵ�)
	
	//���̵�, ��й�ȣ, �̸�, ����, ���� (�߻�ȭ ����)
	
	//ĸ��ȭ ��Ģ�� ���ؼ� �ʵ�� �⺻������ ��� private
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	//���(== ������ + �޼���)
	
	//������ : new �����ڸ� ���� ��ü�� ������ �� 
	//		   ������ ��ü�� �ʵ� �� �ʱ�ȭ + ��� ���� ����.
	
	//�⺻ ������
	public User() {
		//���
		System.out.println("�⺻ �����ڷ� User ��ü ����");
		
		//�ʵ� �ʱ�ȭ
		userId = "user01";
		userPw = "pass01";
		userName = "ȫ�浿";
		userAge = 20;
		userGender = '��';
	}
	
	//�Ű����� ������
	// ** ���Ǵ� ���, ���� : �Ű�����, Overloading(�����ε�, this
	
	// ** �Ű����� : �����ڳ� �޼��� ȣ�� �� ()�ȿ� �ۼ��Ǿ�
	//				 ���޵Ǿ����� ���� �����ϴ� ����
	// -> ���� ���� ���� ���� �ϰ��ִ� �Ű�ü(���ϰ� �ִ�) ������ ����
	
	public User(String userId, String userPw) {
					 //"tese3",		 "pass333"
		
		System.out.println("�Ű����� �����ڸ� �̿��ؼ� User ��ü ����");
		System.out.println(userId + " / " + userPw);
		
		//���� ���� ���� �ʵ忡 �ʱ�ȭ(this ���� ����)
		
		// *** this ���� ���� ***
		// - ��ü�� �ڱ� �ڽ��� ������ �� �ֵ��� �ϴ� ����
		// - ��� ��ü ���ο� ������ �ִ�.
		// ����ϴ� ����?
		// -> �ʵ��� �Ű��������� ���� ��� �̸� �����ϱ� ���ؼ� �ַ� ���.
		
		this.userId = userId;
		//this.�ʵ� = �Ű�����
		
		this.userPw = userPw;
	}
	
	
	//�ʵ带 ���� �ʱ�ȭ �ϴ� ������ �Ű����� ������
	public User(String userId, String userPw, String userName, 
			int userAge, char userGender) {
		
		//�Ű������� ���� ���� ������ �ʵ� �ʱ�ȭ
		//this.userId = userId; //���� ��ü�� ������ �ִ� �ʵ� userId�� 
							  //�Ű����� userId ���� ����.
		
		//this.userPw = userPw;
		
		this(userId, userPw); //this() ������
		//- ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
		// - ������ ������ �ݵ�� ù ��° �ٿ� �ۼ��Ǿ�� �Ѵ�.
		
		// ����ϴ� ���� -> �ߺ� �ڵ� ����, �ڵ� ���� ����, ���뼺 ����
		//(�������� ����� ��찡 ���� �� �־� ���� ������ ����)
		
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;	
	}
	
	//�ڹٴ� �⺻������ �ʵ��, �����ڸ�, �޼ҵ��, �������� �ߺ��� ������� ����.
	
	/*
	private String userId; -> Duplicate field User.userId
	public User() {} -> Duplicate method User() in type User
	public String getUserId() {} -> Duplicate method getUserId() in type User
	public void ex() {
		int num = 10;
		int num = 20;  -> Duplicate local variable num	
	}
	*/
	
	
	// *** �����ε�(Over Loading) ***
	// - Ŭ���� ���� ������ �̸��� �޼���(������ ����)�� ���� �� �ۼ��ϴ� ���
	
	// --> �ϳ��� �̸����� ���� ����� ������ �� �ְ� �ϴ� ��
	
	// [�����ε� ����]
	// 1) �޼���(������ ����)�� �̸��� ����
	// 2) �Ű������� ����, Ÿ��, ���� �� 1���� �޶�� ��.
	
	
	//public User() {} //�⺻ �����ڰ� �̹� �ۼ��Ǿ� �־ �ߺ�
	
	public User(String userId) {} 	//�Ű������� ������ ���� ������ ����
								  	//-> �����ε� ����
	
	public User(int userAge) {}		//�Ű������� ������ ������ Ÿ���� �ٸ�
									//-> �����ε� ����
	
	public User(String userId, int userAge) {}
	// �Ű������� ������ ���� �ʾ� �����ε� ����
	
	public User(int userAge, String userId) {}
	// �Ű������� ����, Ÿ���� ������ ������ �޶� �����ε� ����
	
	//public User(int userAge, String userName) {} -> ����
	// �Ű������� ����, Ÿ��, ������ ��� ���Ƽ� �����ε� �Ұ���
	// -> �������� �Ű澲�� �ʴ´�
	
	public User(String userId, String userPw, String userName) {}
	//public User(String userName, String userId, String userPw) {}
	
	
	
	//ĸ��ȭ�� ���� ���� ���� ���(getter / setter)
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
	//getter / setter �ڵ� �ϼ�
	//alt + shift + s
	//��Ŭ���� �޴� -> source -> Generate Getters and Setters
	
}
