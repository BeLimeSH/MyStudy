package edu.kh.op.ex;

import java.util.Scanner;

//예제 코드 작성용 클래스
public class OpExample {
	
	//ex1() 메서드
	//-> OpExample이 가지고 있는 기능 중 ex1()이라는 기능
	public void ex1() {
		//syso 작성 후 ctrl + space
		System.out.println("OpExample의 ex1() 기능 수행");
		System.out.println("단축키 생겼다.");
	}
	
	//ex2() 메서드(기능)
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 1 : ");
		int input1 = sc.nextInt();  //다음 입력되는 정수를 읽어옴.
		
		System.out.print("정수 입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.printf("%d / %d = %d\n", input1, input2, input1/input2);
		System.out.printf("%d %% %d = %d\n", input1, input2, input1%input2);
						  //  %% : 프린트에서 %를 출력하는 방법 -> 에러 조심! 
		
	}
	
	public void ex3() {
		//증감 연산자 : ++, --
		//-> 피연산자(값)를 1 증가 또는 감소 시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++; //iNum1 1 증가
		iNum2--; //iNum2 1 감소
		
		System.out.println("iNum1 : " + iNum1);
		System.out.println("iNum2 : " + iNum2);
		
		
		//전위 연산 : ++3, --2 연산자가 앞 쪽에 배치
		//			  다른 연산자보다 먼저 증가/감소
		int temp1 = 5;
		int result1 = ++temp1 + 5;
		System.out.println("result1 : " + result1); //10
						//  ++5 + 5
						//  6   + 5 == 11
		
		System.out.println("temp1 : " + temp1); //6
		
		
		//후위 연산 : 10++, 6-- 연산자가 뒤쪽에 배치
		//			  다른 연산자보다 나중에 증가/감소
		int temp2 = 3;
		int result2 = temp2-- + 2;
		System.out.println("result2 : " + result2); //5
						//  3--    + 2 = 5
						//	temp2 = 2; (1감소)
		
		System.out.println("temp2 : " + temp2);  //2
		
		
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		//		3++ + --5
		//	c =	3++ + 4
		//  c = 7
		//		3++ -> 4
		
		//최종적으로 a, b, c는 각각 얼마인가?
		// a==4 b==4 c==7
		
		System.out.printf("%d / %d / %d\n", a, b, c);
	}
	
	public void ex4() {
		
		/*비교 연산자 : >, <, >=, <=, ==, !=
		 - 비교 연산자의 결과는 항상 논리값(true/false)
		 - 등호(=)가 포함된 연산자에서 등호는 항상 오른쪽!!
		 
		 - 같다 기호는 = , == 어떤 것?
		   -> ==
		   -> 등호 (=)는 대입 연산자로 사용, 구분을 위해 (==)를 "같다"라는 의미로 사용
		*/
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);					//false
		System.out.println(a < b);					//true
		System.out.println(a != b);					//true
		System.out.println((a == b) == false);		//true
		
		System.out.println("-----------------------------");
		
		int c = 4;
		int d = 5;
		
		System.out.println(c < d);					//true
		System.out.println(c + 1 <= d);				//true
		System.out.println(c >= d - 1);				//true
		
		System.out.println((++c != d) == (--c != d)); //false
						// (++4 != 5) -> false
						//				 (--5 != 5) -> true
						//    false   ==     true	-> false
		
		System.out.println("-----------------------------");
		
		int temp = 123;
		
		System.out.println("temp는 짝수인가? " + (temp%2 == 0));
		System.out.println("temp는 짝수인가? " + (temp%2 != 1));

		System.out.println("temp는 홀수인가? " + (temp%2 == 1));
		System.out.println("temp는 홀수인가? " + (temp%2 != 0));

