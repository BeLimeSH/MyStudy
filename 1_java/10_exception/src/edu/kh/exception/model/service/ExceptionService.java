package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	//����(Exception) : �ҽ� �ڵ��� �������� �ذ� ������ ����
	
	//���ܴ� �� ������ ���е�
	//1) UnChecked Exception : ���������� ���� ó��
	//2) Checked Exception   : �ʼ������� ���� ó��
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		//try - catch ���� ó��
		
		//try {} : ��ȣ ���ο� ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 �ۼ��� �� �õ�
		
		//catch(����){} : try �������� �߻��� ���ܸ� ��Ƴ��� ó���Ͽ�
		//				  ���α׷��� ������ ���� �����ʵ��� ��.
		
		System.out.println("�� ������ �Է� �޾� �������� ���� ���");
		
		System.out.print("���� 1 �Է� : ");
		int input1 = sc.nextInt();
		
		System.out.print("���� 2 �Է� : ");
		int input2 = sc.nextInt();
		
		
		try {
			
			System.out.println("��� : " + input1 / input2);
			//java.lang.ArithmeticException: / by zero
			//����� ���� : 0���� ���� �� �����ϴ�.
			
		} catch(ArithmeticException e) {
			//try���� ������ ���ܸ� catch�� �Ű������� ����.
			
			System.out.println("infinity"); //ó�� �ڵ�
		}
		
		
		/*
		if(input2 != 0) {
			System.out.println("��� : " + input1 / input2);
		} else {
			System.out.println("infinity");
		}
		*/
		//�߻��ϴ� ���� �� �Ϻ� ���ܴ� try-catch ������ ������� �ʾƵ�
		//���� ��Ȳ�� ���� �� �� �ִ�.
		//(�Ϻ� ���� == ��κ��� UnCheckedException)
		
	}
	
	
	//������ �Է� �޾� ��ȯ�ϴ� �޼���
	
	public int inputNumber() {
		
		int num = 0;
		
		while(true) {
			try {
				System.out.print("������ �Է��ϼ��� : ");
				num = sc.nextInt();
				sc.nextLine(); //�Է� ���� ���� ���� ����
				
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ������ �Է��� �ּ���.");
				
				sc.nextLine(); //���ۿ� �����ִ� �߸� �Էµ� ���ڿ��� ����			
			}
		}
		
		return num;
		
	}
	
	public void ex2() {
		//���� 3���� �Է� �޾� 3���� �հ� ���ϱ�
		int sum = 0;
		
		for(int i=0; i<3; i++) { //i= 0,1,2
			
			sum += inputNumber();
			
		}
		
		System.out.println("�հ� : " + sum);
	}
	
	
	public void ex3() {
		//���� ���� ���ܿ� ���� ó�� ���
		
		try {
			System.out.print("�Է� 1 : ");
			int num1 = sc.nextInt();	//InputMismatchException
			
			System.out.print("�Է� 2 : ");
			int num2 = sc.nextInt();	//InputMismatchException
			
			System.out.println("������ ��� : " + num1 / num2);
								//ArithmeticException
			
			
			//-----------------------------------------------------
			// ������ NullPointerException �߻�
			// * NullPointerException : �������� �ʴ� ���������� �̿��ؼ�
			//							�ڵ带 ������ �� �߻�
			
			String str = null;
			
			System.out.println(str.charAt(0));
			
			//-----------------------------------------------------
			
			//���� ���谡 ���� ���ܴ� ���� ������� catch���� �ۼ��ϸ� �ȴ�.
		}  catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			
		} catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ���ڿ��� �ԷµǾ����ϴ�.");
			
		} catch(Exception e) {
			//����ó�� + ������
			//Exception Ŭ���� : ��翹���� �ֻ��� �θ�
			//������ - ��ĳ���� : �θ�Ÿ�� ���������� �ڽ� ��ü�� ����
			
			//** ���� Ÿ���� ���� Ŭ������ catch���� �ۼ��ϸ�
			//	 ������ ��ĳ���ÿ� ���� ��� ��Ƽ� ó�� **
			
			System.out.println("���� �𸣰����� ���� �߻��ؼ� ó����.");
		}
		
		// * catch�� ���� �ۼ� �� Exception ��� ������ ��������(������)
	}
	
	
	public void ex4() {
		// 1) try - catch - finally
		
		// finally : try �������� ���� �߻� ���ο� ������� ������ �������� ����
		
		
		try {
			System.out.println(4/0); //ArithmeticException �߻�
			
		} catch(ArithmeticException e) {
			System.out.println("���� ó�� ��");
			
			// 2) catch�� �Ű����� Ȱ��
			
			System.out.println(e.getClass()); //� ���� Ŭ�����ΰ�?
											  //class java.lang.ArithmeticException
			System.out.println(e.getMessage()); //���� �߻� �� ��µ� ����
												// by zero
			
			System.out.println(e); //e.toString
								   //java.lang.ArithmeticException: / by zero
			
			e.printStackTrace(); //���ܰ� �߻��ϱ� ������ ��� �޼ҵ� �帧�� ���
						 		 //��� � ������ �߻��ߴ��� ��Ȯ�� �ľ��ϴ� �뵵
			
			
		} finally { //�ܺ� ���α׷�(DB)���� ���� ���� �� �ַ� ���
			System.out.println("������ ���� ��");
			
		}
	
	}
	
	
	//----------------------------------------------------------------------
	
	public void ex5() {
		
		//throws : ȣ���� �޼��忡�� ���ܸ� ����
		//		  -> ȣ���� �޼��忡�� ���ܸ� ó���϶�� �����ϴ� ����
		
		//throw : ���� ���� �߻� ����(���� �޼��忡 ���ܸ� ����)
		
		try {
			methodA();
			
		} catch(Exception e) {
			//Exception : ��� ������ �ֻ��� �θ�
			//-> Exception�� catch �Ű������� �ۼ��Ǿ��� == ���� ���� ������� ��� ó��
			
			System.out.println("���� ó����.");
			
			e.printStackTrace();
			//�߻��� ���ܰ� �޼���� ��ġ�� ���� ������ ��� ���...
		
		}
		
		
		
	}
	
	
	public void methodA() throws IOException {
		
		methodB();
		
	}
	
	
	public void methodB() throws IOException {
		
		methodC();
		
	}
	
	
	public void methodC() throws IOException {
		//methodC() �޼���� IOEception�� �߻���ų ���ɼ��� �����Ƿ�
		//ȣ���ϴ� ������ ����ó���� �ݵ�� �ؾ��Ѵ�!
		//��, UncheckedException�� ���������� ����ó���� �� ����.
		
		//IOException ���� ���� �߻�
		throw new IOException();
		
		
		//�߻��� ���ܸ� ó���ϴ� ���
		//1) try - catch�� ���μ� ���� ��ġ���� ó��
		//2) throws�� ȣ���� �޼���� ���ܸ� �����Ͽ� ó��
		
	}
	
	
	public void methodD() {
		
		throw new RuntimeException();
		
		//CheckedException : 
		//- RuntimeEception�� �ڽ� ���ܸ� ������ ������ ����.
		//- if���� ���� �ܼ� �ڵ�� �ذ��� �Ұ����Ͽ�
		//  �ݵ�� ���� ó�� ������ �ۼ��ؾ� ��.
		
		//UnCheckedException : 
		//- RuntimeException�� �ڽ� ���ܸ� ��Ī��.
		//- ���α׷� ���� ��
		//  �������� �ڵ� �Ǽ� �Ǵ� ������� �߸��� �� �Է�����
		//  ���ϰ� �߻��� �� �ִ� ����
		
		//  --> ����ó�� ������ �ƴ϶� if�� ���� �ܼ� �ڵ�� �ذ��� ����
		//  --> ����ó�� ������ �ݵ�� �ۼ��� �ʿ䰡 ����.
		
	}
	
	
	
	
	
	
	
	
	
	
}
