package edu.kh.poly.ex2.model.vo;

public class Person extends Animal {
	//Animal�� �߻� �޼ҵ带 �������̵� ���������� ���� �߻�
	
	
	private String name;
	
	
	//������
	public Person() { //�⺻ ������
		super(); // == Animal �⺻ ������
	}
	
	public Person(String type, String eatType, String name) { //�Ű����� ������
		super(type, eatType);
		this.name = name;
	}
	
	
	//getter setter
	
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public void eat() {
		System.out.println("������, ������, ������, ��ũ ���� �̿��ؼ� �Դ´�.");
	}

	@Override
	public void breath() {
		System.out.println("�ڿ� ������ ���� ����.");
	}
	
	
	//toString()
	@Override
	public String toString() {
		return "Person : " + super.toString() + " / " + name;
	}
	

}
