package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.ReMember;

public class ReMemberService {
	
	//�ʵ�
	private Scanner sc = new Scanner(System.in);
	
	private ReMember memberInfo = null;
	private ReMember loginMember = null;
	
	//���(������, �޼���)
	
	public ReMemberService() {}
	
	
	//1�� ȸ������ ȭ�� �����
	
	//�޴� ȭ�� ���
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("===== ȸ�� ���� ���� ���α׷� ve =====");
			
			System.out.println("1. ȸ�� ����");
			System.out.println("2. �α���");
			System.out.println("3. ȸ�� ���� ��ȸ");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� �Է� >> ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 : System.out.println( signUp() ); break;
			
			case 2 : System.out.println( login() ); break;
			
			case 3 : break;
			case 4 : break;
			
			case 0 : System.out.println("���α׷��� �����մϴ�..."); break;
			
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.\n");
			}
		} while(menuNum != 0 );
	}
	
	//ȸ�� ����
	public String signUp() {
		
		System.out.println("\n***** ȸ�� ���� *****");
		
		System.out.print("���̵� : ");
		String memberId = sc.next();
		
		System.out.print("��й�ȣ : ");
		String memberPw = sc.next();
		
		System.out.print("��й�ȣ Ȯ�� : ");
		String checkPw = sc.next();
		
		System.out.print("�̸� : ");
		String memberName = sc.next();
		
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		
		
		if(memberPw.equals(checkPw)) {
			
			memberInfo = new ReMember(memberId, memberPw, memberName, memberAge);
			
			return "ȸ�� ���� ����!!\n";
			
		} else {
			
			return "ȸ�� ���� ���� (��й�ȣ�� ��ġ���� �ʽ��ϴ�.)\n";
					
		}
	}
	
	//�α���
	public String login() {
		
		System.out.println("\n***** �α��� *****");
		
		if(memberInfo == null) {
			
			return "ȸ�� ������ ���� ���ּ���.\n";
			
		}
		
		System.out.print("���̵� : ");
		String memberId = sc.next();
		
		System.out.print("��й�ȣ : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) 
				&& memberPw.equals(memberInfo.getMemberPw())) {
			
			loginMember = memberInfo;
			
			return loginMember.getMemberName() + "�� ȯ���մϴ�.\n";
			
		} else {
			return "�α��� ���� (���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.)\n";
		}
	}
}
