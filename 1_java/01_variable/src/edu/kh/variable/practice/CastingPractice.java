package edu.kh.variable.practice;

public class CastingPractice {
	public static void main(String[] args) {
		
		//���� ����
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		//iNum1 iNum2 >> 2?
		System.out.println(iNum1/iNum2); //2
		
		//���� ������ 2�� ����� ���?
		System.out.println((int)dNum); //2
		
		//10.0 ����� 2���� ���
		System.out.println(dNum*iNum2);
		System.out.println((double)iNum1);
		
		//3�� ����� ��� 2����
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		//iNum1, iNum2 >> 2.5?
		System.out.println((double)iNum1/iNum2);
		
		
		//float vs. double ������
		
						// 10  / 3.0f
		System.out.println(iNum1/fNum);  //3.3333333
		
						//  10  / 3.0
		System.out.println(iNum1/(double)fNum);  //3.3333333333333335
		
		//float : �Ҽ��� �Ʒ� 8��° �ڸ����� ���� �� �ݿø�
		//double : �Ҽ��� �Ʒ� 16��° �ڸ����� ���� �� �ݿø�
	}

}
