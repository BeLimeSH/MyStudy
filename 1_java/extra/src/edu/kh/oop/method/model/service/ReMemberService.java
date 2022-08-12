package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.ReMember;

public class ReMemberService {
	
	//필드
	private Scanner sc = new Scanner(System.in);
	
	private ReMember memberInfo = null;
	private ReMember loginMember = null;
	
	//기능(생성자, 메서드)
	
	public ReMemberService() {}
	
	
	//1명 회원가입 화면 만들기
	
	//메뉴 화면 출력
	public void displayMenu() {
		
		int menuNum = 0;
		
		do {
			System.out.println("===== 회원 정보 관리 프로그램 ve =====");
			
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 >> ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			
			case 1 : System.out.println( signUp() ); break;
			
			case 2 : System.out.println( login() ); break;
			
			case 3 : break;
			case 4 : break;
			
			case 0 : System.out.println("프로그램을 종료합니다..."); break;
			
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.\n");
			}
		} while(menuNum != 0 );
	}
	
	//회원 가입
	public String signUp() {
		
		System.out.println("\n***** 회원 가입 *****");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String checkPw = sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		
		if(memberPw.equals(checkPw)) {
			
			memberInfo = new ReMember(memberId, memberPw, memberName, memberAge);
			
			return "회원 가입 성공!!\n";
			
		} else {
			
			return "회원 가입 실패 (비밀번호가 일치하지 않습니다.)\n";
					
		}
	}
	
	//로그인
	public String login() {
		
		System.out.println("\n***** 로그인 *****");
		
		if(memberInfo == null) {
			
			return "회원 가입을 진행 해주세요.\n";
			
		}
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		if(memberId.equals(memberInfo.getMemberId()) 
				&& memberPw.equals(memberInfo.getMemberPw())) {
			
			loginMember = memberInfo;
			
			return loginMember.getMemberName() + "님 환영합니다.\n";
			
		} else {
			return "로그인 실패 (아이디 또는 비밀번호가 일치하지 않습니다.)\n";
		}
	}
}
