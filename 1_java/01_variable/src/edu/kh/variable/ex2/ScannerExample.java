package edu.kh.variable.ex2;

import java.util.Scanner;  //java.util ��Ű������ Scanner ���赵 ����
						   //import : �ٸ� ��Ű���� �����ϴ�....


public class ScannerExample {
	
	public static void main(String[] args) {
		
		//Scanner : ���α׷� ���� �� Ű���� �Է��� ���� �� �ְ��ϴ� ����
		
		//Scanner ����
		//-> ���α׷� �ȿ� ��ĳ�ʶ�� ��踦 ����� ��
		
		Scanner sc = new Scanner(System.in);
		//���� ���� -> ����� ������ ���赵(class)�� ��� ������� ����
		//			-> import ���� �ۼ��� ���� �ذ�
		
		System.out.print("���� 1 �Է� : ");
		
		int input1 = sc.nextInt(); //�Է¹��� ������ input1�� ����
		//���� �Էµ� ������ �о��
		
		System.out.print("���� 2 �Է� : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
	}

}
