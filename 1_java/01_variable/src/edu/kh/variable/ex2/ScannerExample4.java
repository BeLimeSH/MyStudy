package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� 1 : ");
		String input = sc.next() + " ";  //���� �߰�
						//�ȳ�_
		
		System.out.println(input);
		
		System.out.print("�Է� 2 : ");
		input = input + sc.next() + " ";
				//�ݰ���_
		
		//���� ������(=) : �����ʿ� �ۼ��� ���� ���� ������ ����
		
		System.out.println(input);
		
		System.out.print("�Է� 3 : ");
		input = input + sc.next() + " ";
		
		System.out.println(input);

	}

}
