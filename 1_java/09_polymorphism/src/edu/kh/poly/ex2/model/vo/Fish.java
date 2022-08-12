package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal {
	
	//������
	//-> ������ ���ۼ� �� �����Ϸ��� �ڵ����� �⺻ �����ڸ� �߰�����.
	
	public Fish() {
		super();
	}
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}
	
	//�߻� �޼ҵ�� ��� ������ �������̵��� �����ȴ�.
	@Override
	public void eat() {
		System.out.println("���� �������� �Ÿ��鼭 �Դ´�.");
	}

	@Override
	public void breath() {
		System.out.println("�ư��� ȣ���� �Ѵ�.");
	}
	
	//toString()
	@Override
	public String toString() {
		return "Fish : " + super.toString();
	}
	
	
}
