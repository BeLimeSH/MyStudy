package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {

	 public     static   void    main(String[] args) {
//[����������] [�����] ��ȯ�� �޼����([�Ű�����])	
		
		MemberService service = new MemberService();
		//MemberService�� �⺻ �����ڰ� �ۼ��Ǿ� ���� ������
		//�������� ��� ����
		
		//why? �����Ϸ��� �ڵ带 ������ ��
		//Ŭ���� ���ο� �����ڰ� �ϳ��� ���ٸ�
		//�ڵ����� �⺻ �����ڸ� �߰�����.
		
		//(����) �����ڰ� �ϳ��� ������ �ڵ� ������ �� ���ش�)
		//The constructor MemberService() is undefined
		
		
		service.displayMenu();
		
	}
}
