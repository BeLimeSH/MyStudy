package edu.kh.variable.practice;

public class CastingPractice {
	public static void main(String[] args) {
		
		//변수 선언
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		//iNum1 iNum2 >> 2?
		System.out.println(iNum1/iNum2); //2
		
		//가장 빠르게 2를 만드는 방법?
		System.out.println((int)dNum); //2
		
		//10.0 만드는 2가지 방법
		System.out.println(dNum*iNum2);
		System.out.println((double)iNum1);
		
		//3을 만드는 방법 2가지
		System.out.println((int)fNum);
		System.out.println(iNum1/(int)fNum);
		
		//iNum1, iNum2 >> 2.5?
		System.out.println((double)iNum1/iNum2);
		
		
		//float vs. double 차이점
		
						// 10  / 3.0f
		System.out.println(iNum1/fNum);  //3.3333333
		
						//  10  / 3.0
		System.out.println(iNum1/(double)fNum);  //3.3333333333333335
		
		//float : 소수점 아래 8번째 자리까지 연산 후 반올림
		//double : 소수점 아래 16번째 자리까지 연산 후 반올림
	}

}
