package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			for(int i=1 ; i<=input ; i++) {
				System.out.print(i + " ");
				
			}
		}
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			for(int i=input ; i>=1 ; i--) {
				System.out.print(i + " ");
				
			}
		}
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i<=input ; i++) {
			
			sum += i;
			
			if(i<input) {
				System.out.print(i + " + ");
			
			} else {
				System.out.println(i + " = " + sum);
			
			}
		}
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if (num1<1 || num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		} else {
			
			if(num1<=num2) {
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				
				} 
				
			} else {
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				
				} 
			}
		}
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== "+ num +"단 =====");
		
		for(int i=1 ; i<=9 ; i++ ) {
			
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>=2 && num<=9) {
			
			for(int i=num ; i<=9 ; i++ ) {
				System.out.println("===== "+ i +"단 =====");
				
				for(int j=1; j<=9 ; j++) {
					System.out.printf("%d * %d = %d\n", i, j, i*j);
					
				}
			}
			
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
			
		}
	}
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
	
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=input ; i>=1 ; i--) {
			
			for(int j=i ; j>=1 ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
	
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input ; i++) { //한 줄 출력하고 엔터
			
			for(int j=input ; j>=1 ; j--) { //별 한줄 입력하는 부분
				
				if(i<j) {
					System.out.print(" ");
					
				} else {
					System.out.print("*");
					
				}
				
			}
			System.out.println();
			
		}
	}
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1 ; i<=input-1 ; i++) {
			
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for(int i=input ; i>=1 ; i--) {
			
			for(int j=i ; j>=1 ; j--) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
	
	//트리모양
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i=1 ; i<=input ; i++) {

			for (int j=input; j>=1 ; j--) { //역방향 출력
				
				if(i<j) {
					System.out.print(" ");
					
				} else {
					System.out.print("*");
				}	
			}
			
			for (int j=1; j<=i ; j++) { //정방향 출력
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		/*
		
		for(int i=1 ; i<=input ; i++) {
		
			//공백 출력 for문
			for(int j=input-x ; j>=1 ; j--) {
				System.out.print(" ");
			
			}
			
			// * 출력 for문
			// -> 1,3,5,7,9
			for(int j=1 ; j<=i*2-1 ; j++) {
				System.out.print("*");
			
			}
			System.out.println(); //줄바꿈
		
		}
		
		 */
	}
	
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for (int i=1 ; i<=input ; i++) {
			
			for(int j=1 ; j<=input ; j++) {
				
				if(i==1 || i==input) {
					
					System.out.print("*");
					
				} else {
					
					if (j==1 || j==input) {
						System.out.print("*");
						
					} else {
						System.out.print(" ");
						
					}				
				}
			}
			System.out.println();
			
		}
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			
			if(i%2==0 || i%3==0) {
				System.out.print(i + " ");
				
				if(i%2==0 && i%3==0) {
					count++;
				}
			}		
		}
		System.out.println("\ncount : " + count);
	}
}
