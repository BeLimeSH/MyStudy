package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
			
			if(i%2==0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d",sum);
	}
	
	
	public void practice2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = arr.length - i;
			
			System.out.print(arr[i] + " ");
			
			if(i%2==1) {
				sum += arr[i];
			}
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = i+1;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i=0; i<arr.length; i++) {
			
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			
			arr[i] = input;
		}
		
		System.out.print("검색할 값 : ");
		int research = sc.nextInt();
		
		boolean flags = false;
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i]==research) {
				System.out.println("인덱스 : " + i);
				
				flags = true;
			}
		}
		if(!flags) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		char[] arr = new char[str.length()];
		
		int count = 0; //str에 일치하는 ch가 몇 개 있는지 카운트
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for (int i=0; i<arr.length; i++) {
			
			//배열 대입
			arr[i] = str.charAt(i);
			
			if(arr[i]==ch) {
				
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + ch + "의 개수 : " + count);
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();	
			
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
	}
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char[] residentNum = new char[input.length()];
		
		for(int i=0; i<residentNum.length; i++) {
			
			if(i>7) {
				residentNum[i] = '*';
				
			} else {
				residentNum[i] = input.charAt(i);				
			}
			System.out.print(residentNum[i]);
		}
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if(input < 3 || input%2==0) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			
			int[] arr = new int[input];
			
			for(int i=0; i<arr.length; i++) {
				
				if(i <= arr.length/2) {
					arr[i] = i + 1 ;
					
				} else {
					arr[i] = input-i;
				}
			}
			System.out.println(Arrays.toString(arr));
			
			break;
		}
	}
	
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			arr[i] = random;
			
			for(int j=0; j<i; j++) {
				
				if(arr[i]==arr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void practice12() {
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			int random = (int)(Math.random()*45+1);
			
			lotto[i] = random;
			
			for(int j=0; j<i; j++) {
				
				if(lotto[j]==random) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
	}
	
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine(); //입력받을 문자열
		
		char[] ch = new char[input.length()]; //배열변수
		
		int count = 0;
		
		for(int i=0; i<input.length() ; i++) {
			
			ch[i] = input.charAt(i);
			
			for(int j=0; j<i ; j++) {
				
				if(ch[j]==input.charAt(i)) {
					ch[i] = 0;
					break;
				}
			}
		}
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<ch.length ; i++) {
			
			if(ch[i] != 0) {
				
				if(i==0) {
					System.out.print(ch[i]);
					
				} else {
					System.out.print(", " + ch[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.println("문자 개수 : " + count);
	}
	
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine(); //입력 버퍼 개행 문자 제거

		
		String[] arr = new String[size]; //배열 선언 및 할당
		
		int start = 0; //while 내 for문의 초기식에 사용될 변수
		
		while(true) {
			
			for(int i=start; i<arr.length; i++) {
				
				System.out.print((i+1) + "번째 문자열 : ");
				arr[i] = sc.nextLine();
			}
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char input = sc.nextLine().charAt(0);
						//입력 받은 문자열 중 제일 앞 문자 하나만 얻어옴
			
			if(input == 'Y' || input == 'y') {
				
				start = arr.length;
				//추가 입력 받기 위한 배열 부분의 시작 위치
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine();  //입력 버퍼 개행 문자 제거
				
				//증가된 크기의 배열을 생성하여 arr 배열 깊은 복사
				String[] copyArr = new String[arr.length + addSize];
				
				for(int i=0; i<arr.length; i++) { //기존 배열 크기 만큼만 반복
					
					copyArr[i] = arr[i]; //복사 배열에 기존 배열 값을 같은 인덱스에 대입
				}
				
				//배열 얕은 복사
				arr = copyArr; //arr이 참조하는 주소 값을 copyArr의 주소값으로 바꿔서
							   //arr이 참조하는 배열의 크기가 증가한 것 처럼 보이게 함.
				
				
			} else { // y/n만 입력했다는 상황을 가정
				
				break; //while 반복 종료
				
			}
			
		} //while 끝
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	//sc.nextLine();  -> 다음 개행문자를 읽어옴
	//nextInt() 때문에 입력 버퍼에 남아있는 개행문자를
	//nextLine()으로 읽어옴.
	//-> 변수에 저장을 안하면 자동으로 버려짐(Garbage Collector가 처리)
	
	/*스캐너의 동작 원리 + 문제점 + 해결방법
	
	1) 동작 원리
	- next(); nextXXX(); 에서 next(다음)의 의미
	: 스캐너를 이용한 입력 시, 입력 값이 바로 프로그램으로 전달 되는 것이 아닌
	  입력 버퍼라는 곳에 임시 저장이 된다.
	  (Buffer : 데이터를 모아서 한 번에 이동하는 용도의 저장 공간 (==바구니))
	  (입력 버퍼 : 키보드로 입력된 모든 문자를 묶어서 저장하는 임시 공간
	  			  + 띄어쓰기, 엔터도 저장함.)
	
	ex) [키보드로] : 1234(엔터) -> [입력 버퍼] : 1234(엔터)
	
	2) 문제점
	* next(), nextInt(), nextDouble()
	- 입력 버퍼에서 다음 공백문자(띄어쓰기, 엔터)를 만나기 전까지의 문자열을 읽어옴.
	  단, 입력 버퍼 맨 앞 공백문자는 무시
	
	ex) [키보드 입력] : abc(엔터)   	, [입력 버퍼] : abc(엔터1)
		sc.next(); // "abc"				, [입력 버퍼] : (엔터1)
		
		[키보드 입력] : def(엔터)		, [입력 버퍼] : (엔터1)def(엔터2)
		sc.next(); // "def"(엔터1 무시)	, [입력 버퍼] : (엔터2)
		
		*** 무조건 입력 버퍼에 (엔터)가 하나씩 남음!! ***
	
	* nextLine()
	- 입력 버퍼에서 다음 한 줄(== 다음 (엔터))까지의 문자열을 읽어옴.
	  --> 제일 앞에 있는 공백문자를 무시할 수 없음.
	  
	  ex)
	  
	  [키보드 입력] : abc(엔터)			, [입력 버퍼] : abc(엔터)
	  sc.nextLine(); // "abc"			, [입력 버퍼] : 
	  
	  문제 상황
	  [키보드 입력] : abc(엔터)   		, [입력 버퍼] : abc(엔터)
	  sc.next(); // "abc"				, [입력 버퍼] : (엔터)
	  
	  [키보드 입력] : def(엔터)			, [입력 버퍼] : (엔터)def(엔터)
	  sc.nextLine(); // "" (빈칸)		, [입력 버퍼] : def(엔터)
	  
	  *** 입력 버퍼 맨 앞에 개행문자(엔터)가 남아 있어서 
	  	   nextLine 시 빈칸이 읽어와지는 문제가 발생 ***
	
	*/

}
