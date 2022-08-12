package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	
	/* while ��
	 - ������ �ʱ��, �������� �������� �ʰ�
	   �ݺ� ���� ������ �����Ӱ� �����ϴ� �ݺ���.
	   
	   ** Ȯ���� ���� �ݺ��� �������� ������ 
	   	  ������ �ݺ� ������ false�� �Ǵ� ��� �ݺ��� ������.
	
	 [�ۼ���]
	 
	 while(���ǽ�) {
	 	���ǽ��� true�� �� �ݺ� ������ ����
	 }
	 
	 */
	
	public void ex1() {
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		while(input != 9) {
			//input�� ����� ���� 9�� �ƴ� ��� �ݺ�
			
			System.out.println("-----------------------");
			System.out.println("-------�޴� ����-------");
			System.out.println("1. ������");
			System.out.println("2. �̸�");
			System.out.println("3. ���");
			System.out.println("9. ����");
			
			System.out.print("�޴� ���� >> ");
			input = sc.nextInt();
			
			//input ���� ���� case ����
			switch(input) {
			case 1 : System.out.println("�����̸� �ֹ��߽��ϴ�."); break;
			case 2 : System.out.println("�̸��� �ֹ��߽��ϴ�."); break;
			case 3 : System.out.println("����� �ֹ��߽��ϴ�."); break;
			case 9 : System.out.println("�޴� ������ �����մϴ�."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
			}
		}
	}
	
	public void ex2() {
		
		//�ԷµǴ� ��� ������ �� ���ϱ�
		//��, 0�� �ԷµǸ� �ݺ� ���� �� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		int input = -1; //�Է� ���� ���� ������ ����
		// 1) 0�� �ƴ� ���� �����Ͽ� while���� ó���� ����� �� �ֵ��� ��.
		int sum = 0; //��� ������ ���� �����ϴ� ����
		
		while(input!=0) {
			
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			sum += input; //�Է� ���� ���� sum�� ����
			
		}
		System.out.println("�հ� : " + sum);
		
	}
	
	public void ex3() {
		
		//�ԷµǴ� ��� ������ �� ���ϱ�
		//��, 0�� �ԷµǸ� �ݺ� ���� �� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0; //�Է� ���� ���� ������ ����
		int sum = 0; //��� ������ ���� �����ϴ� ����
		
		// 2) while���� �ּ� �� ���� �����ϴ� �ݺ���
		//	  -> do ~ while��
		
		do {
			
			System.out.print("���� �Է� : ");
			input = sc.nextInt();
			
			sum += input; //�Է� ���� ���� sum�� ����
			
		} while(input!=0);
			
		System.out.println("�հ� : " + sum);
		
	}
	
	

}
