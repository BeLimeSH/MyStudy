package edu.kh.op.practice;

import java.util.Scanner;

public class OpPractice {
	
	//실습문제1
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println();
		System.out.println("1인당 사탕 개수 : " + candy/person);
		System.out.println("남는 사탕 개수 : " + candy%person);
		
	}
	
	
	//실습문제2
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(정수) : ");
		int c = sc.nextInt();
		
		System.out.print("번호(정수) : ");
		int num = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		String sex = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double record = sc.nextDouble();
		
		System.out.println();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.",
							grade, c, num, name, sex, record);		
	}
	
	//실습문제3
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		System.out.println((input%2==0 ? "짝수" : "홀수") + " 입니다.");
		
	}
	
	//실습문제4
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		int sum = a+b+c;
		double avg = sum/3.0;
		
		System.out.println();
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		
		System.out.println((a>=40)&&(b>=40)&&(c>=40)&&(avg >= 60) ? "합격":"불합격");
	}
	

}
