package edu.kh.collection.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import edu.kh.collection.model.vo.Member;

public class SetService {
	
	//Set(����)
	//- ������ �������� ����(== �ε��� ����)
	//- �ߺ��� ������� �ʴ´�.(+ null�� �ߺ� X, 1���� ���� ����)
	
	// *** Set�� �ߺ��� Ȯ���ϴ� ��� ***
	// -> ��ü�� ������ �ִ� �ʵ尪�� ��� ������ �ߺ����� �Ǵ�
	// --> �� �� �ʵ� ���� ��� ������ ���ϱ� ���ؼ�
	//	   ��ü�� "equals()"�� �ݵ�� �������̵� �Ǿ� �־�� �Ѵ�.
	
	
	public void ex1() {
		
		Set<String> set = new HashSet<String>();
		
		//HashSet : Set�� ��ǥ���� �ڽ� Ŭ����
		//��� ���� 1 : ����Ǵ� ��ü�� "equals()"�� �������̵� �Ǿ� �־�� �Ѵ�.
		//��� ���� 2 : ����Ǵ� ��ü�� "hashCode()"�� �������̵� �Ǿ� �־�� �Ѵ�.
		
		// *����* : Hash��� �ܾ ���� �÷�����
		//			�ݵ�� ����Ǵ� ��ü�� equals(), hashCode()�� �������̵� �ؾ� ��.
		
		//set.add(String e)
		set.add("���̹�");
		set.add("īī��");
		set.add("����");
		set.add("����");
		set.add("����� ����");
		set.add("����� ����");
		set.add("����� ����");
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		//Ȯ���� �� : 1.���� /2.�ߺ� /3.null �ߺ�
		
		//size() : ����� �������� ���� ��ȯ
		System.out.println("����� �������� �� : " + set.size());
		
		//remove(String e) : Set�� ����� ��ü �� �Ű����� e��
		//					 �ʵ尪�� ���� ��ü�� ����	
		//					 +) Hash��� �ܾ ���Ե� Set�̸� hashCode()�� ���ƾ� ��
		
		System.out.println(set.remove("����"));
		System.out.println(set.remove("�߳���"));
		
		System.out.println(set); //���� Ȯ��
		
		
		//List.get()
		
		//Set�� ������ ��� ����� Ư�� ��ü �ϳ��� ���� �� �ִ� ����� ����.
		//-> ��� Set ��ü�� �����͸� �ϳ��� �ݺ������� ���� �� �ִ�.
		//	 (���ϴ� �� �ٷ� ���� ���� ������ �������� �ϳ��� �̾ƺ� ���� ����)
		
		//1. Iterator(�ݺ���)
		//- �÷��ǿ��� �����ϴ� �÷��� ��ü �ݺ� ������
		//	(�÷��ǿ� ����� ����ó�� ���Ƿ� �ϳ��� �ݺ������� ������ ����)
		
		
		Iterator<String> it = set.iterator();
		//Iterator�� ��� �� �������� Ÿ���� ��� String���� �˷���
		//set.iterator() : Set�� Iterator�� �ϳ��� ������ �� �ִ� ������� ��ȯ
		
		while(it.hasNext()) { //�ϳ��� ������ �� ���� ���� ���� ��� == ��
				  			  //-> ���� ���� ������ �ݺ��ؾ� �Ѵ�
							  //   == it.hasNext() : ���� ���� ������ true ��ȯ
							  //      it.next();   : ���� ��(��ü)�� ����
			
			String temp = it.next();
			
			System.out.println(temp);
		}
		
		
		System.out.println("-----------------------------------------");
		
		
		//2. ���� for�� ���
		//for(�ϳ��� ������ ������ ���� : )
		for(String temp : set) {
			System.out.println(temp);
		}
	}
	
	
	public void ex2() {
		
		//Object�� equals(), hashCode() �������̵�
		
		//A.equals(B) : A�� B�� ������ �ִ� �ʵ� ���� ��� ������ true, �ƴϸ� false
		
		//Hash �Լ� : �Էµ� �ܾ ������ ������ ���ڿ��� ��ȯ�ϴ� �Լ� (�ߺ� X)
		//ex) �Է� : 111 -> "asdfg" (5����)
		//	  �Է� : 1235467 -> "qwert" (5����)
		
		
		//hashCode() : �ʵ� ���� ������ �ߺ����� �ʴ� ���ڸ� ����� �޼���
		//-> ��? : ���� ������ �˻��� ���ؼ�(��ü�� ��� �ִ��� ���� ã�� ���ؼ�)
		
		//HashSet() : �ߺ� ���� ������ ����(Set)�ϰ� ������ �˻��� ����(Hash)
		
		
		Member mem1 = new Member("user01", "pass01", 30);
		Member mem2 = new Member("user01", "pass01", 30);
		Member mem3 = new Member("user02", "pass02", 30);
		
		//mem1�� mem2�� ������ ��
		System.out.println(mem1 == mem2);	//�ּ� ��
											//���� ���簡 �ƴ϶�� false
		
		//mem1�� mem2�� ������ �ִ� �ʵ� ���� ������ ��
		if(mem1.getId().equals( mem2.getId() )) { //���̵� ���� ���
			
			if(mem1.getPw().equals(mem2.getPw())) { //��й�ȣ�� ���� ���
				
				if(mem1.getAge()==mem2.getAge()) {
					System.out.println("���� ���� ������ �ִ� ��ü�Դϴ�.(true)");
				}
			}
		}
		
		//-> �Ź� �ۼ��ϱ� �����. �� �ڵ带 �ۼ��ؼ� ��Ȱ��
		//--> equals() �������̵�
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println(mem1.equals(mem2));	//mem1, mem2�� �ʵ�� ������?
		System.out.println(mem1.equals(mem3));	//mem1, mem3�� �ʵ�� ������?
		
		//���� �ٸ� ��ü���� �ʵ� ���� ���� == ����
		//���Ϸ��� ���� ���� ���� �ϳ��� ��ü�̴� == ����
	}
	
	
	public void ex3() {
		
		//equals()�� �������̵� �� Member�� Set�� ����
		//[Key Point] : �ߺ��� ���Ű� �Ǵ°�?
		
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(new Member("user01", "pass01", 30));
		memberSet.add(new Member("user02", "pass02", 40));
		memberSet.add(new Member("user03", "pass03", 20));
		memberSet.add(new Member("user04", "pass04", 25));
		memberSet.add(new Member("user04", "pass04", 25));
		
		for(Member mem : memberSet) {
			
			System.out.println(mem);
			
		}
		
		//hashCode() �������̵� ��
		//-> equals()�� �������̵� �Ǿ������� �ߺ� ���Ű� ���� ����
		// -> HashSet�� hashSet�� �������̵� �ؾ� �Ѵ�.
		
		Member mem1 = new Member("user01", "pass01", 30);
		Member mem2 = new Member("user01", "pass01", 30);
		Member mem3 = new Member("user01", "pass01", 31);
		
		System.out.println(mem1.hashCode());
		System.out.println(mem2.hashCode());
		System.out.println(mem3.hashCode());
	}
	
	
	public void ex4() {
		//Wrapper Ŭ���� : �⺻ �ڷ��� -> ��ü�� �����ϴ� Ŭ����
		
		//- �÷��ǿ� �⺻ �ڷ��� ���� ���� �� �� ���
		//- �⺻ �ڷ����� ���� �߰� ���, ���� �̿��ϰ� ���� �� ���
		
		//<Wrapper Ŭ���� ����>
		// int		-> Integer
		// double	-> Double
		// Boolean, Byte, Short, Long, Float, Character
		
		int iNum = 10;
		double dNum = 3.14;
		
		//�⺻ �ڷ��� -> ����
		Integer w1 = new Integer(iNum); //int�� Integer�� ����
		Double w2 = new Double(dNum); 	
		
		//Wrapper Ŭ���� Ȱ��
		System.out.println("int �ִ밪 : " + w1.MAX_VALUE);
		System.out.println("double �ּҰ� : " + w2.MIN_VALUE);
									//������ �۾� == static
									//static�� Ŭ������.�ʵ�� / Ŭ������.�޼ҵ��() ȣ�� ����
		
		System.out.println("w1 �� : " + w1);
		System.out.println("w2 �� : " + w2);
		
		
		System.out.println("===========================");
		System.out.println("static ������� Wrapper Ŭ���� ����ϱ�");
		
		System.out.println("int �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("double �ִ밪 : " + Double.MAX_VALUE);
		
		
		//***************************************************************
		//parsing : �������� ������ ��ȯ
		
		//String �����͸� �⺻ �ڷ������� ��ȯ
		int num1 = Integer.parseInt("100"); //���ڿ� "100"��  int �������� ��ȯ
		double num2 = Double.parseDouble("1.23456"); //���ڿ� "1.23456"�� double �������� ��ȯ
		
		System.out.println(num1 + num2);
		
		//***************************************************************
	}
	
	
	public void ex5() {
		
		//Wrapper Ŭ������ AutoBoxing / AutoUnBoxing
		
		Integer w1 = new Integer(100);
		// ������ == Deprecated == �ش� ������ ������ �����̴�
		//==> ����� �������� �ʴ´�
		
		Integer w2 = 100;
		Integer w3 = 200;
//		(Integer)  = (int -> Integer) �ڵ� ���� == AutoBoxing
		
		//w2�� 100�� ���� ������ �Ұ���������
		//Integer�� int�� ���� �����̶�� ���� Java�� �ν��ϰ� �־
		//���� ���� ��� int�� Integer�� �ڵ� ���� ���ش�.
		
		System.out.println("w2 + w3 = " + (w2 + w3));
		
		//w2 (Integer ��ü)
		//w3 (Integer ��ü)
		//w2 + w3 == ��ü + ��ü --> ������ �Ұ���
		
		//������ Integer�� int�� �������� ��� ���� Java�� �ν��ϰ� �־
		//+ ���� �� ������ �ڵ����� ���ܳ�
		
		//Integer + Integer -> int + int (�ڵ� ���� ���� == AutoUnBoxing)
		
		
	}
	
	
	public void lotto() {
		
		//�ζ� ��ȣ ������ Version.2
		
		//Set<int> lotto = new HashSet<int>();
		// int�� Ÿ�� ������ �� �� ����!
		// int�� �⺻ �ڷ����̱� ������ ��ü�� �����ϴ� �÷��ǿ��� �� �� ����
		
		//-> �ذ� ��� : Wrapper Class�� �̿��ؼ� �⺻ �ڷ����� ��ü�� �����Ѵ�.
		
		
		
		//Set<Integer> lotto = new HashSet<Integer>();
		// Integer�� equals(), hasgCode() �������̵� �Ϸ� ����
		
		//Set<Integer> lotto = new LinkedHashSet<Integer>();
		
		Set<Integer> lotto = new TreeSet<Integer>();
		//�ζ� ��ȣ �������� ����!

		
		while(lotto.size() < 6) {
			
			int random = (int)(Math.random() * 45 + 1);
			lotto.add(random);
			//int ���� �ڵ����� Integer�� ����(AutoBoxing) �Ǿ� lotto�� �߰�
			
		}
		
		System.out.println("�ζ� ��ȣ : " + lotto);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
