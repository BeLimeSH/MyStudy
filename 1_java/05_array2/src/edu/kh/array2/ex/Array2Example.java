package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	/* 2���� �迭
	  
	 - �ڷ����� ���� 1���� �迭�� �������� �ٷ�� ��
	   -> ��, �� ���� �߰�
	 
	 
	 
	 
	 * */
	
	public void ex1() {
		
		//2���� �迭 ����
		//int 2���� �迭�� �����ϴ� ������ ���� ����
		//(������ == ���� ���� == ���۷��� ����)
		
		//2���� �迭 �Ҵ�
		//-> new �ڷ���[��ũ��][��ũ��]
		
		int[][] arr = new int[2][3];
		//heap ������ int 2���� �迭 2�� 3�� ������ �Ҵ�
		
		//2���� �迭 �ʱ�ȭ
		
		//1) ��, �� �ε����� �̿��ؼ� ���� �ʱ�ȭ
		/*arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;

		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;*/
		
		
		//2) 2�� for���� �̿��� �ʱ�ȭ
		
		int num = 10; //�迭 ��� �ʱ�ȭ�� ����� ����
		
		//   �迭 ����
		//-> �迭��.length�� ������ ���� �����ϰ� �ִ� �迭�� ���̸� ��ȯ
		
		System.out.println(arr.length); //2 (�� ����)
		//arr�� �����ϰ� �ִ� 2���� �迭�� ���� ����
		
		System.out.println(arr[0].length); //3 (�� ����)
		//arr[0] ���� �����ϰ� �ִ� 1���� �迭(��)�� ����
		
		for(int row=0 ; row<arr.length ; row++) { //�� �ݺ�
			
			for(int col=0 ; col<arr[row].length ; col++) {
				
				arr[row][col] = num;
				num += 10;
			}
		}
		
		//Arrays.toString(�迭��) : �����ϰ� �ִ� 1���� �迭���� ���ڿ��� ��ȯ
		System.out.println(Arrays.toString(arr));
		
		//Arrays.deepToString(�迭��)
		//- �����ϰ� �ִ� �迭�� �����Ͱ� ������ �κб��� �İ� ����
		//	��� ���� ���ڿ��� ��ȯ
		System.out.println(Arrays.deepToString(arr));
	}
	
	
	public void ex2() {
		//2���� �迭 ����� ���ÿ� �ʱ�ȭ
		
		//3�� 3��¥�� ������ 2���� �迭 ����� ���ÿ� 1~9���� �ʱ�ȭ
		
		int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };
	
		//�� ���� �� ���
		for(int row=0 ; row<arr.length ; row++) { //�� �ݺ�
			
			int sum = 0;
			
			for(int col=0; col<arr[row].length ; col++ ) { //�� �ݺ�
				sum += arr[row][col]; //���� ���� ��� �� ���� ����
			}
			
			System.out.printf("%d���� �� : %d\n", row, sum);
		}
		
		System.out.println("-------------------------------------");
		
		//�� ���� �� ���
		//-> �� ���� ���� �� �� ���� ���� ����
		//--> ������ �簢���� ���¸� ���� 2���� �迭�� ��� ���� ���̰� ����.
		
		for(int col=0 ; col<arr[0].length ; col++) { //�� �ݺ�
			
			int sum = 0;
			
			for(int row=0 ; row<arr.length ; row++) { //�� �ݺ�
				
				sum += arr[row][col];
				//			0    0
				//			1    0
				//			2    0
			}
			
			System.out.printf("%d���� �� : %d\n", col, sum);
		}
		
		System.out.println("-------------------------------------");
		//��ü �� ���
		
		int sum = 0;
		
		for(int row=0 ; row<arr.length ; row++) { //�� �ݺ�
			
			for(int col=0; col<arr[row].length ; col++ ) { //�� �ݺ�
				sum += arr[row][col]; //���� ���� ��� �� ���� ����
			}
		}
		
		System.out.println("��ü �� : " + sum);
	}
	
	
	public void ex3() {
		
		//���� �迭
		//- 2���� �迭 ���� �� ������ �迭 ����(��)�� �������� �ʰ�
		//	���߿� ���� ũ�Ⱑ �ٸ� 1���� �迭�� �����Ͽ� �����ϴ� �迭
		
		char[][] arr = new char[4][];
		//char 2���� �迭 ������ �� �κи� ����
		
		arr[0] = new char[3]; //0�࿡ 3��¥�� 1���� �迭�� �����Ͽ� �ּҰ� ����
		arr[1] = new char[4]; //1�࿡ 4��¥�� 1���� �迭�� �����Ͽ� �ּҰ� ����
		arr[2] = new char[5]; //2�࿡ 5��¥�� 1���� �迭�� �����Ͽ� �ּҰ� ����
		arr[3] = new char[2]; //3�࿡ 2��¥�� 1���� �迭�� �����Ͽ� �ּҰ� ����
		
		//�� �迭 ��ҿ� 'a'���� ���ʴ�� ����
		
		char ch = 'a';
		
		for(int row=0; row<arr.length ; row++) {
			
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = ch++;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}
	
	

}
