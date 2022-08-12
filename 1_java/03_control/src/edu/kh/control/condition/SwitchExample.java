package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
	
	/* switch��
	 - �� �ϳ��� ����� ���� ����� ���� ó���� �� ����ϴ� ���ǹ�
	   -> ���� ����� ���� ���� ���� case ������ ����ȴ�.
	 
	 [�ۼ���]
	 
	 switch(��) {
	 
	 case �����1 : �����ڵ�1; break;
	 case �����2 : �����ڵ�2; break;
	 case �����3 : �����ڵ�3; break;
	 ...
	 default : case�� ��� �������� ���� ��� �����ϴ� �ڵ�;
	 
	 }
	 
	 */
	
	
	public void ex1() {
		//Ű����� ������ �Է� �޾�
		// 1 �̸� "������"
		// 2 �̸� "��Ȳ��"
		// 3 �̸� "�����"
		// 4 �̸� "�ʷϻ�"
		// 1~4 ���� ���ڰ� �ƴϸ� "���" ���
		
		
		Scanner sc = new Scanner(System.in);
							   //System.in : Ű���� �Է�
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String result;
		
		/*
		if(input == 1) {
			result = "������";
		} else if(input == 2) {
			result = "��Ȳ��";
		} else if(input == 3) {
			result = "�����";
		} else if(input == 4) {
			result = "�ʷϻ�";
		} else {
			result = "���";
		}
		*/
		
			//���� ���� ������ ��
		switch(input) {
		
		case 1 : result =  "������"; break;
		//input�� �Էµ� ���� 1�� ���(case),
		//result ������ "������"�� �����ϰ� switch���� ����(break)
		
		case 2 : result = "��Ȳ��"; break;
		
		case 3 : result = "�����"; break;
		
		case 4 : result = "�ʷϻ�"; break;
		
		default :  result = "���";
		//default == �⺻��
		}
	
		System.out.println(result);
		
	}
	
	public void ex2() {
		
		//������ �Է� �޾� 4������ ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ �Է� : ");
		int input = sc.nextInt();
		
		String team;
		
		switch(input%4) { //1, 2, 3, 0
		
		case 1 : team = "����"; break;
		
		case 2 : team = "ȫ��"; break;
		
		case 3 : team = "û��"; break;
		
		default : team = "����";
		}
				
		System.out.println(team + " �Դϴ�.");
		
	}
	
	public void ex3() {
		
		//switch������ break�� ����
		
		//��(month) �Է� �� ���� �Ǻ� (switch ����)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��(��) �Է� : ");
		int month = sc.nextInt();
		
		String season; //��� ���� ���� ����
		
		switch(month) {
		
		case 3 : case 4 : case 5 : season = "��"; break;
		case 6 : case 7 : case 8 : season = "����"; break;
		case 9 : case 10 : case 11 : season = "����"; break;
		case 12 : case 1 : case 2 : season = "�ܿ�"; break;
		
		default : season = "�߸� �Է�";
		
		}
		
		System.out.println(season);
		
	}
	
	
	public void ex4() {
		
		//switch ���� ��� ���� ������ �ƴ� ���
		
		//���� 2���� ������(+ - * / %) 1���� �Է� �޾Ƽ� ��� ���
		
		/*ex)
		 ���� 1 �Է� : 5
		 ������ �Է� : +
		 ���� 2 �Է� : 2
		 
		 ��� ��� : 5 + 2 = 10
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �Է� : ");
		String op = sc.next();
		
		System.out.print("���� 2 �Է� : ");
		int num2 = sc.nextInt();
		
		
		switch(op) {
		
		//case�� �ۼ��Ǵ� ���� switch ���� ����� �ڷ����� ���ͷ� ǥ����̴�.
		case "+" : System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2); break;
		case "-" : System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2); break;
		case "*" : System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2); break;
		
		case "/" :
			
			if(num2 == 0) {//������ �߻��Ǵ� ���
				System.out.println("0���� ���� �� �����ϴ�.");
			} else { 
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			}
			
			break;
			
		case "%" : System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2); break;
		
		default : System.out.println("�������� �ʴ� �������Դϴ�.");
		
		}
	}
	
	

	
	
	
	
	
	
	
	
}
