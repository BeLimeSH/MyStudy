package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	
	//�߻� Ŭ����(abstract class)
	//1. �̿ϼ� �޼ҵ�(�߻� �޼ҵ�)�� �����ϰ� �ִ� Ŭ����
	
	//2. (�߻� �޼ҵ�� ������) ��ü�� ����� �� �Ǵ� Ŭ����
	
	
	private String type; //��
	private String eatType; //�ļ�(�ʽ�, ����, ���)
	
	
	//������
	// - �߻� Ŭ������ new �����ڸ� �̿��ؼ� �������� ��ü ������ �Ұ���������
	//	 ��� ���� ��ü ���� �� ���ο� ������ �� ���ȴ�.
	// == super() ������
	
	
	public Animal() { //�⺻ ������
		super();
	} 
	
	public Animal(String type, String eatType) { //�Ű����� ������(�����ε� ����)
		
		this.type = type;
		this.eatType = eatType;
		
	}
	
	//getter / setter
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getEatType() {
		return eatType;
	}
	
	public void setEatType(String eatType) {
		this.eatType = eatType;
	}
	
	
	//toString() �������̵�
	@Override
	public String toString() {
		return type + " / " + eatType;
	}
	
	// ������ ���� ���
	// -> ������ ���������� �԰�, �������� � �����̳Ŀ� ���� �� �溡�� �ٸ�! 
	// -> �ش� Ŭ������ �޼ҵ带 ������ �� ����
	// --> �̿ϼ� ���·� �ξ� ��� ���� �ڽ��� �ش� �޼ҵ带 �����ϵ��� 
	//	   �������̵��� ����ȭ ��Ŵ --> �߻�(abstract) �޼ҵ�� �ۼ�
	
	//�Դ�
	public abstract void eat();
	
	//������
	public abstract void breath();
	
	
	
}
