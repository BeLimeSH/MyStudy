package edu.kh.exception.model.vo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {
	
	@Override
	public void method() throws FileNotFoundException {
		
		//�������̵� �� ���ܴ� ���ų� �� ���� ����
		//* ���� ���� == ��ü���� ����
		
		//FileNotFoundException�� IOException�� �ڽ� �����̹Ƿ� �������̵� ����
		
		//Exception�� IOException�� �θ� �����̹Ƿ� �������̵� �Ұ�
		//Exception Exception is not compatible with throws clause in Parent.method()
		
		System.out.println("�������̵� �� �ڽ� �޼���");
		
	}
	
	
}
