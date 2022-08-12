package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	
	public void ex1() {
		
		/* if��
		 - ���ǽ��� true�϶��� ���� �ڵ� ����
		
		  
		 [�ۼ���]
		 if(���ǽ�) {}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		//�Էµ� ������ ������� �˻�
		if(input > 0) {
			System.out.println("��� �Դϴ�.");
		}
		
		if(input <= 0) {
			System.out.println("����� �ƴϴ�.");
		}
		
	}
	
	
	public void ex2() {
		
		/* if - else��
		 -���ǽ� ����� true�̸� if��, false�̸� else ������ �����.
		 
		 [�ۼ���]
		 if(���ǽ�) {
		 		���ǽ��� true�� �� ������ �ڵ�
		 } else {
		 		���ǽ��� flase�� �� ������ �ڵ�
		 }
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//Ȧ¦ �˻�
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		
		if(input%2 != 0) {
			System.out.println("Ȧ�� �Դϴ�.");
		} else {
			
			// ** ��ø if�� **
			if(input == 0) {
				System.out.println("0 �Դϴ�.");
			} else {
				System.out.println("¦�� �Դϴ�.");
			}
		}
		
	}
	
	public void ex3() {
		
		//if - else if - else
		
		//���, ����, 0 �Ǻ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		if(input > 0) { //input�� ����� ���
			System.out.println("��� �Դϴ�.");
			
		} else if(input < 0) { //input�� ������ ���
			System.out.println("���� �Դϴ�.");
			
		} else {
			System.out.println("0 �Դϴ�.");
		}
	}
	
	public void ex4() {
		
		// ��(month)�� �Է� �޾� �ش� �޿� �´� ���� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		String season; //�Ʒ� ���ǹ� ���� ����� ������ ���� ����
		
		
		if(month==3 || month==4 || month==5) { // �� : 3, 4, 5
			season = "��";
			
		} else if(month>=6 && month<=8) { //���� : 6, 7, 8
			season = "����";
			
		} else if(month>=9 && month<=11) { //���� : 9, 10, 11
			season = "����";
			
		} else if(month==12 || month==1 || month==2) { //�ܿ� : 12, 1, 2
			season = "�ܿ�";
			
		} else { //if, else if�� ��� false�� ���
			season = "�ش��ϴ� ������ �����ϴ�.";
		}
		
		System.out.println(season);
		
		sc.close();
	}
	
	public void ex5() {
		
		//���̸� �Է� �޾� 13�� ���ϸ� "��� �Դϴ�."
		//13���ʰ� 19�� ���ϸ� : "û�ҳ� �Դϴ�."
		//19�� �ʰ� �� : "���� �Դϴ�." ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("��� �Դϴ�.");
			
		} else if (age > 19) {
			System.out.println("���� �Դϴ�.");
		
		} else {
			System.out.println("û�ҳ� �Դϴ�.");
			
		}
		
		
		/*if (age <= 13) {
			System.out.println("��� �Դϴ�.");
		} else if (age <= 19) {
			System.out.println("û�ҳ� �Դϴ�.");
		} else {
			System.out.println("���� �Դϴ�.");
		}*/
	}
	
	public void ex6() {
		
		
		/*����(100�� ����)�� �Է� �޾�
		 
		 90�� �̻� : A
		 80�� �̻� 90�� �̸� : B
		 70�� �̻� 80�� �̸� : C
		 60�� �̻� 70�� �̸� : D
		 60�� �̸� : F
		 0�� �̸�, 100 �ʰ� : "�߸� �Է��ϼ̽��ϴ�.
		
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			
		} else if (score >= 90) {
			System.out.println("A");
			
		} else if (score >= 80) {
			System.out.println("B");
			
		} else if (score >= 70) {
			System.out.println("C");
			
		} else if (score >= 60) {
			System.out.println("D");
			
		} else {
			System.out.println("F");
		}	
	}
	
	public void ex7() {
		
		// ���̱ⱸ ž�� ���� �˻�
	    // ���̰� 12�� �̻�, Ű 140.0cm �̻� �� ��쿡�� "ž�� ����"
	    // ���̰� 12�̸��� ��� : "���� ������ �ƴմϴ�."
	    // Ű�� 140.0cm �̸� : "���� Ű�� �ƴմϴ�."
	    // ���̸� 0�� �̸�, 100�� �ʰ� �� : "�߸� �Է��ϼ̽��ϴ�."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű �Է�(cm) : ");
		double height = sc.nextDouble();
		
		
		if (age<0 || age > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
		} else if (age < 12) {
			System.out.println("���� ������ �ƴմϴ�.");
		
		} else if (height < 140.0) {
			System.out.println("���� Ű�� �ƴմϴ�.");
		
		} else {
			System.out.println("ž�� ����");
		}	
	}
	
	public void ex8() {
		
		// ���̱ⱸ ž�� ���� �˻� ���α׷�
		// ���� - ���� : 12�� �̻�
		//     -  Ű : 140.0cm �̻�
		
		// ���̸� 0~100�� ���̷� �Է����� ���� ��� : "���̸� �߸� �Է� �ϼ̽��ϴ�."
		// Ű�� 0~250.0cm ���̷� �Է����� ���� ��� : "Ű�� �߸� �Է� �ϼ̽��ϴ�."
		// -> �Է��� ���� ���� �˻縦 �����Ͽ� �߸��� ��� ���α׷� ����
		
		// ���� O , Ű X : "���̴� �����ϳ�, Ű�� ����ġ ����";
		// ���� X , Ű O : "Ű�� �����ϳ�, ���̴� ����ġ ����";
		// ���� X , Ű X : "���̿� Ű ��� ����ġ ����";
		// ���� O , Ű O : "ž�� ����"

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		String result;
		
		if (age < 0 || age > 100) {
			result = "���̸� �߸� �Է��ϼ̽��ϴ�.";
		
		} else {
			System.out.print("Ű �Է� : ");
			double height = sc.nextDouble();
			
			if (height < 0 || height > 250.0) {
				result = "Ű�� �߸� �Է��ϼ̽��ϴ�.";
			
			} else {
				
				if (age<12) {
					if (height < 140) {
						result = "���̿� Ű ��� ����ġ ����";
					} else {
						result = "Ű�� �����ϳ�, ���̴� ����ġ ����";
					}
					
				} else {
					if (height < 140) {
						result = "���̴� �����ϳ�, Ű�� ����ġ ����";
					} else {
						result = "ž�� ����";
					}	
				}
				
			}
			
		}
		
		System.out.println(result);
		
	}

}
