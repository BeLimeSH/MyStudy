package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		
		/* ����ȯ(Casting) : ���� �ڷ����� ��ȯ�ϴ� ��(��, boolean ����)
		 
		 
		 ** ����ȯ�� �� �ʿ��ұ�?
		 : ��ǻ�ʹ� �⺻������ ���� �ڷ��������� ������ ������.
		   �ٸ� �ڷ����� ���� �� ���� �߻�.
		   --> �̷� ��Ȳ�� �ذ��ϱ� ���ؼ� �ʿ��� ����� ����ȯ.
		 
		 * �ڵ�/���� ����ȯ�� ����.
		 
		  
		  
		 * */
		
		//�ڵ� ����ȯ
		//- [���� ����]�� ū �ڷ����� [���� ����]�� ���� �ڷ����� ���� ��
		//	���� �ڷ��� -> ū �ڷ������� �����Ϸ��� ���� �ڵ������� ��ȯ�Ǵ� ��
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("�ڵ� ����ȯ ��� : " + (num1 + num2));
		
		int i1 = 3;
		double d1 = i1;  //double�� �Ǽ��� ������ �� �ִ� �ڷ���
						 //������ ���ԵǴ� ������ ����Ǹ� �Ǽ��� �ڵ� ����ȯ
		
		System.out.println("i1 : " + i1); //3
		System.out.println("d1 : " + d1); //3.0
		
		System.out.println(d1 + num2); //double + double
		
		
		// int -> long ����ȯ
		int i2 = 2100000000; //21��
		long l2 = 10_000_000_000l; //100��
		long result2 = i2 + l2;
		//int + long -> long + long = long
		
		System.out.println("result2 : " + result2);
		
		//char -> int ����ȯ
		char ch3 = 'V';
		int i3 = ch3; //���Ե� ����
					  //int ���� = char �� -> int �ڵ� ����ȯ
		
		System.out.println(i3);
		
		char ch4 = '��';
		int i4 = ch4;
		System.out.println(i4);
		
		//long -> float �ڵ� ����ȯ
		long l5 = 123456789123456789L;
		float f5 = l5; //long ������ �ʰ�
		//float = long * int(-> long)
		//float = long ���
		//float = float(�ڵ� ����ȯ)
		System.out.println(f5);
		
		//�����÷ο� ������ ��ǻ�Ͱ� ������ �� ����. -> �����ڰ� ������ �ؾ���.
		
		int i6 = 2147483647; //int �ִ�
		int result6 = i6 + 1;
		System.out.println(result6); // -2147483648
		
		
		
	}

}
