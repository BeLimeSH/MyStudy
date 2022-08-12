package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input>0 && input%2==0) {
			System.out.println("¦���Դϴ�.");
			
		} else if(input>0 && input%2==1) {
			System.out.println("Ȧ���Դϴ�.");
		
		} else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum/3;
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("���� : " + kor);
			System.out.println("���� : " + math);
			System.out.println("���� : " + eng);
			System.out.println("�հ� : " + sum);
			System.out.printf("��� : %.1f\n", avg);
			
			System.out.println("�����մϴ�, �հ��Դϴ�!");
					
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�."); break;
		
		case 2 : System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�."); break;
		
		case 4 : case 6 : case 9 : case 11 :
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�."); break;
		
		default : System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		if(bmi<18.5) {
			System.out.println("��ü��");
			
		} else if (bmi>=18.5 && bmi<23) {
			System.out.println("����ü��");
			
		} else if (bmi>=23 && bmi<25) {
			System.out.println("��ü��");
			
		} else if (bmi>=25 && bmi<30) {
			System.out.println("��");
			
		} else {
			System.out.println("����");
		}
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		double midterm = sc.nextDouble();
		
		System.out.print("�⸻ ��� ���� : ");
		double endTerm = sc.nextDouble();
		
		System.out.print("���� ���� : ");
		double task = sc.nextDouble();
		
		System.out.print("�⼮ Ƚ�� : ");
		int at = sc.nextInt();
		
		System.out.println("===================== ��� =====================");
		
		double a = midterm*0.2;
		double b = endTerm*0.3;
		double c = task*0.3;
		double sum = a + b + c + at;
		
		if (at<=(20-20*0.3)) {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + at + "/20)]");
		
		} else {
			System.out.println("�߰� ��� ����(20) : " + a);
			System.out.println("�⸻ ��� ����(30) : " + b);
			System.out.println("���� ����       (30) : " + c);
			System.out.println("�⼮ ����       (20) : " + at);
			System.out.println("���� : " + sum);
			
			if(sum<70) {
				System.out.println("Fail [���� �̴�]");
				
			} else {
				System.out.println("PASS");
				
			}
		}
	}
}
