package edu.kh.jdbc.member.model.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.jdbc.member.model.service.MemberService;
import edu.kh.jdbc.member.model.vo.Member;

public class MemberView {

	private Scanner sc = new Scanner(System.in);
	
	private MemberService service = new MemberService();
	

	/** 
	 * 회원가입 화면 출력용 메서드
	 */
	public void signUp() {
		System.out.println("[회원 가입]\n");
		
		try {
			
			String memberId = null;
			String memberPw = null;
			String checkPw = null;
			
			String memberName = null;
			char memberGender = ' ';
			int memberAge = 0;
			String memberNickname = null;
			String memberAdress = null;
			String phone = null;
			
			//아이디
			while(true) {
				
				System.out.print("아이디 : ");
				memberId = sc.next();
				
				//아이디 중복 검사
				int result = service.duplicateCheck(memberId, memberNickname);
				
				if(result == 0) {
					System.out.println("\n[사용 가능한 아이디입니다.]\n");
					break;
				} else {
					System.out.println("\n[이미 사용중인 아이디입니다. 다시 입력해주세요.]\n"); //red01 / RED
				}
			}
			
			//비밀번호, 비밀번호 확인
			while(true) {
				System.out.print("비밀번호 : ");
				memberPw = sc.next();
				
				System.out.print("비밀번호 확인 : ");
				checkPw = sc.next();
				
				if(memberPw.equals(checkPw)) {
					break;
				} else {
					System.out.println("\n[비밀번호가 일치하지 않습니다. 다시 입력해주세요.]\n");
				}
			}
			
			//이름 입력
			System.out.print("이름 : ");
			memberName = sc.next();
			
			//성별(M/F)
			while(true) {
				
				System.out.print("성별 : ");
				memberGender = sc.next().toUpperCase().charAt(0);
				
				if(memberGender != 'M' && memberGender != 'F') {
					System.out.println("\n[성별은 M 또는 F만 입력해주세요.]\n");
				} else {
					break;
				}
			}
			
			//나이(정수)
			System.out.print("나이 : ");
			memberAge = sc.nextInt();
			sc.nextLine();
			
			//닉네임(중복X)
			while(true) {
				
				System.out.print("닉네임 : ");
				memberNickname = sc.next();
				
				//닉네임 중복 검사
				int result = service.duplicateCheck(memberId, memberNickname);
				
				if(result == 0) {
					System.out.println("\n[사용 가능한 닉네임입니다.]\n");
					break;
				} else {
					System.out.println("\n[이미 사용중인 닉네임입니다. 다시 입력해주세요.]\n");
				}
			}
			
			//주소
			System.out.print("주소 입력 : ");
			sc.nextLine();
			memberAdress = sc.nextLine();
			
			//전화번호
			System.out.print("전화번호 입력(띄어쓰기X) : ");
			phone = sc.next();
			
			Member signUpMember = new Member(memberId, memberPw, memberName, memberGender,
											memberAdress, phone, memberNickname, memberAge);
			
			//회원가입 Service 호출 후 결과 반환
			int result = service.signUp(signUpMember);
			
			if(result > 0) System.out.println("\n[회원 가입 성공]\n");
			
		} catch(Exception e) {
			System.out.println("\n<회원가입 중 예외 발생>\n");
		}
	}
	
	
	/** 로그인 메서드
	 * @return loginMember (실패 시 null, 성공 시 null X)
	 */
	public Member login() {
		System.out.println("[로그인]");
		
		System.out.print("아이디 : ");
		String memberId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		Member mem = new Member();
		mem.setMemberId(memberId);
		mem.setMemberPw(memberPw);
		
		Member loginMember = null;
		
		try {
			loginMember = service.login(mem);
			
			if (loginMember != null) {
				System.out.println("\n*** " + loginMember.getMemberName() + "님 환영합니다. ***\n");
			} else {
				System.out.println("\n[아이디 또는 비밀번호가 일치하지 않습니다]\n");
			}
			
		} catch (Exception e) {
			System.out.println("\n<로그인 과정에서 예외 발생>\n");
			e.printStackTrace();
		}
		
		return loginMember;
	}


