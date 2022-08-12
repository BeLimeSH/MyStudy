package edu.kh.inheritance.model.vo;

public class Employee extends Person {
					//Person ��� ����
	
	private String company;
	
	//�⺻ ������
	public Employee() {}
	
	//�Ű����� ������
	public Employee(String name, int age, String nationality, String company) {
		
		super(name, age, nationality);
		
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	
	//Person���κ��� ��� ���� �޼��� ��
	//move() �޼��带 Person�� �°� ������ (==�������̵�)
	
	//@Override ������̼� : �ش� �޼ҵ尡 �������̵� �Ǿ����� �����Ϸ����� �˷��ִ� ����
	
	//������̼�(Annotation) : �����Ϸ����� �˷��ֱ� ���� �ڵ�
	//						   (�����Ϸ� �νĿ� �ּ�)
	
	@Override  //���� �����ϳ� �ۼ����ִ� ���� ����.
	public void move() {
		
		//���� �θ� �ڵ� ���� �� �ڽ��� ���Ӱ� ������
		System.out.println("�������̵��� move() �޼���");
		System.out.println("ȿ�������� ���� ��ó���ϰ� �߱��� ���� �ʴ´�.");
	}
	
	/** �������̵� ���� ���� **
	
	 1. �޼ҵ� ����
	 2. ��ȯ�� ����
	 3. �Ű����� ����
	 4. ���� ������ -> ���ų� �� ���� ����
	    ex) (��) protected -> (��) protected �Ǵ� public
	 5. ����ó�� ������ ���ų� �� ����
	
	 +) �θ��� private �޼���� �������̵� �Ұ�
	
	**/
	
	//toString() �������̵�
	public String toString() {
		return super.toString() + " / " + company;
	}
	
	
}
