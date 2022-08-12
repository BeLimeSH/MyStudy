package edu.kh.variable.ex1;

public class VariableExample1 {
	//������ .java ���ϰ� class �����ʿ� �ۼ��� �̸��� ���ƾ� �Ѵ�.
	
	public static void main(String[] args) {
		
		System.out.println(2 * 3.141592653589793 * 5);
		System.out.println(3.141592653589793 * 5 * 5);
		System.out.println(3.141592653589793 * 5 * 5 * 20);
		System.out.println(4 * 3.141592653589793 * 5 * 5);
		
		
		/* ����(Variable)
		 - �޸�(RAM)�� ���� ����ϴ� ����
		   -> ������ ��ϵǴ� ��(Data)�� ���� �� �־ ��������Ѵ�.
		 - ������ ���� ���� ����(����Ǵ� ���� ����, ũ�Ⱑ �ٸ�)
		 
		 ���� ����� ����
		 1. ������ ����
		 2. ���뼺 ����(�ѹ� ���� ������ ��� ���)
		 3. �ڵ� ������ ����
		 4. ���������� ����(�ڵ� ������ ����) */
		
		
		//���� ���
		double pi = 3.141592653589793;  //������
		int r = 5;						//������(radius)
		int h = 20;						//����(height)
		
		System.out.println("-----------------------");
		
		System.out.println(2 * pi * r);		//���� �ѷ�
		System.out.println(pi * r * r);		//���� ����
		System.out.println(pi * r * r * h);	//������� ����
		System.out.println(4 * pi * r * r);	//���� �ѳ���
		
	}

}
