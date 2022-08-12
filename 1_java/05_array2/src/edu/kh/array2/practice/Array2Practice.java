package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {
	
	public void practice1() {
		
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[0].length; j++) {
				
				arr[i][j] = "(" + i + ", " + j + ")";
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice2() {
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i=0; i<arr.length ;i++) {
			
			 for(int j=0; j<arr[0].length; j++) {
				 
				 arr[i][j] = num;
				 
				 System.out.printf("%3d", arr[i][j]);
				 num++;
			 }
			 
			 System.out.println();
		}
		
	}
	
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int i=0; i<arr.length ;i++) {
			
			 for(int j=0; j<arr[0].length; j++) {
				 
				 arr[i][j] = num;
				 
				 System.out.printf("%3d", arr[i][j]);
				 num--;
			 } 
			 System.out.println();
		}
	}
	
	
	public void practice4() {
		
		
		int[][] arr = new int[4][4];
		
		//��� ���� : ������ �ʴ� Ư�� ���� �̸��� �ٿ���
		final int ROW_LAST_INDEX = arr.length -1; //�� ������ �ε���
		final int COL_LAST_INDEX = arr[0].length -1; //�� ������ �ε���
		
		
		for(int row=0; row<arr.length; row++) { //�� �ݺ�
						  //���� ����
			
			for(int col=0; col<arr[row].length; col++) { //�� �ݺ�
							  //row��° ���� ���� ����
				if(row != ROW_LAST_INDEX && col != COL_LAST_INDEX) {
					
					arr[row][col] = (int)(Math.random()*10+1);
					
					// �� ���� ������ ���� ������ ����
					arr[row][COL_LAST_INDEX] += arr[row][col];
					
					// �� ���� ������ �࿡ ������ ����
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					
					//������ ��� ������ ������ ��, ������ ���� ����
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col];
					
				}
				
				System.out.printf("%4d", arr[row][col]);
				} //�� �ݺ� ��
			
			System.out.println();
			}// �� �ݺ� ��
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�� ũ�� : ");
			int row = sc.nextInt();
			
			System.out.print("�� ũ�� : ");
			int col = sc.nextInt();
			
			if(row<1 || row>10 || col<1 || col>10) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
				
				continue;
			}
			
			char[][] arr = new char[row][col];
			
			for(int i=0; i<arr.length ; i++) {
				
				for(int j=0; j<arr[0].length; j++) {
					
					arr[i][j] = (char)((int)(Math.random()*26+65));
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ũ�� : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for(int i=0; i<row ; i++) {
			
			System.out.print(i + "���� ũ�� : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
			
		}
		
		char ch = 'a';
		
		for(int i=0; i<arr.length ; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public void practice7() {
		
		String[] students = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int count = 0;
		
		System.out.println("== 1�д� ==");
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[0].length; j++) {
				
				arr1[i][j] = students[count];
				
				System.out.print(arr1[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		
		for(int i=0; i<arr2.length; i++) {
			
			for(int j=0; j<arr2[0].length; j++) {
				
				arr2[i][j] = students[count];
				
				System.out.print(arr2[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
	}
	
	
	public void practice8() {
		
		//�ٽ�Ǯ��//
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"���ǰ�", "������", "�����", "�����", "���̹�", "�ں���",
				"�ۼ���", "������", "������", "��õ��", "��ǳǥ", "ȫ����"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int count = 0;
		
		System.out.println("== 1�д� ==");
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[0].length; j++) {
				
				arr1[i][j] = students[count];
				
				System.out.print(arr1[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("== 2�д� ==");
		
		for(int i=0; i<arr2.length; i++) {
			
			for(int j=0; j<arr2[0].length; j++) {
				
				arr2[i][j] = students[count];
				
				System.out.print(arr2[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		System.out.print("�˻��� �л� �̸��� �Է��ϼ��� : ");
		String input = sc.next();
		
		
		
		
		
	}
	
	
	public void practice9() {
		
	}
	
	
	public void practice10() {
		
	}
}
