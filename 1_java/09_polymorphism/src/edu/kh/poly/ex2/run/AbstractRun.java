package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.AbstractService;
import edu.kh.poly.ex2.model.service.BDHCalculator;
import edu.kh.poly.ex2.model.service.KSHCalculator;
import edu.kh.poly.ex2.model.service.LCSCalculator;
import edu.kh.poly.ex2.model.service.Calculator;

public class AbstractRun {

	public static void main(String[] args) {
		
		AbstractService service = new AbstractService();
		
//		service.ex1();
//		service.ex2();
		
		// Calculator ����Ʈ
		// import edu.kh.poly.ex2.model.service.Calculator;
				
		// ���� ���� xxxCalculator ����Ʈ
		// import edu.kh.poly.ex2.model.service.BDHCalculator;
		
		//Calculator cal = new KSHCalculator();
		//Calculator cal = new LCSCalculator();
		Calculator cal = new BDHCalculator();
		
		
		//�������̽� == �̿ϼ� ���赵 == ��ü ���� �Ұ���
		//-> �߻�Ŭ����ó�� ���� �����δ� ��� ����
		
		System.out.println("�� : " + cal.plus(20, 15));
		System.out.println("�� : " + cal.minus(20, 15));
		System.out.println("�� : " + cal.multiple(20, 15));
		System.out.println("�� : " + cal.divide(20, 15));
		
		
		//�������̽��� Ư¡
		//1) �������̽��� �θ� ���� ������ ����ϸ� ������ ��ĳ������ ����Ǽ�
		//	��ӹ��� ��� Ŭ������ �ڽ� ��ü�� ������ �� �ִ�.
		
		//	-> �̸� �̿��Ͽ� �߿��� ���� �ڵ��� ������ �ּ�ȭ �� �� �ִ�.
		//	ex) Run�� �ۼ��� ��, ��, ��, ���� ����ϴ� �ڵ��� ��������
		//		��ü ���� �ڵ� �� �ٸ� �����Ͽ� �ٸ��� �ۼ��� ����� ������ �� �ִ�.
		
		//2) �ڽ� Ŭ������ ����� �ްŵ� ������ �����ϱ� ������
		//	 ��� �ڽ� Ŭ������ ������ ���¸� ��� �ȴ�.
		//	 -> �̸� �̿��Ͽ� ���� �۾�(�� ������Ʈ)�� �ʿ��� ���� ȯ���� ������ �� �ִ�.
		
	}

	
	
	
	
	
	
	
	
	
}
