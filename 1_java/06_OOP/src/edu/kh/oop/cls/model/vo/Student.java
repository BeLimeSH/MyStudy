package edu.kh.oop.cls.model.vo;

public class Student { //Ŭ���� �����
//[����������] [�����] class Ŭ������	
	
//���� ������ public : ���� ������Ʈ ������ � Ŭ���������� import �� �� ������ ��Ÿ��.
	

	//1.�ʵ�(field) : ��ü�� �Ӽ��� �ۼ��ϴ� Ŭ���� ���� ����
	
	// == ��� ���� : �޼��� �ۿ� �ۼ��� ����
	
	// �ν��Ͻ� ���� : �ʵ忡 �ۼ��Ǵ� �Ϲ� ����
	
	// Ŭ���� ����(== static ����) : �ʵ忡 static ���� �ۼ��� ����
	// -> ���� Ŭ������ ������� ��ü�� ���� ������ �� �ֱ� ������.
	
	
	/**
	   [����������] 	[�����] 	   �ڷ���	   ������ 	 [= �ʱⰪ];
		
		+ public		 final		 �⺻�ڷ���
		# protected		 static		    �迭
		~ (default)	   final static	  Ŭ������
		- private	   static final	  (������)
			
	* �ʵ��� ���� �������� �� : ���� ���� ������ ������ ��Ÿ��.
	
	**/
	
	public int v1 = 10;
	protected int v2 = 20;
	int v3 = 30;
	private int v4 = 40;
	
	//���� ������ ����
	public void ex() {
		
		System.out.println("���� Ŭ���� ���� ���� ����");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}
	
	//--------------------------------------
	
	//static �����
	
	public static String schoolName = "KH����б�";
	
	private String name; //ĸ��ȭ ��Ģ ������ private -> ���� ���� ��� �ʿ�
	
	{ //�ʱ�ȭ ��� : ��ü ���� �� �ʵ� �� �ʱ�ȭ
		name = "��浿";
	}
	
	// getter / setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//---------------------------------------------------------------
	
	//2.������(constructor)
	
	/* - new �����ڸ� ���ؼ� ��ü�� ������ ��
	  	 ������ ��ü�� �ʵ� �� �ʱ�ȭ + ������ ����� �����ϴ� ����.
	  	 
	   - ������ �ۼ� ��Ģ
	     1) �������� �̸��� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	     2) ��ȯ���� �������� �ʴ´�.
	     3)
	     
	   - ������ ����
	     1) �⺻ ������
	     2) �Ű����� ������
	 
	 */
	
	//�⺻ ������
	//[����������] Ŭ������() { �ڵ� }
	
	public Student() {
		
		//��ü�� ������ �� ������ �ڵ�
		System.out.println("�⺻ �����ڿ� ���ؼ� Student ��ü�� �����Ǿ����ϴ�.");
		
		
		
	}
	
	//public void ex1() {}
	//		-> void�� ��ȯ�� (�����ڴ� ��ȯ��X)
	
	
	//3.�޼���(method)
	
	
	

}
