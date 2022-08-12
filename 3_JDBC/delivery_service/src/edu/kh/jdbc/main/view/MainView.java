package edu.kh.jdbc.main.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.jdbc.member.model.view.MemberView;
import edu.kh.jdbc.member.model.vo.Member;
import edu.kh.jdbc.order.model.view.OrderView;


public class MainView {
	
	private Scanner sc = new Scanner(System.in);
	
	private Member loginMember = null;
	private MemberView memberView = new MemberView();
	private OrderView orderView = new OrderView();

	public void displayMenu() {
		
		int menuNum = -1; //메뉴 선택 값 저장 변수

		do {

			try {
		
				if(loginMember == null) { //로그인이 되어있지 않은 경우
			
					System.out.println("\n***** 배달 주문 프로그램 *****\n");
			
					System.out.println("1. 로그인");
					System.out.println("2. 회원 가입");
					System.out.println("0. 프로그램 종료");
			
					System.out.print("메뉴를 선택해주세요 >> ");
					menuNum = sc.nextInt(); //InputMismatchException
					sc.nextLine(); //입력 버퍼 개행문자 제거
			
					System.out.println();
			
					switch(menuNum) {
					case 1 : loginMember = memberView.login(); break;
					case 2 : memberView.signUp(); break;
					case 0 : System.out.println("[프로그램 종료]"); break;
					default : System.out.println("메뉴에 작성된 번호를 입력해주세요.");
					
					}
			
					} else { //로그인이 되어있는 경우
						
						System.out.println("\n********** 회원 메뉴 **********\n");
			
						System.out.println("1. 배달 주문"); //식당 페이지 불러오기 >> Order View
						System.out.println("2. 내 정보 조회");
						System.out.println("3. 내 정보 수정");
						System.out.println("4. 비밀번호 변경");
						System.out.println("5. 회원 탈퇴");
						System.out.println("9. 로그아웃");
						
						System.out.print("메뉴를 선택해주세요 >> ");
						menuNum = sc.nextInt(); //InputMismatchException
						sc.nextLine(); //입력 버퍼 개행문자 제거
						System.out.println();
						
						switch(menuNum) {
						
						case 1 : orderView.orderMenu(loginMember); break;
						
						case 2 : memberView.myInfo(loginMember); break;
						case 3 : memberView.updateMyInfo(loginMember); break;
						case 4 : memberView.updatePw(loginMember); break;
						case 5 : 
							int result = memberView.secession(loginMember);
							if(result > 0) loginMember = null;
							break;
						
						case 9 : loginMember = null; break;
						default : System.out.println("메뉴에 작성된 번호를 입력해주세요.");
						
						}
					}
					
			} catch(InputMismatchException e) {
				System.out.println("\n입력 형식이 올바르지 않습니다. 다시 시도해주세요.");			
				sc.nextLine();		
			}
			
		} while(menuNum != 0);
	}
}
