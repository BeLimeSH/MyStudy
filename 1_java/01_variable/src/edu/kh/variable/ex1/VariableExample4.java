package edu.kh.variable.ex1;

public class VariableExample4 {
	public static void main(String[] args) {
		
		
		/*���� ����ȯ
		 - ���� �ڷ����� ���ϴ� �ڷ������� ���� ��ȯ��Ű�� ��.
		 
		 1) ���� ������ ū �ڷ����� ���� �ڷ������� ��ȯ�� �� ���
		 2) ��µǴ� �������� ǥ����� ��ȭ��Ű�� ���� ��
		 
		 * ���� ����ȯ ���
		 - �ڷ����� ��ȯ��Ű�� ���� �� �Ǵ� ���� �տ� (�ڷ���)�� �ۼ�
		 
		 ex) double temp = 3.14;
		 	 int num = (int)temp;
		 */
		
		double temp = 3.14;
		int num = (int)temp;
		
		System.out.println("temp : " + temp);
		System.out.println("num : " + num);
		
		//�Ǽ� -> ������ ��ȯ�� �Ҽ��� ���� ó��(������ �ս�)
		
		//int -> byte ���� ����ȯ
		int iNum = 290;
		byte bNum = (byte)iNum;  //Type mismatch: cannot convert from int to byte
		
		System.out.println("int -> byte ���� ����ȯ");
		System.out.println("brfore : " + iNum);
		System.out.println("after : " + bNum);
		
		//���� ������ ������ ��ȯ�ÿ��� ���� ���� ���� ������ ������ �ս��� �߻�
		
		
		//char -> int ���� ����ȯ
		
		char ch = 'A'; //65
		
		int iNum2 = ch; //�ڵ� ����ȯ �̿�
		System.out.println(iNum2);
		
		System.out.println((int)ch); //���� ����ȯ �̿�
		
		
		//int -> char ���� ����ȯ
		
		int iNum3 = 44033;
		System.out.println(iNum3 + "��°���� : " + (char)iNum3);
		
		//�ҹ��� 'a'���� 10ĭ �ڿ� �ִ� ���ڴ� �����ϱ�?
		char ch4 = 'a';
		
		int iNum4 = ch4 + 10;
		System.out.println((char)iNum4);
		
		System.out.println((char)(ch4 + 10));
		
	}

}
