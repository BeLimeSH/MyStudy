package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���ڿ�(String) �Է�
		
		//���ڿ��� 3�� �Է� �޾� �� �ٷ� ����ϱ�
		
		/* ex)
		   �Է� 1 : �ȳ�?
		   �Է� 2 : �ݰ���!
		   �Է� 3 : �����
		   
		   �ȳ�? �ݰ���! �����
		 */
		
		System.out.print("�Է� 1 : ");
		String input1 = sc.next();
		// next() : ���� �Էµ� �� �ܾ �о��
		
		System.out.print("�Է� 2 : ");
		String input2 = sc.next();
		
		System.out.print("�Է� 3 : ");
		String input3 = sc.next();
		
		System.out.printf("%s %s %s\n", input1, input2, input3);
		
		//sc.nextLine();
		

	}

}
