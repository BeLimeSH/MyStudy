package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input>0 && input%2==0) {
			System.out.println("짝수입니다.");
			
		} else if(input>0 && input%2==1) {
			System.out.println("홀수입니다.");
		
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum/3;
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.printf("평균 : %.1f\n", avg);
			
			System.out.println("축하합니다, 합격입니다!");
					
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(month + "월은 31일까지 있습니다."); break;
		
		case 2 : System.out.println(month + "월은 28일까지 있습니다."); break;
		
		case 4 : case 6 : case 9 : case 11 :
			System.out.println(month + "월은 30일까지 있습니다."); break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		if(bmi<18.5) {
			System.out.println("저체중");
			
		} else if (bmi>=18.5 && bmi<23) {
			System.out.println("정상체중");
			
		} else if (bmi>=23 && bmi<25) {
			System.out.println("과체중");
			
		} else if (bmi>=25 && bmi<30) {
			System.out.println("비만");
			
		} else {
			System.out.println("고도비만");
		}
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double midterm = sc.nextDouble();
		
		System.out.print("기말 고사 점수 : ");
		double endTerm = sc.nextDouble();
		
		System.out.print("과제 점수 : ");
		double task = sc.nextDouble();
		
		System.out.print("출석 횟수 : ");
		int at = sc.nextInt();
		
		System.out.println("===================== 결과 =====================");
		
		double a = midterm*0.2;
		double b = endTerm*0.3;
		double c = task*0.3;
		double sum = a + b + c + at;
		
		if (at<=(20-20*0.3)) {
			System.out.println("Fail [출석 횟수 부족 (" + at + "/20)]");
		
		} else {
			System.out.println("중간 고사 점수(20) : " + a);
			System.out.println("기말 고사 점수(30) : " + b);
			System.out.println("과제 점수       (30) : " + c);
			System.out.println("출석 점수       (20) : " + at);
			System.out.println("총점 : " + sum);
			
			if(sum<70) {
				System.out.println("Fail [점수 미달]");
				
			} else {
				System.out.println("PASS");
				
			}
		}
	}
}
