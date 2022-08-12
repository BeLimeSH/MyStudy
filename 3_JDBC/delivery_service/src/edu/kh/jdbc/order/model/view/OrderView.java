package edu.kh.jdbc.order.model.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.jdbc.member.model.vo.Member;
import edu.kh.jdbc.restaurant.model.view.RestaurantView;

public class OrderView {

	private Scanner sc = new Scanner(System.in);
	private RestaurantView restaurant = new RestaurantView();
	
	/** 주문 화면 출력 메서드
	 * @param loginMember
	 */
	public void orderMenu(Member loginMember) {
		
		int menuNum = -1;
		
		do {
			try {
				System.out.println("\n********** 배달 주문 메뉴 **********\n");
				
				System.out.println("1. 주문하기");
				System.out.println("2. 주문 내역 조회");
				System.out.println("3. 주문 수령 내역 조회");
				
				System.out.println("0. 회원 메뉴로 돌아가기");
				
				System.out.print("메뉴를 선택해주세요 >> ");
				menuNum = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				switch(menuNum) {
				case 1 : restaurant.restaurantMenu(loginMember); break;
				case 2 : restaurant.selectOrder(loginMember); break;
				case 3 : restaurant.selectCompleteOrder(loginMember); break;
				
				case 0 : System.out.println("회원 메뉴로 돌아갑니다..."); break;
				
				default : System.out.println("메뉴에 작성된 번호를 입력해주세요.");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\n입력 형식이 올바르지 않습니다. 다시 시도 해주세요.");
				sc.nextLine(); // 입력 버퍼에 남은 잘못된 문자열 제거
			}
		} while(menuNum != 0);
	}
	

}
