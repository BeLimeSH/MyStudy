package edu.kh.jdbc.restaurant.model.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.member.model.vo.Member;
import edu.kh.jdbc.order.model.vo.Order;
import edu.kh.jdbc.restaurant.model.service.RestaurantService;
import edu.kh.jdbc.restaurant.model.vo.Restaurant;

public class RestaurantView {

	private Scanner sc = new Scanner(System.in);
	private RestaurantService service = new RestaurantService();
	
	/** 식당 선택 메서드
	 * @return result
	 */
	private int chooseRestaurant() {
		
		int restaurantNo = 0;
		
		while(true) {
			
			try {
				System.out.println("===== 식당 선택 =====\n");
				
				System.out.println("1. 안녕치킨  |  치킨");
				System.out.println("2. 매운짬뽕  |  중식");
				System.out.println("3. 동글초밥  |  일식");
				System.out.println("4. 울희분식  |  한식");
				
				System.out.println("\n0. 이전 화면으로");
				
				System.out.print("\n식당을 선택해주세요 >> ");
				restaurantNo = sc.nextInt();
				sc.nextLine();
				System.out.println();
				
				if(restaurantNo >= 0 && restaurantNo <= 4) {
					break;
				} else {
					System.out.println("메뉴에 작성된 번호를 입력해주세요.\n");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("\n입력 형식이 올바르지 않습니다. 다시 시도 해주세요.");
				sc.nextLine();
			}			
		}
		return restaurantNo;
	}
	
	/** 주문하기 메서드
	 * @param loginMember
	 */
	public void restaurantMenu(Member loginMember) {
		
		int result = 0;
		int chooseMenu = 0;
		int numberOfMenu = 0;
		
		int restaurantNo = chooseRestaurant();
			
		if(restaurantNo != 0) {
			
			try {			
				//SELET로 모든 메뉴, 가격 출력
				List<Restaurant> restaurantList = service.selectAll(restaurantNo);
				//restaurantNo = 식당 번호로 각 식당 SQL 구분
				
				if(restaurantList.isEmpty()) {
					System.out.println("\n[조회 결과가 없습니다.]\n");
				} else {
					
					System.out.println("----------------------------------------");
					for(Restaurant r : restaurantList) {
						
						System.out.printf(" [%d] %-13s|%-10s\n",
								r.getMenuNo(), r.getMenuName(), r.getToCharPrice());
					}
					System.out.println("----------------------------------------");
				}
				
				//-------------------------------------------------------------
				
				//Scanner로 메뉴 번호, 주문 수량 입력 받기
				System.out.print("\n메뉴 번호를 입력해주세요 : ");
				chooseMenu = sc.nextInt();
				sc.nextLine();
				
				System.out.print("주문 수량을 입력해주세요 : ");
				numberOfMenu = sc.nextInt();
				sc.nextLine();
				
				System.out.printf("\n%d번 메뉴를 %d개 선택하셨습니다.\n", chooseMenu, numberOfMenu);

				char ch = ' ';
				
				while(true) {
					System.out.print("주문하시겠습니까?(Y/N) : ");
					ch = sc.next().toUpperCase().charAt(0);
					
					if(ch == 'Y' || ch == 'N') { // Y 또는 N인 경우 추가 입력 X (반복 종료)
						break;
					}else {
						System.out.println("Y 또는 N을 입력해주세요.\n");
					}
				}
				
				if (ch == 'Y') {
					//INSERT로 입력 받은 메뉴 번호에 해당하는 메뉴 번호(chooseMenu), 주문 수량
					//식당 번호(restaurantNo), 주문자 번호를 ORDER_OF_FOOD 테이블에 삽입
					result = service.insertOrder(restaurantNo, chooseMenu, numberOfMenu, loginMember);
					
					if(result > 0)	System.out.println("\n[주문이 완료되었습니다.]\n");
					else			System.out.println("\n[주문을 실패하였습니다.]\n");
					
				} else {
					System.out.println("\n[주문이 취소되었습니다.]\n");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("\n입력 형식이 올바르지 않습니다. 다시 시도 해주세요.\n");
			
			} catch(Exception e) {
				System.out.println("\n<메뉴 주문 중 예외 발생>\n");
				e.printStackTrace();
			}
			
		} else {
			System.out.println("이전 화면으로 돌아갑니다...");
		}
	}

	/** 주문 내역 조회
	 * @param loginMember
	 */
	public void selectOrder(Member loginMember) {
		
		System.out.println("\n[주문 내역 조회]\n");
		
		int sum = 0;
		
		try {
			System.out.println("================================================================================");
			
			for(int i=1; i<5; i++) { 
				List<Order> orderList = service.selectOrder(loginMember, i);
				
				switch(i) {
				case 1 : System.out.println("* 안녕치킨 *"); break;
				case 2 : System.out.println("* 매운짬뽕 *"); break;
				case 3 : System.out.println("* 동글초밥 *"); break;
				case 4 : System.out.println("* 울희분식 *"); break;
				}
				
				System.out.println("--------------------------------------------------------------------------------");
				System.out.println(" 번호       메뉴명        개수        단가              가격          주문 시간");
				System.out.println("--------------------------------------------------------------------------------");
				
				for(Order o : orderList) {
					System.out.printf(" [%2d] | %-10s | %2d | %s | %s | %s\n",
							o.getOrderNo(), o.getMenuName(), o.getNumberOfMenu(), o.getToCharPrice(), 
							o.getPn(), o.getToCharTime());
					
					sum += o.getPrice();
					}
				
				System.out.println("\n================================================================================");
			}
			
			System.out.println("[합계] : " + sum + "원");
			System.out.println();
			
			//------------------------------------------------------------------------
			// 상세 조회용 메뉴
			
			System.out.println("***** 상세 메뉴 *****");
			
			System.out.println("1. 주문 취소");
			System.out.println("2. 주문 수령 확인");
			System.out.println("0. 이전 화면으로");
			
			System.out.print("\n메뉴 선택 >> ");
			int insertNum = sc.nextInt();
			sc.nextLine();
			
			switch(insertNum) {
			
			case 1 : cancelOrder(loginMember); break;
			case 2 : checkOrder(loginMember); break;
			
			case 0 : System.out.println("이전 화면으로 돌아갑니다..."); break;
			
			default : System.out.println("메뉴에 표시된 번호만 입력해주세요.");
			
			}
			
			
		} catch(Exception e) {
			System.out.println("\n<주문 내역 조회 중 예외 발생>\n");
			e.printStackTrace();
		}
		
	}

	
	
	
	/** 주문 수령 확인 메서드
	 * @param loginMember
	 */
	private void checkOrder(Member loginMember) {
		
		System.out.println("\n[주문 수령 확인]\n");
		
		System.out.print("주문 번호를 입력하세요 : ");
		int checkNum = sc.nextInt();
		sc.nextLine();
		
		char ch = ' ';
		
		while(true) {
			System.out.print("음식을 수령하셨나요?(Y/N) : ");
			ch = sc.next().toUpperCase().charAt(0);

			if(ch == 'Y' || ch == 'N') { // Y 또는 N인 경우 추가 입력 X
				break;
			}else {
				System.out.println("Y 또는 N을 입력해주세요.\n");
			}
		}
		
		if(ch == 'Y') {
			
			try {
				int result = service.checkOrder(loginMember.getMemberNo(), checkNum);
				
				if(result > 0)	System.out.println("\n[확인이 완료 되었습니다.]\n");
				else			System.out.println("\n해당하는 주문 번호가 없습니다.\n");
				
			} catch (Exception e) {
				System.out.println("\n<주문 수령 확인 중 예외 발생>\n");
				e.printStackTrace();
			}
			
		} else {
			System.out.println("이전 화면으로 돌아갑니다...");
		}
	}

	/** 주문 취소 메서드
	 * @param loginMember
	 */
	private void cancelOrder(Member loginMember) {
		
		System.out.println("\n[주문 취소]\n");
		
		System.out.print("주문 번호를 입력하세요 : ");
		int cancleNum = sc.nextInt();
		sc.nextLine();
		
		char ch = ' ';
		
		while(true) {
			System.out.print("주문을 취소 하시겠습니까?(Y/N) : ");
			ch = sc.next().toUpperCase().charAt(0);

			if(ch == 'Y' || ch == 'N') { // Y 또는 N인 경우 추가 입력 X
				break;
			}else {
				System.out.println("Y 또는 N을 입력해주세요.\n");
			}
		}
		
		if(ch == 'Y') {
			
			try {
				int result = service.deleteOrder(loginMember.getMemberNo(), cancleNum);
				
				if(result > 0)	System.out.println("\n[주문이 취소 되었습니다.]\n");
				else			System.out.println("\n해당하는 주문 번호가 없습니다.\n");
				
			} catch (Exception e) {
				System.out.println("\n<주문 취소 중 예외 발생>\n");
				e.printStackTrace();
			}
			
		} else {
			System.out.println("이전 화면으로 돌아갑니다...");
		}
	}

	//--------------------------------------------------------------------------------------
	
	/** 수령 완료 내역
	 * @param loginMember
	 */
	public void selectCompleteOrder(Member loginMember) {
		
		System.out.println("\n[주문 수령 내역 조회]\n");
		
		try {
			System.out.println("============================================================");
			System.out.println("  식당명   번호         메뉴명           주문 시간   리뷰");
			System.out.println("------------------------------------------------------------");
			
			for(int i=1; i<5; i++) { 
				
				List<Order> orderList = service.selectCompleteOrder(loginMember, i);
				
				for(Order o : orderList) {
					System.out.printf(" %s  [%2d]  %-15s | %11s | %s\n",
							o.getRestaurantName(), o.getOrderNo(), o.getMenuName(), o.getToCharTime(), o.getReviewYN()+"");
					
					}
				
			} 
			System.out.println("============================================================");
			
		} catch (Exception e) {
			System.out.println("\n<주문 수령 완료 내역 조회 중 예외 발생>\n");
			e.printStackTrace();
		}	
	}
	
}