	/** 내 정보 조회
	 * @param loginMember
	 */
	public void myInfo(Member loginMember) {
		System.out.println("[내 정보 조회]\n");
		
		System.out.println("별명   | " + loginMember.getMemberNickname());
		System.out.println("아이디 | " + loginMember.getMemberId());

		System.out.println("\n========== 내 프로필 ==========\n");
		System.out.println("이름   | " + loginMember.getMemberName());
		System.out.println("연락처 | " + loginMember.getPhone());
		System.out.println("주소   | " + loginMember.getMemberAdress());
		System.out.println("가입일 | " + loginMember.getEnrollDate());
	}


	/** 내 정보 수정
	 * @param loginMember
	 */
	public void updateMyInfo(Member loginMember) {
		
		System.out.println("[내 정보 수정]\n");
		
		System.out.print("비밀번호를 입력해 주세요 : ");
		String checkPw = sc.next();
		
		if(checkPw.equals(loginMember.getMemberPw())) {
			
			int inputNum = -1;
			
			do {
				
				try {
					
					System.out.println("\n********** 내 정보 수정 메뉴 **********\n");
					
					System.out.println("1. 닉네임 변경");
					System.out.println("2. 프로필 변경(이름, 연락처, 주소)");
					System.out.println("0. 이전 화면으로");
					
					System.out.print("메뉴를 선택해주세요 >> ");
					inputNum = sc.nextInt(); //InputMismatchException
					sc.nextLine(); //입력 버퍼 개행문자 제거
					System.out.println();
					
					switch(inputNum) {
					case 1 : updateNickname(loginMember); break;
					case 2 : updateProfile(loginMember); break;
					case 0 : System.out.println("\n[이전 화면으로 돌아갑니다...]\n"); break;
					default : System.out.println("메뉴에 작성된 번호를 입력해주세요.");
					
					}
					
				} catch(InputMismatchException e) {
					System.out.println("\n입력 형식이 올바르지 않습니다. 다시 시도해주세요.");
					sc.nextLine();	
				} 
			} while (inputNum != 0);

		} else {
			System.out.println("\n[비밀번호가 일치하지 않습니다.]\n");
		}
	}


	/** 닉네임 변경
	 * @param loginMember
	 * @throws Exception
	 */
	private void updateNickname(Member loginMember) {
		
		System.out.println("[닉네임 변경]\n");
		
		System.out.print("변경할 닉네임을 입력해주세요 : ");
		String memberNickname = sc.next();
		
		try {
			int result = service.duplicateCheck(loginMember.getMemberId(), memberNickname);
			
			if(result == 0) {
				System.out.println("\n[사용 가능한 닉네임입니다.]\n");
				
				char ch;
				
				while(true) {
					System.out.print("닉네임을 변경하시겠습니까(Y/N)? : ");
					ch = sc.next().toUpperCase().charAt(0);
					
					if(ch != 'Y' && ch != 'N') {
						System.out.println("\n[Y 또는 N만 입력해주세요.]\n");
					} else {
						break;
					}
				}
				
				if(ch == 'Y') {
					result = service.updateNickname(memberNickname, loginMember);
					
					if(result > 0) System.out.println("\n[닉네임이 변경되었습니다.]\n");
					
					loginMember.setMemberNickname(memberNickname);
					
				} else {
					System.out.println("\n[닉네임 변경이 취소되었습니다.]\n");
				}
				
			} else {
				System.out.println("\n[이미 사용중인 닉네임입니다. 다시 시도해주세요.]\n");
			}
			
		} catch (Exception e) {
			System.out.println("\n<닉네임 수정 중 예외 발생>\n");
			e.printStackTrace();
		}	
	}
	
	
	/** 프로필 변경(이름, 연락처, 주소)
	 * @param loginMember
	 */
	private void updateProfile(Member loginMember) {
		
		System.out.println("[프로필 변경(이름, 연락처, 주소)]\n");
		
		System.out.print("변경할 이름 입력 : ");
		String memberName = sc.next();
		
		System.out.print("변경할 연락처('-' 포함) 입력 : ");
		String phone = sc.next();
		sc.nextLine();
		
		System.out.print("변경할 주소 입력 : ");
		String memberAdress = sc.nextLine();
		
		System.out.println("--------------------------------------------------");
		System.out.println("[변경 내용 확인]\n");
		System.out.printf("이름 : %s\n연락처 : %s\n주소 : %s\n", memberName, phone, memberAdress);
		System.out.println("--------------------------------------------------");
		
		Member updateMember = new Member();
		updateMember.setMemberName(memberName);
		updateMember.setPhone(phone);
		updateMember.setMemberAdress(memberAdress);
		updateMember.setMemberNo(loginMember.getMemberNo());
		
		try {
			int result = 0;
			char ch;
			
			while(true) {
				System.out.print("프로필을 변경하시겠습니까(Y/N)? : ");
				ch = sc.next().toUpperCase().charAt(0);
				
				if(ch != 'Y' && ch != 'N') {
					System.out.println("\n[Y 또는 N만 입력해주세요.]\n");
				} else {
					break;
				}
			}
			
			if(ch == 'Y') {
				result = service.updateProfile(updateMember);
				
				if(result > 0) {
					System.out.println("\n[프로필이 변경되었습니다.]\n");
					
					loginMember.setMemberName(memberName);
					loginMember.setPhone(phone);
					loginMember.setMemberAdress(memberAdress);
				}
			} else {
				System.out.println("\n[프로필 변경이 취소되었습니다.]\n");
			}
		} catch (Exception e) {
			System.out.println("\n<프로필 변경 중 예외 발생>\n");
			e.printStackTrace();
		}
	}


