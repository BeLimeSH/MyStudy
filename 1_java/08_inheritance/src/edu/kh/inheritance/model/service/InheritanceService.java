package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {
	
	public void ex1() {
		//��� Ȯ��
		//- Person�� ��� ���� Student�� Person�� �ʵ�, �޼ҵ带 ����� �� �ִ°�?
		
		Person p = new Person();
		p.setName("ȫ�浿");
		p.setAge(25);
		p.setNationality("���ѹα�");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		
		System.out.println("------------------------------");
		
		//Student ��ü ����
		Student std = new Student();
		
		//Student���� ������ �޼���
		std.setGrade(3);
		std.setClassRoom(5);
		
		//Person Ŭ�����κ��� ��� ���� �޼���
		std.setName("��浿");
		std.setAge(19);
		std.setNationality("���ѹα�");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		//Student�� Person�� �޼ҵ� �Ӹ� �ƴ϶� �ʵ嵵 ��� �޾Ҵ��� Ȯ��
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("------------------------------");
		Employee emp = new Employee();
		
		//Employee���� ���� �޼���
		emp.setCompany("KH����������");
		
		//Person Ŭ�����κ��� ��� ���� �޼���
		emp.setName("�鵿��");
		emp.setAge(33);
		emp.setNationality("���ѹα�");
		
		
		System.out.println(emp.getCompany());

		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		System.out.println("------------------------------");
		
		//�߰��� breath() �޼��� Ȯ���ϱ�
		p.breath();
		std.breath();
		emp.breath();
	}
	
	
	public void ex2() {
		
		//super() ������ ��� ���
		
		//Student �Ű����� 5�� ¥�� ������
		Student std = new Student("��ö��", 17, "�ѱ�", 1, 3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
	}
	
	
	public void ex3() {
		//�������̵� Ȯ�� ����
		
		Student std = new Student();
		Employee emp = new Employee();
		
		std.move(); //�������̵�X -> Person�� �޼ҵ� ����
		
		emp.move(); //�������̵�O -> Employee �޼ҵ� ����
		
	}
	
	
	public void ex4() {
		
		//��� Ŭ������ Object Ŭ������ �ļ�
		//== ��� Ŭ������ �ֻ��� �θ�� Object
		
		//1) Object ��� ���� Ȯ��
		Person p = new Person(); //Object�� ��� ���� Person ��ü ����
		
		
		Student std = new Student();
		Scanner sc = new Scanner(System.in);
		String str = "abc";
		
		System.out.println(p.hashCode()); //Object���� ���� ���� hashCode()
		
		System.out.println(std.getAge()); //Person���� ���� ���� getAge()
		System.out.println(std.hashCode()); //Person�� Object���� �������� hashCode()��
											//Student�� �� ���� �޾� ���
											//-> ����� ����� ����� .... ��� ����
		
		// * Object�� ��� Ŭ������ �ֻ��� �θ����� Ȯ��
		System.out.println(sc.hashCode());
		//Object - hashCode()
		
		System.out.println(str.hashCode());
		//String - hashCode()
		//-> String�� Object���� ���� ���� hashCode()�� �������̵���.
		
		
	}
	
	
	public void ex5() {
		
		//toString() �������̵��� super ��������
		Person p = new Person("�谳��", 20 , "�ѱ�");
		
		System.out.println(p.toString());
		System.out.println(p);
		
		// print ���� ���� �� ���� �������� �ۼ��ϸ�
		// �ڵ����� toString() �޼ҵ带 ȣ���ؼ� ����Ѵ�!
		
		System.out.println("-------------------------------");
		
		Student std = new Student("�̹���", 18, "�̱�", 2, 6);
		
		System.out.println(std.toString());
		//1) Student Ŭ���� toString() �������̵� ��
		//   Person���κ��� ��� ���� �������̵� �� toString() ����
		
		//2) Student Ŭ���� toString() �������̵� ��
		//   Student�� toString() ����
		
		Employee emp = new Employee("��ٷ�", 26 , "�ѱ�", "00����");
		
		System.out.println(emp.toString());
		
	}
	
	
	
	
	
	
	
	
}
