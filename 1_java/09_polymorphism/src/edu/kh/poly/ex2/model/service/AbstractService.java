package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.vo.Animal;
import edu.kh.poly.ex2.model.vo.Fish;
import edu.kh.poly.ex2.model.vo.Person;

public class AbstractService {
	
	public void ex1() {
		
		// * �߻� Ŭ������ ��ü�� ���� �� ������? X
		//Animal a1 = new Animal();
		//Cannot instantiate the type Animal (��üȭ �� �� ����)
		
		//Ŭ���� : ��ü�� �Ӽ�, ����� ������ ��(������ ���赵)
		//�߻� Ŭ���� : �̿ϼ� �޼��带 ������ Ŭ���� (�̿ϼ� ���赵
		// -> �̿ϼ� ���赵�δ� ��ü�� ���� �� ����
		
		//�ذ� ��� : Animal�� ��� �޾� �̿ϼ� �κ��� ������ Ŭ������ �̿��� ��ü ����
		
		
		// * �߻� Ŭ������ ��� ���� �ڽ� ��ü �����ϱ�
		Person p1 = new Person();
		
		p1.setName("ȫ�浿");
		
		//��� ���� ��� ȣ��
		p1.setType("ô�ߵ���");
		p1.setEatType("���");
		
		//�������̵��� �޼��� ȣ��
		p1.eat();
		p1.breath();
		
		
		Fish f1 = new Fish();
		
		f1.eat();
		f1.breath();	
	}

	
	public void ex2() {
		
		// * �߻� Ŭ������ ������ + ���ε�
		
		// - �߻� Ŭ������ ��ü�� ���� �� ����.
		// --> ������ "���� ����"�δ� ����� �� �ִ�.
		
		// ex) ���� -> ���? �����?
		//	   Animal a1 = new Animal();	(X)
		
		//	   ��� -> ����   /   ����� -> ����
		//	   Animal a1 = Person();  / Animal a2 = new Fish();		(O)
		
		Animal[] arr = new Animal[2];
		//Animal ���� ���� �迭 ���� �� �Ҵ�
		
		arr[0] = new Person("���", "���", "����");
		// Animal �θ� = Person �ڽ�(������ �� ��ĳ����)
		
		arr[1] = new Fish("�����", "���");
		//Animal �θ� = Fish �ڽ�(������ �� ��ĳ����)
		
		//���ε� Ȯ��
		for(int i=0; i<arr.length; i++) {
			// arr[i] == Animal ���� ����
			arr[i].eat();
			arr[i].breath();
			System.out.println(arr[i]);
			//print �޼ҵ忡 ���� ���� �ۼ� �� �ڵ����� toString() ȣ��
			
			//void edu.kh.poly.ex2.model.vo.Animal.eat() - ���� ���ε�
			
			//���α׷� ���� �� �����ϰ� �ִ� �ڽ� ��ü�� �������̵� �� eat() �޼ҵ� ����
			// - ���� ���ε�
			//(�θ� Ÿ�� ���� ������ �޼ҵ带 ȣ�������� �ڽ� Ÿ�Կ� �������̵� �� �޼ҵ尡 ���� ��.)
			
			//��ĳ���� ����(�θ� ���� = �ڽ� ��ü)����
			//�θ� �޼ҵ� ȣ�� ��, �������̵��� �ڽ� �޼ҵ� ����
			
			System.out.println("------------------------------");
		}
		
	} 
}