	/** 비밀번호 변경
	 * @param loginMember
	 */
	public void updatePw(Member loginMember) {
		
		System.out.println("[비밀번호 변경]");
		
		System.out.print("현재 비밀번호를 입력하세요 : ");
		String currentPw = sc.next();
		
		if(currentPw.equals(loginMember.getMemberPw())) {
			
			String newPw;
			String newPw2;
			
			while(true) {
				System.out.print("새 비밀번호 : ");
				newPw = sc.next();
				
				System.out.print("새 비밀번호 확인 : ");
				newPw2 = sc.next();
				
				if(newPw.equals(newPw2)) {
					break;
				} else {
					System.out.println("\n새 비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
				}
			}
			
			try {
				int result = service.updatePw(loginMember.getMemberNo(), newPw);
				
				if(result > 0) {
					System.out.println("\n[비밀번호가 변경되었습니다.]");
					
					loginMember.setMemberPw(newPw);
				}
					
			} catch(Exception e) {
				System.out.println("\n<비밀번호 변경 중 예외 발생>\n");
				e.printStackTrace();
			}
		} else {
			System.out.println("\n[현재 비밀번호가 일치하지 않습니다.]\n");
		}
	}


	public int secession(Member loginMember) {
		System.out.println("[회원 탈퇴]\n");
		
		int result = 0;
		
		System.out.print("현재 비밀번호를 입력하세요 : ");
		String currentPw = sc.next();
		
		char ch;
		
		while (true) {
			System.out.print("정말 탈퇴하시겠습니까?(Y/N) : ");
			ch = sc.next().toUpperCase().charAt(0);
			
			if(ch != 'Y' && ch != 'N') {
				System.out.println("\n[Y 또는 N만 입력해주세요.]\n");
			} else {
				break;
			}
		}
		
		if(ch == 'Y') {  
			try {
				result = service.secession(loginMember.getMemberNo(), currentPw);
				
				if(result > 0) {
					System.out.println("\n[탈퇴 되었습니다.]");

				} else {
					System.out.println("\n[비밀번호가 일치하지 않습니다.]");
				}
				
			} catch (Exception e) {
				System.out.println("\n<회원 탈퇴 중 예외 발생>\n");
				e.printStackTrace();
			}
			//(N 입력 시) "회원 탈퇴 취소"
		} else {
			System.out.println("\n[회원 탈퇴를 취소합니다...]\n");
		}
		return result;
	}
	
}
