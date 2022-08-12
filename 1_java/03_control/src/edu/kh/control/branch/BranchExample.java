package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	public void ex1() {
		
		//1���� 10���� 1�� �����ϸ� ����ϴ� �ݺ��� �ۼ�
		//��, 5�� ����ϸ� �ݺ����� ����
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i + " ");
			
			if(i == 5) {
				break; //�ݺ����� ����
			}
		}
	}
	
	
	public void ex2() {
		
		//0�� �Էµ� �� ������ ��� ������ �� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		//while���� ó���� ������ �����ϰ�, Ư�� ���ǿ� �����ϴ� ���
		//1) input�� �ʱⰪ�� 0�� �ƴ� �ٸ� ��
		//	 while(input != 0)
		
		//2) do ~ while�� ���
		
		//3) ���� ���� ������ while���� ����� ���ο� break ���� �ۼ�
		
		while(true) { //���� ����
			
			System.out.println("���� �Է� : ");
			input = sc.nextInt(); //�Է�
			
			//�Է� ���� ���� 0���� �˻� (while ���� ����)
			if(input==0) {
				break;
			}
			
			sum += input; //����
		}
		System.out.println("�հ� : " + sum);
		//Unreachable code(������ �� ���� �ڵ�)
		
	}
	
	public void ex3() {
		
		//�Է� ���� ��� ���ڿ��� ����
		//��, "exit@" �Է� �� ���ڿ� ������ �����ϰ� ��� ���
		
		Scanner sc = new Scanner(System.in);
		
		String str = ""; //�� ���ڿ�
						 //�ֵ���ǥ("") ��� ��ȣ�� �̿��� String ���ͷ����� ����
						 //������ ������ ����.
		
		while(true) { //���� ����
			
			System.out.print("���ڿ� �Է�(exit@ �Է� �� ����) : ");
			String input = sc.nextLine();
			//next() : ���� �� �ܾ� (���� ���� X)
			//nextLine() : ���� �� �� (���� ���� O)
			
			//�Է� ���� ���ڿ��� "exit@"�̸� �ݺ� ����
			
			if(input.equals("exit@")) {
			 //str=="exit@ >> �񱳺Ұ���
				//String �ڷ����� �񱳿�����(==)�� ���� ���ڿ����� �Ǻ��� �� ����.
				
				//�񱳿����ڴ� ���� �⺻ �ڷ��� ������ ���꿡�� ��� �����ϴ�.
				//-> String�� �⺻ �ڷ����� �ƴ� ������
				
				//*** �ذ� ��� : ���ڿ�1.equals(���ڿ�2)�� �� ���� ***
				
				break;
			}
			
			str += input + "\n"; //����
			
		} //while ��
		System.out.println("-----------------------");
		System.out.println(str);	
	}
	
	
	public void ex4() {
		
		//��ø �ݺ��� ���ο��� break ����ϱ�
		
		//������ 2~9�ܱ��� ��� ���
		//��, 2���� x2����, 3���� x3����...
		
		for(int dan=2 ; dan<=9 ; dan++) {
			
			for(int num=1 ; num<=9 ; num++ ) {
				
				System.out.printf("%d x %d = %2d  ", dan, num, dan*num);
				
				if(num==dan) { //�ܰ� �������� ���� ���� ���
					break;
					//�б⹮�� ��ø �ݺ��� ������ ���Ǹ� ���� ����� �ݺ����� �ۿ��Ѵ�!
				}
			}
			System.out.println(); //�� �ٲ�
			
		}
	}
	
	
	public void ex5() {
		
		//break : �ݺ����� �ٷ� ����
		
		//continue : ���� �ݺ����� �Ѿ
		
		//1~10���� 1�� �����ϸ� ���
		//��, 3�� ����� ����
		
		for(int i=1; i<=10; i++) {
			
			if(i%3==0) {  //i�� 3�� ����� ���
				continue; //���� �ݺ����� �Ѿ
			}
			
			System.out.print(i + " ");
		}
	}
	
	
	public void ex6() {
		
		//1~100���� 1�� �����ϸ� ����ϴ� �ݺ���
		//��, 5�� ����� �ǳʶٰ�
		//�����ϴ� ���� 40�� �Ǿ��� �� �ݺ��� ����
		
		for(int i=1 ; i<=100 ; i++) {
			
			if(i==40) {
				break;
			}
			
			if(i%5==0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
	}
	
	
	//���� ���� �� ����
	
	//�� ��? : 3
	
	//1��° ����
	//����/����/�� �� �ϳ��� �Է� ���ּ��� : ����
	//��ǻ�ʹ� [��]�� �����߽��ϴ�.
	//�÷��̾� ��!
	//���� ��� : 1�� 0�� 0��
	
	//2��° ����
	//����/����/�� �� �ϳ��� �Է� ���ּ��� : ��
	//��ǻ�ʹ� [��]�� �����߽��ϴ�.
	//�����ϴ�.
	//���� ��� : 1�� 1�� 0��
	
	//3��° ����
	//����/����/�� �� �ϳ��� �Է� ���ּ��� : ����
	//��ǻ�ʹ� [����]�� �����߽��ϴ�.
	//�����ϴ٤Ф�
	//���� ��� : 1�� 1�� 1��
	
	
	public void RPSGame() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[���� ���� �� ����]");
		System.out.print("�� ��? ");
		int round = sc.nextInt();
		
		//���� ��Ͽ� ����
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		for(int i=1; i<=round ; i++) {		//�Է� ���� �� �� ��ŭ �ݺ�
			
			System.out.println("\n" + i + "��° ����");
			System.out.print("����/����/�� �� �ϳ��� �Է� ���ּ���. : ");
			String input = sc.next();		//�÷��̾��� ����
			
			//��ǻ�� ����/����/�� ���ϱ�(����)
			//1) 1~3 ���� ���� ����
			//2) 1�̸� ����, 2�̸� ����, 3�̸� ���� ����
			
			//���� ���� ��� : Math.random()
			//-> 0.0 �̻� 1.0 �̸��� ������ ������
			
			int random = (int)(Math.random() * 3 + 1);
			//0.0 <= x < 1.0
			//0.0 <= x*3 < 3.0
			//1.0 <= x*3+1 < 4.0
			//1 <= (int)(x*3+1) < 4
			//==> 1�̻� 4�̸��� ���� ==1 2 3
			
			String com = null; //��ǻ�Ͱ� ������ ����/����/���� �����ϴ� ����
			// null : �ƹ��͵� �����ϰ� ���� ����.
			
			switch(random) {
				
			case 1 : com = "����"; break;
			case 2 : com = "����"; break;
			case 3 : com = "��"; break;
			
			}
			
			System.out.printf("��ǻ�ʹ� [%s]�� �����߽��ϴ�.\n", com);
			
			//��ǻ�Ϳ� �÷��̾� ���� ���� �� ��� �Ǻ�
			//win, draw, lose
			
			//String �� �� equals() ���
			if(input.equals(com)) { //��� ���
				System.out.println("�����ϴ�.");
				
				draw++;
				
			} else {
				
				boolean win1 = input.equals("����") && com.equals("��");
				boolean win2 = input.equals("����") && com.equals("����");
				boolean win3 = input.equals("��") && com.equals("����");
				
				if(win1 || win2 || win3) {
					System.out.println("�÷��̾� ��!");
					
					win++;
					
				} else {
					System.out.println("�����ϴ٤Ф�");
					
					lose++;
					
				}
				
				/*if(input.equals("����") && com.equals("��")) {
					System.out.println("�÷��̾� ��!");
					
				} else if (input.equals("����") && com.equals("����")) {
					System.out.println("�÷��̾� ��!");
					
				} else if (input.equals("��") && com.equals("����")) {
					System.out.println("�÷��̾� ��!");
					
				} else {
					System.out.println("�����ϴ٤Ф�");
					
				}*/
				
			} //else ��
			
			System.out.printf("���� ��� : %d�� %d�� %d��\n", win, draw, lose);
			
		}
	}
}