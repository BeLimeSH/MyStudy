package edu.kh.exception.test;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		while(true) {		
			System.out.print("���� �Է�(0 �Է� �� ����) : ");
			int input = sc.nextInt();
			
			int a = (int)99.9; 
			//�ڷ����� ���� �ʾ� ������ ���ؼ� "������ ����"(�ڵ� Ʋ��)
			//-> �ڵ�� ���� ����
			//1) ���� �ڷ����� double
			//2) (int)99.9 ���� ����ȯ
			//3) 99.9 ���� ����
			
			if(input == 0) {
				break;
			}
		}
		
		
		//��Ÿ�� ���� ����
		//��Ÿ�� ���� : ���α׷� ���� �� �߻��ϴ� ����
		//				�ַ� if������ ó�� ����
		
		int[] arr = new int[3]; //�ε��� 2����
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		if(3 >= arr.length) { //�迭 �ε��� ���� �ʰ���
			System.out.println("�迭 ������ �ʰ��߽��ϴ�");
		
		} else {
			arr[3] = 40;
		}
		// java.lang.ArrayIndexOutOfBoundsException : �迭 ���� �ʰ� ����
		
		
	}
}
