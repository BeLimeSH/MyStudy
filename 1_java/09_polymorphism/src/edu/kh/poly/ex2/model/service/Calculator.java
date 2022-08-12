package edu.kh.poly.ex2.model.service;

//���� �������̽�
//-> ��� ���⿡ ���� ���� �ʵ�, ��ɸ��� �����ϴ� ����(interface) �뵵
public interface Calculator {
	
	//�������̽� : �߻� Ŭ������ ����ü (�߻� Ŭ�������� �߻󵵰� ����)
	//		- �߻� Ŭ���� : �Ϻθ� �߻� �޼���(0�� �̻�)
	//		- �������̽� : ��� �߻� �޼���
	
	
	//�ʵ�(���������� public static final)
	//-> ��� �ۼ��ϵ� ��� public static final
	public static final double PI = 3.14;
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0;
	
	
	//�޼���(���������� public abstract)
	public abstract int plus(int num1, int num2);
	public abstract int minus(int num1, int num2);
	public abstract int multiple(int num1, int num2);
	public abstract double divide(int num1, int num2);
	
}
