package edu.kh.array2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {
	
	public void practice1() {
		
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr[0].length; j++) {
				
				arr[i][j] = "(" + i + ", " + j + ")";
				
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void practice2() {
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int i=0; i<arr.length ;i++) {
			
			 for(int j=0; j<arr[0].length; j++) {
				 
				 arr[i][j] = num;
				 
				 System.out.printf("%3d", arr[i][j]);
				 num++;
			 }
			 
			 System.out.println();
		}
		
	}
	
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int i=0; i<arr.length ;i++) {
			
			 for(int j=0; j<arr[0].length; j++) {
				 
				 arr[i][j] = num;
				 
				 System.out.printf("%3d", arr[i][j]);
				 num--;
			 } 
			 System.out.println();
		}
	}
	
	
	public void practice4() {
		
		
		int[][] arr = new int[4][4];
		
		//상수 사용법 : 변하지 않는 특정 값에 이름을 붙여줌
		final int ROW_LAST_INDEX = arr.length -1; //행 마지막 인덱스
		final int COL_LAST_INDEX = arr[0].length -1; //열 마지막 인덱스
		
		
		for(int row=0; row<arr.length; row++) { //행 반복
						  //행의 길이
			
			for(int col=0; col<arr[row].length; col++) { //열 반복
							  //row번째 행의 열의 길이
				if(row != ROW_LAST_INDEX && col != COL_LAST_INDEX) {
					
					arr[row][col] = (int)(Math.random()*10+1);
					
					// 각 행의 마지막 열에 난수를 누적
					arr[row][COL_LAST_INDEX] += arr[row][col];
					
					// 각 열의 마지막 행에 난수를 누적
					arr[ROW_LAST_INDEX][col] += arr[row][col];
					
					//생성된 모든 난수를 마지막 행, 마지막 열에 누적
					arr[ROW_LAST_INDEX][COL_LAST_INDEX] += arr[row][col];
					
				}
				
				System.out.printf("%4d", arr[row][col]);
				} //열 반복 끝
			
			System.out.println();
			}// 행 반복 끝
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(row<1 || row>10 || col<1 || col>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				
				continue;
			}
			
			char[][] arr = new char[row][col];
			
			for(int i=0; i<arr.length ; i++) {
				
				for(int j=0; j<arr[0].length; j++) {
					
					arr[i][j] = (char)((int)(Math.random()*26+65));
					
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			break;
		}
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] arr = new char[row][];
		
		for(int i=0; i<row ; i++) {
			
			System.out.print(i + "열의 크기 : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
			
		}
		
		char ch = 'a';
		
		for(int i=0; i<arr.length ; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ch++;
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public void practice7() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int count = 0;
		
		System.out.println("== 1분단 ==");
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[0].length; j++) {
				
				arr1[i][j] = students[count];
				
				System.out.print(arr1[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i=0; i<arr2.length; i++) {
			
			for(int j=0; j<arr2[0].length; j++) {
				
				arr2[i][j] = students[count];
				
				System.out.print(arr2[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
	}
	
	
	public void practice8() {
		
		//다시풀기//
		
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int count = 0;
		
		System.out.println("== 1분단 ==");
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr1[0].length; j++) {
				
				arr1[i][j] = students[count];
				
				System.out.print(arr1[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		
		for(int i=0; i<arr2.length; i++) {
			
			for(int j=0; j<arr2[0].length; j++) {
				
				arr2[i][j] = students[count];
				
				System.out.print(arr2[i][j] + "  ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		
		
		
		
	}
	
	
	public void practice9() {
		
	}
	
	
	public void practice10() {
		
	}
}
