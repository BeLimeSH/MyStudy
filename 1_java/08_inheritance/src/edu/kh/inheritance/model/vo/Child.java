package edu.kh.inheritance.model.vo;

public class Child extends Parent { //�ڽ� Ŭ����
	//Parent ��� ��...
	
	//The type Child cannot subclass the final class Parent
	//(final Ŭ������ Parent�� Child Ŭ������ �ڽ����� ���� �� ����.)
	
	@Override
	public void method() {
		System.out.println("�������̵� ����!!");
		
		//Cannot override the final method from Parent
		
	}
}
