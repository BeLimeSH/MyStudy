package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentService {
	
	//�ʵ�
	private Scanner sc = new Scanner(System.in);	
	
	//�л� ������ ������ List�� ����(== Collection : ��ü �迭 Upgrade ����)
	
	//java.util.List �������̽� : List�� �ݵ�� �ʿ��� �ʼ� ����� ��Ƶ� �������̽�
	// * �������̽��� ��ü ���� X, �θ� ���� ���� O
	
	//java.util.ArrayList : �迭 ���� List (���� ��ǥ���� List �ڽ� Ŭ����)
	
	//ArrayList() �⺻ ������ : �⺻ ũ�� 10¥�� ����Ʈ ����
	//							-> ������ ����Ʈ�� ũ�Ⱑ �þ��� �پ��� �ϱ� ������ ū �ǹ� ����
	
	//ArrayList(�뷮) : �뷮 ��ŭ�� ����Ʈ ����
	//					-> �ʹ� ū ���� �ۼ��ϸ� �޸𸮸� ���� �Ҹ���.
	
	
	private List<Student> studentList = new ArrayList<Student>(); //�˻�(��ȸ)�� ȿ����
	//private List<Student> studentList = new LinkedList<Student>(); //�߰�, ����, ������ ȿ����
	
	
	
	//Student�� ����Ǵ� Ÿ���� ���ѵ� ����Ʈ ����
	//== Student�� ���� ���� == ���� Studnet�̹Ƿ� �˻��� �ʿ䰡 ����.
	
	
	public StudentService() {
		
		studentList.add(new Student("ȫ�浿", 25, "����� �߱�", 'M', 90));
		studentList.add(new Student("����", 23, "��⵵ �Ȼ��", 'F', 100));
		studentList.add(new Student("�����", 30, "����� ������", 'M', 80));
		studentList.add(new Student("���̳�", 27, "��� û�ֽ�", 'F', 90));
		studentList.add(new Student("������", 24, "���� ���빮��", 'F', 70));
		
	}
	
	
	public void ex() {
		//List ��� �׽�Ʈ
		
		//List.add(Object e) : ����Ʈ�� ��ü�� �߰�
		// * �Ű����� Ÿ���� Object == ��� ��ü �Ű������� ������ �� ����.
		//   (�Ű����� Object == �ֻ��� �θ� ���� ���� == ������ ���� ����)
		
		studentList.add(new Student());	//0�� �ε���
//		studentList.add(sc);			//1��
//		studentList.add("���ڿ�");		//2��
//		studentList.add(new Object());	//3��
		//-> �÷��� Ư¡ : ���� Ÿ���� �����͸� ������ �� �ִ�
		
		
		//Object List.get(index i) : ����Ʈ���� i��° �ε����� �ִ� ��ü(Object)�� ��ȯ
		//��ȯ���� Object == ��� ��ü�� ��ȯ�� �� �ִ�.
		
		System.out.println( studentList.get(0).toString() );
		// ���� �� : String java.lang.Object.toString() == ���� ���ε�
		// ���� �� : 0��°�� Student ��ü�̰�, toString() �������̵�
		//			-> Student�� toString()�� ����� == ���� ���ε�
		
		//[Student�� �̸��� ������]

		//Student ��ü�� �´��� Ȯ���ϰ� �ٿ� ĳ������ �ؾ� 
		//Student ��� ����� �� �ִ�.
		if( studentList.get(0) instanceof Student ) {
			System.out.println( ((Student)studentList.get(0)).getName() );
			
		}
		//-> ��� ������
		//-> �÷����� ������ ���� ��ü ������ �ڵ��� ���ص�
		
		
		//********************* ���׸���(Generics) ************************
		//(���� ���׸��̶�� ��) : <>
		
		//[���� �߿��� ����]
		//-> �÷��ǿ� ����Ǵ� ��ü Ÿ���� �� ������ ����
		
		System.out.println( studentList.get(0).getName() );
	}
	
	//�޼��� ����� �ּ�
	
	/**
	 �޴� ��¿� �޼��� 
	 @author ����
	 */
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			
			System.out.println("\n========== �л� ���� ���α׷� ==========\n");
			System.out.println("1. �л� ���� �߰�");
			System.out.println("2. �л� ��ü ��ȸ");
			System.out.println("3. �л� ���� ����");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. �̸����� �˻�(��ġ)");
			System.out.println("6. �̸����� �˻�(����)");
			
			System.out.println("0. ���α׷� ����");
			
			System.out.print("\n�޴� ��ȣ ���� >> ");
			
			try {
				menuNum = sc.nextInt();
				System.out.println();
				
				switch(menuNum) {
				
				case 1 : System.out.println( addStudent() ); break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(updateStudent()); break;
				case 4 : System.out.println(removeStudent()); break;
				case 5 : searchName1(); break;
				case 6 : searchName2(); break;
				
				case 0 : System.out.println("<���α׷� ����>"); break;
				default : System.out.println("�޴��� �ۼ��� ��ȣ�� �Է����ּ���.");
				}
			} catch(InputMismatchException e) {
				System.out.println("\nerror : �Է� ������ ��ȿ���� �ʽ��ϴ�. �ٽ� �õ��� �ּ���.");
				
				sc.nextLine(); //�Է� ���ۿ� �����ִ� �߸� �Էµ� ���ڿ� ����
				
				menuNum = -1; //ù �ݺ� �� �߸� �Է��ϴ� ���, 
							  //menuNum�� 0�� ������ �־� ����Ǵ� ���� ���� �ϱ� ���� ���ǰ� -1 ����
			}
		} while(menuNum != 0);
	}

	/**
	 * 1. �л����� �߰� �޼���
	 * - �߰� ���� �� "����", ���� �� "����" ���ڿ� ��ȯ 
	 */
	public String addStudent() throws InputMismatchException {
		
		System.out.println("===== �л� ���� �߰� =====");
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine(); //�Է� ���� ���� ���� ����
		
		System.out.print("��� �� : ");
		String region = sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("���� : ");
		int score = sc.nextInt();		//InputMismatchException
		
		//Student ��ü ���� �� List�� �߰�
		if(studentList.add(new Student(name, age, region, gender, score))) {
			//boolean java.util.List.add(Student e)
			//(��ȯ��)					-> ���׸� <Student> ������ List Ÿ���� Student�� ���� ��.
			
			//add()�� ������ true ��ȯ�ϱ� ������ �����ϴ� ���� ����
			//��� ���ܰ� �߻��ؼ� add() ���� �� �޼��尡 ����� �� ����.
			
			return "����";
		
		} else {
			return "����";
			
		}	
	}
	
	/** 2.�л� ��ü ��ȸ �޼��� */
	public void selectAll() {
		
		// - List�� �ε����� �ִ�. (0�� ���� ����)
		// - List�� ����� �������� ������ ������ ��� : int List.size()
		//	 -> �迭��.length ��� ���
		// - List�� ����ִ��� Ȯ���ϴ� ���
		//	 : boolean List.isEmpty() == true
		
		System.out.println("===== �л� ��ü ��ȸ =====");
		
		//studentList�� ����ִ� ��� "�л� ������ �����ϴ�." ���
		
		if(studentList.isEmpty()) {
			System.out.println("�л� ������ �����ϴ�.");
		
			return;
		}
		/* �Ϲ� for��
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		*/
		
		//���� for�� (for each��)
		//- �÷���, �迭�� ��� ��Ҹ� ���������� �ݺ� ������ �� �ִ� for��
		//  (������ : 0�� �ε������� ������ ��ұ��� �ε����� 1�� ����)
		
		//[�ۼ���]
		//for( �÷��� �Ǵ� �迭���� ���� �� ���� ��Ҹ� ������ ���� : �÷��Ǹ� �Ǵ� �迭�� ) {}
		
		int index = 0;
		
		for( Student std : studentList ) {
			//std�� for�� �ݺ� �� ���� 0, 1, 2, ... �ε��� ��ҵ� �� ���� �����
			
			System.out.print((index++) + "�� : ");
			System.out.println(std);
		}
	}
	
	/**
	 * �л� ���� ���� �޼���
	 */
	public String updateStudent() throws InputMismatchException {
		
		// - Student List.set(int index, Student e)
		//   -> List�� i��° ��Ҹ� ���� ���� e�� ����
		//	 -> ��ȯ�� Student == ���� �� Student ��ü�� �������.
		
		System.out.println("===== �л� ���� ���� =====");
		System.out.print("�ε��� ��ȣ �Է� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		//1) �л� ������ studentList�� �ִ°�?
		if(studentList.isEmpty()) {
			return "\n�Էµ� �л� ������ �����ϴ�.";
			
			//2) �Էµ� ���ڰ� 0���� ������? (���� �˻�)
		} else if(index < 0) {
			
			return "������ �Է��� �� �����ϴ�.";
			
			//3) ���� ���ڿ��� �Է��� ��� -> throws�� ����ó��
			
			//4) �Է� ���� ���ڰ� studentList ���� �� �ε��� ��ȣ�ΰ�?
		} else if(index >= studentList.size()) {
			
			return "������ �Ѿ ���� �Է��� �� �����ϴ�.";
			
		} else {
			
			//���� �ڵ� �ۼ�
			System.out.println(index + "�� ����� �л� ����");
			System.out.println(studentList.get(index));
			
			System.out.print("�̸� : ");
			String name = sc.next();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			sc.nextLine(); //�Է� ���� ���� ���� ����
			
			System.out.print("��� �� : ");
			String region = sc.nextLine();
			
			System.out.print("����(M/F) : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("���� : ");
			int score = sc.nextInt();
				
			//�Է� ���� index��°�� ���ο� �л� ������ ���� == ����
			//�̶�, index��°�� �ִ� ���� �л� ������ ��ȯ�ȴ�.			
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));
			
			return temp.getName() + "�� ������ ����Ǿ����ϴ�.";
		}
	}
	
	/**
	 * �л� ���� ���� */
	public String removeStudent() throws InputMismatchException {
		
		// - Student   List.remove(int index)
		//	 ����Ʈ���� index��° ��Ҹ� ����
		//	 �� ��, ���ŵ� ��Ұ� ��ȯ�ȴ�.
		//	 * List�� �߰��� ����ִ� �ε����� ���� �ϱ� ���ؼ�
		//	   remove() ���� �� ���� ��Ҹ� �� ĭ�� ��ܿ´�.
		
		System.out.println("===== �л� ���� ���� =====");
		System.out.print("�ε��� ��ȣ �Է� : ");
		int index = sc.nextInt();
		sc.nextLine();
		
		//1) �л� ������ studentList�� �ִ°�?
		if(studentList.isEmpty()) {
			return "\n�Էµ� �л� ������ �����ϴ�.";
			
			//2) �Էµ� ���ڰ� 0���� ������? (���� �˻�)
		} else if(index < 0) {
			
			return "������ �Է��� �� �����ϴ�.";
			
			//3) ���� ���ڿ��� �Է��� ��� -> throws�� ����ó��
			
			//4) �Է� ���� ���ڰ� studentList ���� �� �ε��� ��ȣ�ΰ�?
		} else if(index >= studentList.size()) {
			return "������ �Ѿ ���� �Է��� �� �����ϴ�.";

		} else {
			//�л� ���� ����
			System.out.print("���� ���� �Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
					//String -> �빮�� String -> �빮�� 0�� �ε��� ����
					//Stirng.toUpperCase() : ���ڿ��� �빮�ڷ� ����
			
					//String.toUpperCase()  : ���ڿ��� �빮�ڷ� ����
			
			if(ch == 'Y') {
				Student temp = studentList.remove(index);
				return temp.getName() + "�� ������ �����Ǿ����ϴ�.";
				
			} else {
				return "���";
				
			}
		}
	}
	
	/**
	 * �̸��� ��ġ�ϴ� �л��� ã�Ƽ� ��ȸ�ϴ� �޼���
	 */
	public void searchName1() {
		
		System.out.println("===== �л� �˻�(�̸� ��ġ) =====");
		
		System.out.print("�˻��� �̸� �Է� : ");
		String input = sc.next();
		
		boolean flag = true;
		
		//���� for��
		for( Student std : studentList ) {
			
			if(input.equals(std.getName())) { //�̸��� ��ġ�ϴ� ���
				System.out.println(std);
				flag = false;
			}
		}
		
		if(flag) { //flag�� true�� ��� == for�� ���� �ִ� if�� ����� �� ����/
				   // == �˻� ��� ����
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}
	
	/**
	 * �̸��� Ư�� ���ڿ��� ���ԵǴ� �л��� ã�Ƽ� ��ȸ�ϴ� �޼���
	 */
	public void searchName2() {
		
		System.out.println("===== �л� �˻�(���ڿ� ����) =====");
		
		System.out.print("�̸��� ���ԵǴ� ���ڿ� �Է� : ");
		String input = sc.next();
		
		boolean flag = true;
		
		//���� for��
		for( Student std : studentList ) {
			
			//contains : ����
			//boolean String.cotains(���ڿ�) : String�� ���ڿ��� ���ԵǾ� ������ true
			
			if( std.getName().contains(input) ) {
				System.out.println(std);
				flag = false;
			}
		}
		
		if(flag) { //flag�� true�� ��� == for�� ���� �ִ� if�� ����� �� ����/
				   // == �˻� ��� ����
			
			System.out.println("�˻� ����� �����ϴ�.");
		}
	}
}
