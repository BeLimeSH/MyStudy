package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {
	
	//�ǽ�����1
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int person = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		
		System.out.println();
		System.out.println("1�δ� ���� ���� : " + candy/person);
		System.out.println("���� ���� ���� : " + candy%person);
		
	}
	
	
	//�ǽ�����2
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�г�(����) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(����) : ");
		int c = sc.nextInt();
		
		System.out.print("��ȣ(����) : ");
		int num = sc.nextInt();
		
		System.out.print("����(���л�/���л�) : ");
		String sex = sc.next();
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ�����) : ");
		double record = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�� �Դϴ�.",
							grade, c, num, name, sex, record);		
	}
	
	//�ǽ�����3
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		System.out.println((input%2==0 ? "¦��" : "Ȧ��") + " �Դϴ�.");
		
	}
	
	//�ǽ�����4
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int a = sc.nextInt();
		
		System.out.print("���� : ");
		int b = sc.nextInt();
		
		System.out.print("���� : ");
		int c = sc.nextInt();
		
		int sum = a+b+c;
		double avg = sum/3.0;
		
		System.out.println();
		
		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.1f\n", avg);
		
		System.out.println((a>=40)&&(b>=40)&&(c>=40)&&(avg >= 60) ? "�հ�":"���հ�");
	}
	

}
