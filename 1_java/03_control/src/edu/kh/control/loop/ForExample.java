package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	/* for��
	 - ���� ������ �ִ�(Ƚ���� �����Ǿ� �ִ�) �ݺ���
	 
	 [�ۼ���]
	 
	 for(�ʱ�� ; ���ǽ� ; ������) {
	 
	 		�ݺ� ������ �ڵ�
	 		
	 }
	
	- �ʱ�� : for���� �����ϴ� �뵵�� ���� ����
	- ���ǽ� : for���� �ݺ� ���θ� �����ϴ� �� (���� �ݺ� ������ ���ΰ�?)	
			   ���� �ʱ�Ŀ� ���� ������ �̿��Ͽ� ���ǽ��� �ۼ���.
	- ������ : �ʱ�Ŀ� ���� ������ for���� ���� �� ����
			   ���� �Ǵ� ���ҽ��� ���ǽ��� ����� ���ϰ� �ϴ� ��
	 */
	
	//�ݺ����� ���ǽ��� true�� ���� �ݺ�
	
	public void ex1() {
		//for�� ���� ����1
		//- 1~10 ����ϱ�
		//-> 1���� 10���� 1�� �����ϸ� ���
		
		
		//�ؼ� ����
		//1~5 ���� �� 5~7 �ݺ�
		
		for(int i = 1 ; i <= 10  ; i++) {
		//1) �ʱ��   ; 2) 5)���ǽ� ; 4) 7)������
			
			//3) 6) �ݺ� ������ �ڵ�
			System.out.println(i);
		}
	}
	
	public void ex2() {
		//for ���� ����2
		
		//- 3���� 7���� 1�� �����ϸ� ���
		
		for(int i=3 ; i<=7 ; i++ ) {
			System.out.println(i);
		}
	}
	
	public void ex3() {
		
		//2���� 15���� 1�� �����ϸ� ���
		
		for(int i=2 ; i<=15 ; i++) {
			System.out.println(i);
		}
	}
	
	public void ex4() {
		
		//1���� �Է� ���� �� ���� 1�� �����ϸ� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ��ȣ : ");
		int input = sc.nextInt();
		
		for(int i =1 ; i<=input ; i++) {
			System.out.println(i + " ���");
		}
	}
	
	public void ex5() {
		//1���� �Է¹��� �� ���� 2�� �����ϸ� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ��ȣ : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i+=2) {
			
			System.out.println(i + " ���");
		}
	}

	public void ex6() {
		//1.0���� �Է� ���� �Ǽ� ���� 0.5�� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Ǽ� : ");
		double input = sc.nextDouble();
		
		for(double i=1.0 ; i<=input ; i+=0.5) {
			System.out.println(i + " ���");
		}
	}
	
	public void ex7() {
		
		//���� ���ĺ� A���� Z���� �� �ٷ� ���
		
		// * char �ڷ����� ������������ �����δ� ������ �����Ѵ�

		/**
		for(int i='A' ; i<='Z' ; i++) {
			System.out.print((char)i);
		}
		**/
		
		System.out.println("\n-------------------------------------");
		
		for(char i='A' ; i<='Z' ; i++ )  {
			System.out.print(i);
		}
	}
	
	public void ex8() {
		
		//10���� 1���� 1�� �����ϸ� ���
		
		for(int i = 10 ; i >= 1  ; i--) {
			System.out.println(i);
		}
	}
	
	public void ex9() {
		
		//for�� ���� 1 : �ݺ����� �̿��� ���� ����
		
		//1���� 10���� ��� ������ �� ���ϱ�
		
		int sum = 0; //�ݺ��Ǿ� �����Ǵ� i���� �հ踦 ������ ����
					 //0���� �����ϴ� ���� : �ƹ��͵� ������ �������� ��Ȯ�� ����� ������ �� ����.
		
		for(int i=0 ; i<=10 ; i++) {
			sum += i;
			//sum = sum + i;
		}
		System.out.println("�հ� : " + sum);
	}

	
	public void ex10() {
	
		//for�� ���� 2 : ���� 5���� �Է� �޾Ƽ� �հ� ���ϱ�
		
		/* ex)
		 �Է� 1 : 10
		 �Է� 2 : 20
		 �Է� 3 : 30
		 �Է� 4 : 40
		 �Է� 5 : 50
		 �հ� : 150
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=1 ; i<=5 ; i++) {
			
			System.out.print("�Է� " + i + " : ");
			int input = sc.nextInt();
			
			sum += input;
		}
		
		//System.out.println(input);
		//{}�ȿ��� ������ ������ {} �ۿ����� ����� �� ����
		//-> {} ������ ������ ������� ����
		
		System.out.println("�հ� : " + sum);
	}
	
	public void ex11() {
		
		//������ �� �� �Է� ������ ���� �Է� �ް� �Էµ� ������ �հ踦 ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է¹��� ������ ���� : ");
		int input1 = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=input1 ; i++) {
			System.out.print("�Է� " + i + " : ");
			int input2 = sc.nextInt();
			
			sum += input2;
		}
		System.out.println("�հ� : " + sum);
	}
	
	public void ex12() {
		
		//1���� 20���� 1�� �����ϸ鼭 ���
		//��, 5�� ����� ()�� �ٿ��� ���
		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 ....
		
		for(int i = 1 ; i <= 20 ; i++) {
			
			if (i%5==0) { //i�� 5�� ����� ���
				System.out.print("(" + i + ") ");
				
			} else { //i�� 5�� ����� �ƴ� ���
				System.out.print(i + " ");
			}	
		}
	}
	
	public void ex13() {
		
		// 1���� 20���� 1�� �����ϸ鼭 ���
		// ��, �Է� ���� ���� ����� () ǥ��
		
		//ex)
		//��ȣ�� ǥ���� ��� : 3
		//1 2 (3) 4 5 (6) 7...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȣ�� ǥ���� ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= 20 ; i++) {
			
			if (i%num==0) { 
				System.out.print("(" + i + ") ");
				
			} else { 
				System.out.print(i + " ");
			}	
		}
	}
	
	public void ex14() {
		
		//������ ���
		//2 ~ 9 ���� ���� �ϳ� �Է� �޾� �ش� ���� ���
		//�� �Է¹��� ���� 2 ~ 9 ���� ���ڰ� �ƴϸ� "�߸� �Է� �ϼ̽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		
		if (dan>=2 && dan<=9) { //dan�� 2 ~ 9 ������ ���
			
			for(int i=1 ; i<=9 ; i++ ) {
				System.out.printf("%d X %d = %d\n", dan, i , dan*i);
			}
			
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}
	
	public void ex15() {
		//19�� ��±�
		//2~19 ���� ���� �Է� �޾Ƽ� X1 ~ X19���� ���
		//�� �Է¹��� ���� 2 ~ 19 ���� ���ڰ� �ƴϸ� "�߸� �Է� �ϼ̽��ϴ�" ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int dan = sc.nextInt();
		
		if(dan>=2 && dan<=19) {
			
			for (int i=1 ; i<=19 ; i++) {
				System.out.printf("%-2d X %-2d = %-3d\n", dan, i, dan*i );
			}
			
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}
	
	// *** ��ø �ݺ���
	public void ex16() {
		
		//������ ��� ����ϱ�
		
		for(int dan=2 ; dan<=9 ; dan++ ) { //2~9�� ���� ���ʴ�� ����
			
			//���� for���� �ݺ��ϸ鼭 �ϳ��� ���� �� �ٷ� ���
			for(int num=1 ; num<=9 ; num++ ) { //�� �ܿ� ������ �� 1~9 ���� ���ʴ�� ����
				
				System.out.printf("%-2d X %-2d = %-2d  ", dan, num, dan*num);
				
			}
			//�ϳ��� �� ����� ������ �� �ٹٲ�
			System.out.println();
		}
	}
	
	
	public void ex17() {
		//������ ���� ���
		
		//9�� -> 2�� ���� ������
		//�������� ���� 1 -> 9���� ������
		
		
		for(int i=9 ; i>=2 ; i--) {
			
			for(int j=1 ; j<=9 ; j++) {
				System.out.printf("%d X %d = %-2d\n", i, j, i*j );
			}
			
			System.out.println();
		}
		
	}
	
	public void ex18() {
		//2�� for���� �̿��Ͽ� ���� ����� ����Ͻÿ�
		
		//12345
		//12345
		//12345
		//12345
		//12345
		
		for(int x = 1; x <=5 ; x++) { // 5���� �ݺ��ϴ� for��
			
			for(int i = 1 ; i<= 5; i++) {  // 12345 �� �� ����ϴ� for��
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		//54321
		//54321
		//54321
		
		for(int i=1; i<=3; i++) {
			for(int j=5 ; j>=1 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	public void ex19() {
		
		//2�� for���� �̿��Ͽ� ���� ����� ����Ͻÿ�.
		
		//1
		//12
		//123
		//1234
		
		
		for(int j=1; j<=4; j++) {
			
			for(int i=1; i<=j; i++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		//j�� 1�� �� i == 1
		//j�� 2�� �� i == 1, 2
		//j�� 3�� �� i == 1, 2, 3
		//j�� 4�� �� i == 1, 2, 3, 4
		
		System.out.println("--------------------------");
		
		//4321
		//321
		//21
		//1
		
		for(int j=4 ; j >=1 ; j--) { //�� �ݺ�
			
			for(int i=j ; i>=1 ; i--) { //�������
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		//j�� 1�� �� i == 4, 3, 2, 1
		//j�� 2�� �� i == 3, 2, 1
		//j�� 3�� �� i == 2, 1
		//j�� 4�� �� i == 1
		
	}
	
	public void ex20() {
		//count (���� ����)
		
		//1���� 20���� �����ϸ鼭 ���
		//�������� 1~20���� 3�� ����� ���� ���
		
		int count = 0; //3�� ����� ������ ���� ���� ����
		int sum = 0;
		
		for(int i=1 ; i<=20 ; i++) {
			
			if(i%3==0) { //3�� ���
				System.out.print(i + " ");
				count++;		//if���� ������ �� ���� 1�� ����
				sum += i; 		//3�� ��� ����
			}
		}
		
		System.out.println(": " + count + "��");
		System.out.println("3�� ����� �հ� : " + sum);
		
	}
	
	public void ex21() {
		
		//2�� for���� count�� �̿��ؼ� �Ʒ� ��� ����ϱ�
		
	    //  1  2  3  4
	    //  5  6  7  8
	    //  9 10 11 12
		
		int count = 1;
		
		for(int i=1; i<=3 ; i++) { //3��
			
			for(int j=1 ; j<=4 ; j++) {
				
			System.out.printf("%3d",count);
			count++;
				
			}
			System.out.println();
		}
	}

}
