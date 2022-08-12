package edu.kh.variable.ex2;

public class PrintExam {
	public static void main(String[] args) {
		
		//System.out.println(); : 한 줄 출력(출력 후 줄바꿈 수행)
		//System.out.print(); : 단순 출력(출력 후 줄바꿈 X)
		
		System.out.println("테스트1");
		System.out.println("테스트2");
		
		System.out.print("테스트3");
		System.out.println();			//내용없는 println (줄바꿈)
		System.out.print("테스트4");
		
		
		System.out.println();
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		
		//System.out.printf(); : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		//10 + 5 = 15
		
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		//System.out.printf("패턴", 패턴에 들어갈 값);
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2 );

		
		//10 + 10 * 5 / 2 = 35
		
		System.out.println(iNum1 + " + " + iNum1 + " * " + iNum2 + " / 2 = " + (iNum1+iNum1*iNum2/2));
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2, iNum1+iNum1*iNum2/2);
		
		//패턴 연습
		int iNum3 = 3;
		System.out.printf("%d\n", iNum3);
		System.out.printf("%5d\n", iNum3);
		System.out.printf("%-5d\n", iNum3);
		
		//소수점 자리 제어(반올림 처리)
		System.out.printf("%f\n", 10/3.0);
		System.out.printf("%.2f\n", 10/3.0);
		System.out.printf("%.0f\n", 10/3.0);
		
		//문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '백';
		String str = "배고파요";
		
		//'' : char 리터럴 표기법
		//"" : String 리터럴 표기법
		
		System.out.printf("%b / %c / %s\n", isTrue, ch, str);

		//escape 문자 : 일반 문자가 아닌 특수 문자 표현
		
		System.out.println("\\");  //백슬래시 출력 방법
		System.out.println("a\tb\tc\td");  //tab 출력
		System.out.println("안\n\n\n\n녕");  //개행(줄바꿈) 문자
		System.out.println("\"");  //" 출력
		System.out.println("\'");  //' 출력
		System.out.println("\u0041");  //유니코드(16진수) 번호로 출력
		
		

		}

}