		System.out.println("temp는 3의 배수인가? " + (temp%3 == 0));
		System.out.println("temp는 4의 배수인가? " + (temp%4 == 0));
		System.out.println("temp는 5의 배수인가? " + (temp%5 == 0));
		
	}
	
	public void ex5() {
		
		//논리 연산자 : &&(AND) , ||(OR)
		
		// &&(AND) 연산자 : 둘 다 true이면 true, 나머진 false
		// 와, 그리고(~이고), ~면서, ~이면서, ~부터 ~까지, ~사이
		
		// ex) 사과와 바나나, 사과 그리고 바나나, 사과 이면서 바나나
		
		int a = 101;
		
		//a는 100 이상이면서 짝수인가?
		
		System.out.println(a>=100);		//a는 100이상? true
		System.out.println(a%2 == 0);	//a는 짝수?    true
		
		System.out.println((a > 100) && (a%2==0));
		
		System.out.println("-----------------------------");
		
		int b = 5;
		
		//b는 1부터 10까지 숫자 범위에 포함되어 있는가?
		//(b는 1부터 10 사이의 숫자인가?)
		
		System.out.println(b >= 1);  //b는 1 이상인가?  true
		System.out.println(b <= 10); //b는 10 이하인가?	true
		
		System.out.println((b >= 1) && (b <= 10));
		
		
		System.out.println("-----------------------------");
		
		//|| (OR) 연산자 : 둘 다 false 이면 false, 나머지 true (AND의 반대)
		//또는, ~거나, ~이거나, 
		
		int c = 9;
		
		//c는 10 초과이거나 짝수인가?
		
		System.out.println((c > 10) || (c%2 == 0));
		
	}
	
	public void ex6() {
		
		//논리 부정 연산자 : !
		//논리 값을 반대로 바꾸는 연산자
		
		boolean bool1 = true;
		boolean bool2 = !bool1;
		
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		
		
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		//정수를 하나 입력 받았을 때
		//1) 해당 점수가 1부터 100사이 값이 맞는지 확인 (1이상 100이하)
		//2) (반대) 1부터 100사이 값이 아닌지 확인
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 1 <= input <= 100
		boolean result1 = (input >= 1) && (input <=100);
		
		System.out.printf("%d은/는 1 이상, 100 이하의 정수인가? : %b\n", input, result1);
		
		// 1 이상이면서 100이하 <-> 1 미만 또는 100 초과
		boolean result2 = (input <1) || (input > 100);
						// !result1
		boolean result3 = !((input >= 1) && (input <=100));
		
		System.out.printf("%d은(는) 1 미만, 100 초과 정수인가? %b / %b\n", input, result2, result3);
		
	}
	
	public void ex7() {
		
		//복합 대입 연산자 : +=, -=, *=, /=, %=
		//-> 피연산자가 자신과 연산 후 결과를 다시 자신에게 대입
		
		int a = 10;
		
		//a를 1 증가
		a++; // a = a+1, a+=1 
		System.out.println("a를 1 증가 : " + a); //11
		
		//a를 4 증가
		a += 4;
		System.out.println("a를 4 증가 : " + a); //15
		
		//a를 10 감소
		a -= 10;
		System.out.println("a를 10감소 : " + a); //5
		
		//a를 3배 증가
		a *= 3;
		System.out.println("a를 3배 증가 : " + a); //15
		
		//a를 6으로 나눴을 때 몫
		a /= 6;
		System.out.println("a를 6으로 나눴을 때 몫 : " + a); //2
		
		//a를 2로 나눴을 때 나머지
		a %= 2;
		System.out.println("a를 2로 나눴을 때 나머지 : " + a); //0
	}
	
	public void ex8() {
		
		//삼항 연산자 : 조건식 ? 식1 : 식2
		//- 조건식의 결과가 true이면 식1
		//  false이면 식2를 수행하는 연산자
		
		//* 조건식 : 연산 결과가 true/false인 식 (ex : 비교, 논리 논리부정연산)
		
		int num = 30;
		
		//num이 30보다 크면(초과) : "num은 30보다 큰 수이다"
		//아니면				    "num은 30 이하의 수이다." 출력
		
		String str1 = "num은 30보다 큰 수이다.";
		String str2 = "num은 30 이하의 수이다.";
		
		String result = num > 30 ? str1 : str2;
		
		//num 값이 30을 초과하면 str1, 아니면 str2를 result 변수에 저장
		System.out.println(result);
		
		
		System.out.println("=========================");
		
		//입력 받은 정수가 음수인가 양수인가? (단, 0은 양수로 처리)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		//1번
		//String str3 = "양수 입니다.";
		//String str4 = "음수 입니다.";
		
		
		//2번
		//String result2 = input >= 0 ? "양수" : "음수";
		//System.out.println(result2 + " 입니다.");
		
		
		//3번
		System.out.println((input >= 0 ? "양수" : "음수") + " 입니다.");
		
		
		//4번
		//System.out.print("정수 입력 : ");
		//System.out.println( (sc.nextInt() >= 0 ? "양수" : "음수")  + " 입니다.");

	}
	
	
}
