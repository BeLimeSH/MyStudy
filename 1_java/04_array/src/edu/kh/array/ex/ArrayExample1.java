package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	
	/* �迭(Array)
	 - ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��.(�ڷᱸ��)
	 - ������ �������� �ϳ��� �迭������ �ҷ����� ������ index�� �̿���.
	   (index�� 0���� �����ϴ� ����)
	 
	  
	 */
	
	public void ex1() {
		
		// ���� vs �迭
		
		// 1-1. ���� ����
		int num;
		//Stack ������ int �ڷ����� ������ �� �ִ� ���� 4byte�� ����(�Ҵ�)�ϰ�
		//�� ������ num�̶�� �̸��� �ο�.
		
		
		// 1-2. ���� ����
		num = 10;
		//������ num�̶�� ���� ������ 10�� ����
		
		// 1-3. ���� ���
		System.out.println("num�� ����� �� : " + num);
		//num�� �ۼ��� �ڸ��� num�� ����� ���� �о�ͼ� ���
		
		//------------------------------------------------------
		
		// 2-1. �迭 ����
		int[] arr;
		//Stack ������ int[] (int �迭) �ڷ��� ������ 4byte �Ҵ��ϰ�
		//�� ������ arr�̶�� �̸��� �ο�
		// ** �ش� ������ �������� �ּ� ��(4byte)���� ������ �� ����.
		
		
		// 2-2. �迭 �Ҵ�
		arr = new int[3];
		
		//new : "new ������" ��� �ϸ�
		//		Heap �޸� ������ ���ο� ����(�迭, ��ü)�� �Ҵ�
		
		//int[3] : int �ڷ��� ���� 3���� �ϳ��� �������� ��Ÿ���� �迭
		
		//new int[3] : heap ������ int 3ĭ¥�� int[]�� ����(�Ҵ�)
					// ** ������ int[]���� ���� �ּҰ� �����ȴ�! **
		
		//  arr   =   new Int[3];
		//(int[])		(int[])  -> ���� �ڷ��� == ���� ����

		//heap ������ ������ int[]�� ���� �ּҸ�
		//stack ������ ������ arr ������ ����
		
		// -> arr������ int[]�� �����ϰ� ��!
		//	 (�׷��� arr�� �������̶�� ��)
		
		// 2-3. �迭 ��� �� ����
		//arr�� int[] ������ ���� ������
		//arr[0] int �ڷ��� �����̱� ������ ���� ���� ������ �� �ִ�.
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		
		// 2-4. �迭 ��� �� �о����
		System.out.println(arr[0]); //arr�� �����ϰ� �ִ� �迭�� 0�� �ε��� ���� ����
		System.out.println(arr[1]); //arr�� �����ϰ� �ִ� �迭�� 1�� �ε��� ���� ����
		System.out.println(arr[2]); //arr�� �����ϰ� �ִ� �迭�� 2�� �ε��� ���� ����
	}
	
	public void ex2() {
		
		//�迭 ���� �� �Ҵ�
		int[] arr = new int [4];
		
		// 1) stack ������ int[] �ڷ��� ������ ���� arr ����
		// 2) heap ������ int �ڷ��� 4���� �������� �ٷ�� int[] �Ҵ�
		// 3) ������ int[]�� �ּҸ� arr�� �����Ͽ� �����ϴ� ���¸� �����.
		
		
		//�迭 ����(��ĭ?) : �迭��.length
		System.out.println("�迭�� ���� : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		
		//�迭�� for��
		// i==index
		for (int i=0; i<arr.length ; i++) {
			//0 �̻� arr �迭 ���� �̸��� ����
			
			System.out.printf("arr[%d]�� ����� �� : %d\n", i, arr[i]);
			
		}
	}
	
	
	public void ex3() {
		
		//5���� Ű(cm)�� �Է� �ް� ��� ���ϱ�
		
		//1�� Ű �Է� : 170.5
		//2�� Ű �Է� : 165.7
		//3�� Ű �Է� : 184.3
		//4�� Ű �Է� : 190.2
		//5�� Ű �Է� : 174.4
		
		//�Է� ���� Ű : 170.5 165.7 184.3 190.2 174.4
		//��� : 177.02
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		
		double sum = 0;
		
		//double[] �ڷ��� �������� height�� stack ������ �����ϰ�
		//height�� heap������ ���� ������ double 5ĭ ¥�� double[]�� ���� �ּҸ� ����
		
		for (int i=0; i<height.length ; i++) {
			
			System.out.print((i+1) + "�� Ű �Է� : ");
			
			height[i] = sc.nextDouble();
			//�� �ε����� �Է� ���� ���� ����(�ʱ�ȭ)	
		}
		
		System.out.println(); //�� �ٲ�
		
		for (int i=0; i<height.length ; i++) {
			
			System.out.print(height[i] + " ");
			
			sum += height[i]; //�迭�� ����� ���� sum�� ����
		}
		System.out.printf("\n��� : %.2f\n" , sum/height.length);
	}
	
	
	public void ex4() {
		
		//�Է� ���� �ο� �� ��ŭ�� ������ �Է� �޾� �迭�� ����
		//�Է��� �Ϸ�Ǹ� ���� �հ�, ���, �ְ���, ������ ���
		
		//ex)
		//�Է� ���� �ο� �� : 4
		//1�� ���� �Է� : 100
		//2�� ���� �Է� : 80
		//3�� ���� �Է� : 50
		//4�� ���� �Է� : 60
		
		//�հ� : 290
		//��� : 72.5
		//�ְ��� : 100
		//������ : 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� ���� �ο� �� : ");
		int input = sc.nextInt();
		
		//�迭 ���� �� �Ҵ�(�Ҵ��� �迭�� ũ��� �Է� ���� ũ�� ��ŭ(= input))
		
		int[] score = new int[input];
		int sum = 0; //�հ� ����� ����
		
		
		for(int i=0 ; i<score.length ; i++) {
			System.out.print((i+1) + "�� ���� �Է� : ");
			score[i] = sc.nextInt();
			
			sum += score[i]; //������ �Է� ���� ���� sum ����
			
		}
		
		//�ְ� ������ ���ϱ�
		
		int max = score[0];
		int min = score[0];
		//�Ʒ� for���� �̿��ؼ� score �迭�� �ִ� ��� ���� max. min�� ��
		//�� ��, score[i] ���� max���� ũ�� max�� ����
		//		 score[i] ���� min���� ������ min�� ����
		
		for(int i=0; i<score.length; i++) {
			
			if(max<score[i]) {	//�ְ��� ��
				max = score[i];
			}
			
			else if(min>score[i]) {	//������ ��
				min = score[i];
			}
		}

		System.out.println("�հ� : " + sum);
		System.out.printf("��� : %.2f\n", (double)sum/score.length);
		System.out.println("�ְ��� : " + max);
		System.out.println("������ : " + min);
	}
	
	
	public void ex5() {
		//�迭 ����� ���ÿ� �ʱ�ȭ�ϱ�
		
		char[] arr = new char[5];
		
		//char[] arr�� �����ϴ� �迭 ��ҿ� A,B,C,D,E �����ϱ�
		for(int i=0 ; i<arr.length ; i++) {
			
			arr[i] = (char)('A' + i);
		}
		
		// ** Arrays Ŭ����
		// - Java���� �����ϴ� �迭�� ���õ� ����� ��Ƶ� Ŭ����
		
		int[] arr2 = new int[4];
		System.out.println(arr2); //[I@5e91993f (int �迭�� �ּ�)
		
		// Arrays.toString(�迭��) : ��� ��� ���� ���
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
		
		//char �ڷ����� �� �ٸ� ���
		System.out.println(arr);

		
		char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		//char[] ���� ���� arr3�� �����ϰ� 
		//heap ������ char[]�� ���� ��
		//���� 'A', 'B', 'C', 'D', 'E'�� �ʱ�ȭ�� �ּҸ� arr3�� ����
		
		//{}�� �迭�� ���ͷ� ǥ���
		
		System.out.println("arr3 ���� : " + arr3.length);
		System.out.println(Arrays.toString(arr3));
		
	}

	public void ex6() {

		//���� �޴� �̱� ���α׷�
		
		String[] arr = {"���", "�������", "�ܹ���", "���", "����", "�Ľ�Ÿ"};
		
		//0 ~ (�迭����-1) ������ ���� �߻�
		
		System.out.print("���� ���� �޴� : " + arr[(int)(Math.random() * 6)]);
		
	}
	
	public void ex7() {
		//�迭�� �̿��� �˻�
		
		//�Է¹��� ������ �迭�� �ִ��� Ȯ��
		//���� �ִٸ� ��� �ε����� �����ϴ��� ���
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int input = sc.nextInt();
		
		//��ȣ�� ��Ÿ���� ���� ����
		//flag == false : ��ġ�ϴ� ���� �������� ����
		//flag == true : ��ġ�ϴ� ���� ����
		boolean flag = false;
		
		//arr �迭 ��� ���� ����(�ݺ� ����)
		for(int i=0; i<arr.length; i++) {
			
			//arr[i]�� ����� ���� input�� ���� ���
			if(arr[i]==input) {
				System.out.println(i + "��° �ε����� ����");
				
				flag = true;
			}
		}
		
		//flag ���¸� �˻�
		if(!flag) {
			System.out.println("�������� ����");
		}
	}
	
	public void ex8() {
		
		//�Է� ���� ���� ��ġ ���� ������ �ε��� ��ȣ ���
		//������ "�������� ����"
		
		String[] arr = {"���", "����", "�ٳ���", "Ű��", "���", "�ƺ�ī��"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for (int i=0; i<arr.length; i++ ) {
			
			if(arr[i].equals(input)) {
				
				System.out.println(i + "��° �ε����� ����");
				
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("�������� ����");
		}
		
	}
	
	
	public void ex9() {
		
		//1. ���ڿ��� �Է� �޾� �� ���ھ� �߶󳻾� char �迭�� ������� ����
		
		//2. ���� �ϳ��� �Է� �޾� ��ġ�ϴ� ���ڰ� char �迭�� � �����ϴ��� Ȯ��
		
		//3. ��, ��ġ�ϴ� ���ڰ� ���� ��� "�������� �ʽ��ϴ�." ���
		
		//[��� �ؾߵǴ� ���, ���]
		//1) �迭 �˻�
		//2) String.length() : ���ڿ��� ����
		//3) String.charAt(index) : ���ڿ����� Ư�� index�� ��ġ�� ���� �ϳ��� �о��.
		//  ex) "Hello".charAt(1) -> 'e'
		
		//4) count (���� ����)

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String input = sc.nextLine(); 	//�� ��(���� ����) �Է� �ޱ�
		
		//1. ���ڿ��� �Է� �޾� �� ���ھ� �߶󳻾� char �迭�� ������� ����
		char[] arr = new char[input.length()];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		//�߰� Ȯ��
		//System.out.println(Arrays.toString(arr));
		
		//2. ���� �ϳ��� �Է� �޾� ��ġ�ϴ� ���ڰ� char �迭�� � �����ϴ��� Ȯ��
		System.out.print("�˻��� ���� �Է� : ");
		char ch = sc.nextLine().charAt(0);
				// String.charAt(0) : ���ڿ� ���� �� ���� ������
		
		int count = 0; 
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i] == ch) {
				//arr[i] ���� �˻��� ���� ch�� ���� ���
				//-> ī��Ʈ
				count++;
			}
		}
		
		//��� ���
	
		//3. ��, ��ġ�ϴ� ���ڰ� ���� ��� "�������� �ʽ��ϴ�." ���
		 if(count > 0) {
			System.out.println(count + "�� ����");
			
		 } else {
			 System.out.println("�������� �ʽ��ϴ�.");
		 }
	}
}
