package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {
	
	private Scanner sc = new Scanner(System.in);
	
	//5 ũ���� Member ��ü �迭 ���� �� �Ҵ�
	private Member[] memberArr = new Member[5];
	
	//���� �α����� ȸ���� ������ ������ ���� ����
	private Member loginMember = null;
	
	
	public MemberService() { //�⺻ ������
		
		//memverArr �迭 0,1,2 �ε��� �ʱ�ȭ
		
		memberArr[0] = new Member("user01", "pass01", "ȫ�浿", 30, "����");
		memberArr[1] = new Member("user02", "pass02", "ȫ���", 25, "���");
		memberArr[2] = new Member("user03", "pass03", "��浿", 37, "����");
		
	}
	
	
	//�޴� ��¿� �޼���
	public void displayMenu() {
		
		int menuNum = 0;
		
		do { // �� ���� ������ �ݺ�
			
			System.out.println("\n===== ȸ�� ���� ���� ���α׷� v2 =====");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. �α���");
			System.out.println("3. ȸ�� ���� ��ȸ");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� �˻�(����)");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� �Է� >> ");
			menuNum = sc.nextInt(); // �ʵ忡 �ۼ��� Scanner sc ���
			sc.nextLine(); // �Է� ���ۿ� ���� ���� ���� ����
			
			switch(menuNum) {
			
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : System.out.println(selectMember()); break;
			case 4 : 
				int result = updateMember(); //ȸ�� ���� ���� �޼��� ���� ��
											 //��ȯ�Ǵ� ����� result ������ ����.
				if(result == -1) {
					System.out.println("�α��� �� �̿��� �ּ���\n");
				} else if(result == 0) {
					System.out.println("ȸ�� ���� ���� ����(��й�ȣ ����ġ)\n");
				} else {
					System.out.println("ȸ�� ������ �����Ǿ����ϴ�.\n");
				} break;
				
			case 5 :  break;
			
			case 0 : System.out.println("\n���α׷��� �����մϴ�..."); break;
			
			default : System.out.println("\n�߸� �Է� �ϼ̽��ϴ�.");
			}
		} while(menuNum != 0);
	}
	
	public String signUp() {
		
		System.out.println("\n========== ȸ�� ���� ==========");
		
		//��ü �迭(memberArr)�� ������ ȸ�� ������ ������ ����
		//-> ���ο� ȸ�� ������ ������ ������ �ִ��� Ȯ���ϰ�
		//	 �� ������ �ε��� ��ȣ�� ������ --> ���ο� �޼��� �ۼ�
		
		int index = emptyIndex(); //memberArr�迭���� ����ִ� �ε����� ��ȯ ����.
		
		System.out.println("���� ȸ�� �� : " + (index));
		
		if(index == -1) { //����ִ� �ε����� ���� ��� -> ȸ�� ���� �Ұ�
			return "ȸ�� ������ �Ұ����մϴ�. (�ο� �� �ʰ�)";
		}
		
		System.out.print("���̵� : ");
		String memberId = sc.next(); // user01
		
		System.out.print("��й�ȣ : ");
		String memberPw = sc.next();
		
		System.out.print("��й�ȣ Ȯ�� : ");
		String memberPw2 = sc.next();
		
		System.out.print("�̸� : ");
		String memberName = sc.next();
		
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		
		System.out.print("���� : ");
		String region = sc.next();
		
		//��й�ȣ, ��й�ȣ Ȯ�� ��ġ �� ȸ������
		if(memberPw.equals(memberPw2)) {
			
			//Member ��ü�� �����ؼ� �Ҵ�� �ּҸ� memberArr ����ִ� �ε����� ����
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
			
			return "ȸ�� ���� ����!!";
			
		} else {
			return "ȸ�� ���� ���� (��й�ȣ ����ġ)";
		}	
	}
	
	//memberArr�� ����ִ� �ε��� ��ȣ ��ȯ�ϴ� �޼���
	//��, ����ִ� �ε����� ������ -1 ��ȯ
	
	public int emptyIndex() {
		
		//memberArr �迭�� 0�� �ε������� ������ �����ؼ� 
		//�����ϴ� ���� null�� ����� �ε����� ��ȯ
		
		for(int i=0; i<memberArr.length; i++) {
			
			if(memberArr[i] == null) {
				return i; //���� �޼��带 �����ϰ� ȣ���� ������ i���� ������ ���ư�
			}
		}
		//for���� ���� ������ return�� ���� ���� ��� �ش� ��ġ �ڵ尡 ����.
		// --> ����ִ� �ε����� ���� == -1 ��ȯ
		return -1;
	}
	
	
	//�α��� �޼���
	public String login() {
		
		System.out.println("========== �α��� ==========");
		
		System.out.print("���̵� �Է� : ");
		String memberId = sc.next();
		
		System.out.print("��й�ȣ �Է� : ");
		String memberPw = sc.next();
		
		// 1) memberArr �迭 �� ��Ҹ� ������� �����Ͽ� null�� �ƴ��� Ȯ��
		
		for(int i=0; i<memberArr.length ; i++) {
			
			if(memberArr[i] != null) { //ȸ���� ������ ���� ���
				
				// 2) ȸ�� ����(member[i])�� ���̵�, ��й�ȣ��
				//	  �Է� ���� ���̵�(memberId), ��й�ȣ(memberPw)�� ������ Ȯ��
				if(memberArr[i].getMemberId().equals(memberId)
					&& memberArr[i].getMemberPw().equals(memberPw)) {
					
					// 3) �α��� ȸ�� ���� ��ü(Member)�� �����ϴ� ���� loginMember��
					//	  ���� ���� ���� memberArr[i] ��ҿ� ����� �ּҸ� ���� ����
					
					loginMember = memberArr[i];
					
					break; //�� �̻� ���� ���̵�, ��й�ȣ�� ���� ������ for�� ����
				}
			}
		} //for�� ��
		
		//4) �α��� ����/���� ���ο� ���� ��� ���� ��ȯ
		if(loginMember == null) { //�α��� ����
			return "���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.";
		} else { //�α��� ����
			return loginMember.getMemberName() + "�� ȯ���մϴ�.";
		}
	}
	
	
	//ȸ�� ���� ��ȸ �޼���

	public String selectMember() {
	      
	System.out.println("\n========== ȸ�� ���� ��ȸ ==========");
	      
	// 1) �α��� ���� Ȯ�� -> �ʵ� loginMember�� �����ϴ� ��ü�� �ִ��� Ȯ��
	if(loginMember == null) { 
		return "�α��� �� �̿� ���ּ���.";
	}
	      
	 // 2) �α����� �Ǿ��ִ� ���
	 //    ȸ�� ������ ����� ���ڿ��� ���� ��ȯ(return)
	 //    (��, ��й�ȣ�� ����)
	 String str = "�̸� : " + loginMember.getMemberName();

	 str += "\n���̵� : " + loginMember.getMemberId();
	      
	 str += "\n���� : " + loginMember.getMemberAge() + "��";
	 
	 str += "\n���� : " + loginMember.getRegion();

	 return str;
	}
	
	
	//ȸ�� ���� ����(update) �޼���
	public int updateMember() {
		
		System.out.println("\n========== ȸ������ ���� ==========");
		
		//1) �α��� ���� �Ǻ�
		//	 �α����� �Ǿ����� ������ -1 ��ȯ
		
		if(loginMember == null) {
			return -1;
		}
		
		//2) ������ ȸ�� ���� �Է� �ޱ�(�̸�, ����, ����)
		System.out.print("������ �̸� �Է� : ");
		String inputName = sc.next();
		
		System.out.print("������ ���� �Է� : ");
		int inputAge = sc.nextInt();
		
		System.out.print("������ ���� �Է� : ");
		String inputRegion = sc.next();
		
		//3) ��й�ȣ�� �Է� �޾Ƽ� �α����� ȸ���� ��й�ȣ�� ��ġ�ϴ��� Ȯ��
		System.out.print("��й�ȣ �Է� : ");
		String inputPw = sc.next();
		
		if(inputPw.equals(loginMember.getMemberPw())) {
			//4) ��� ��ȣ�� ���� ���
			//	�α����� ȸ���� �̸�, ���� ������ �Է� ���� ������ ����
			//  1 ��ȯ
			
			loginMember.setMemberName(inputName);
			//�Է¹��� inputName�� loginMember�� �����ϴ� Member ��ü�� �ʵ� memberName�� ����
			
			loginMember.setMemberAge(inputAge);
			
			loginMember.setRegion(inputRegion);
			
			return 1;
			
		} else {
			//5) ��� ��ȣ�� �ٸ� ���
			return 0;
		}	
	}
	
	
	//ȸ�� �˻�(����) �޼���
	public void searchRegion() {
		
		System.out.println("\n========== ȸ�� �˻�(����) ==========");
		
		System.out.print("�˻��� ������ �Է��ϼ��� : ");
		String input = sc.next();
		
		boolean flag = true; //�˻� ��� ��ȣ�� ����
		
		//1) memberArr �迭�� ��� ��� ���� ����
		for(int i=0; i<memberArr.length; i++) {
			
			//2) memberArr[i]��Ұ� null�� ��� �ݺ� ����
			if(memberArr[i] == null) {
				break;
			}
			
			//3) memberArr[i] ��ҿ� ����� ����(getRegion())��
			//	 �Է¹��� ����(inputRegion)�� ���� ���(equals()), ȸ���� ���̵�, �̸��� ���
			if(memberArr[i].getRegion().equals(input)) {
				
				System.out.printf("���̵� : %s, �̸� : %s\n",
								memberArr[i].getMemberId(), memberArr[i].getMemberName());
				
				flag = false;
			}
		}
		
		//4) �˻� ����� ���� ��� "��ġ�ϴ� �˻� ����� �����ϴ�" ���
		if(flag)  {
			System.out.println("��ġ�ϴ� �˻� ����� �����ϴ�.");
		}
	}
	
}
