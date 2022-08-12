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
		System.out.printf("\n¦�� ��° �ε��� �� : %d",sum);
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
		System.out.printf("\nȦ�� ��° �ε��� �� : %d", sum);
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
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
			
			System.out.print("�Է� " + i + " : ");
			int input = sc.nextInt();
			
			arr[i] = input;
		}
		
		System.out.print("�˻��� �� : ");
		int research = sc.nextInt();
		
		boolean flags = false;
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i]==research) {
				System.out.println("�ε��� : " + i);
				
				flags = true;
			}
		}
		if(!flags) {
			System.out.println("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
		}
	}
	
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		
		char[] arr = new char[str.length()];
		
		int count = 0; //str�� ��ġ�ϴ� ch�� �� �� �ִ��� ī��Ʈ
		
		System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		
		for (int i=0; i<arr.length; i++) {
			
			//�迭 ����
			arr[i] = str.charAt(i);
			
			if(arr[i]==ch) {
				
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n" + ch + "�� ���� : " + count);
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();	
			
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("�� �� : " + sum);
	}
	
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
			
			System.out.print("���� : ");
			int input = sc.nextInt();
			
			if(input < 3 || input%2==0) {
				System.out.println("�ٽ� �Է��ϼ���.");
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
		
		System.out.print("�߻��� ���� : ");
		
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice10() {
		
		int[] arr = new int[10];
		
		System.out.print("�߻��� ���� : ");
		
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
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}
	
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		System.out.print("�߻��� ���� : ");
		
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
		
		System.out.print("���ڿ� : ");
		String input = sc.nextLine(); //�Է¹��� ���ڿ�
		
		char[] ch = new char[input.length()]; //�迭����
		
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
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		
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
		System.out.println("���� ���� : " + count);
	}
	
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine(); //�Է� ���� ���� ���� ����

		
		String[] arr = new String[size]; //�迭 ���� �� �Ҵ�
		
		int start = 0; //while �� for���� �ʱ�Ŀ� ���� ����
		
		while(true) {
			
			for(int i=start; i<arr.length; i++) {
				
				System.out.print((i+1) + "��° ���ڿ� : ");
				arr[i] = sc.nextLine();
			}
			
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char input = sc.nextLine().charAt(0);
						//�Է� ���� ���ڿ� �� ���� �� ���� �ϳ��� ����
			
			if(input == 'Y' || input == 'y') {
				
				start = arr.length;
				//�߰� �Է� �ޱ� ���� �迭 �κ��� ���� ��ġ
				
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine();  //�Է� ���� ���� ���� ����
				
				//������ ũ���� �迭�� �����Ͽ� arr �迭 ���� ����
				String[] copyArr = new String[arr.length + addSize];
				
				for(int i=0; i<arr.length; i++) { //���� �迭 ũ�� ��ŭ�� �ݺ�
					
					copyArr[i] = arr[i]; //���� �迭�� ���� �迭 ���� ���� �ε����� ����
				}
				
				//�迭 ���� ����
				arr = copyArr; //arr�� �����ϴ� �ּ� ���� copyArr�� �ּҰ����� �ٲ㼭
							   //arr�� �����ϴ� �迭�� ũ�Ⱑ ������ �� ó�� ���̰� ��.
				
				
			} else { // y/n�� �Է��ߴٴ� ��Ȳ�� ����
				
				break; //while �ݺ� ����
				
			}
			
		} //while ��
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	//sc.nextLine();  -> ���� ���๮�ڸ� �о��
	//nextInt() ������ �Է� ���ۿ� �����ִ� ���๮�ڸ�
	//nextLine()���� �о��.
	//-> ������ ������ ���ϸ� �ڵ����� ������(Garbage Collector�� ó��)
	
	/*��ĳ���� ���� ���� + ������ + �ذ���
	
	1) ���� ����
	- next(); nextXXX(); ���� next(����)�� �ǹ�
	: ��ĳ�ʸ� �̿��� �Է� ��, �Է� ���� �ٷ� ���α׷����� ���� �Ǵ� ���� �ƴ�
	  �Է� ���۶�� ���� �ӽ� ������ �ȴ�.
	  (Buffer : �����͸� ��Ƽ� �� ���� �̵��ϴ� �뵵�� ���� ���� (==�ٱ���))
	  (�Է� ���� : Ű����� �Էµ� ��� ���ڸ� ��� �����ϴ� �ӽ� ����
	  			  + ����, ���͵� ������.)
	
	ex) [Ű�����] : 1234(����) -> [�Է� ����] : 1234(����)
	
	2) ������
	* next(), nextInt(), nextDouble()
	- �Է� ���ۿ��� ���� ���鹮��(����, ����)�� ������ �������� ���ڿ��� �о��.
	  ��, �Է� ���� �� �� ���鹮�ڴ� ����
	
	ex) [Ű���� �Է�] : abc(����)   	, [�Է� ����] : abc(����1)
		sc.next(); // "abc"				, [�Է� ����] : (����1)
		
		[Ű���� �Է�] : def(����)		, [�Է� ����] : (����1)def(����2)
		sc.next(); // "def"(����1 ����)	, [�Է� ����] : (����2)
		
		*** ������ �Է� ���ۿ� (����)�� �ϳ��� ����!! ***
	
	* nextLine()
	- �Է� ���ۿ��� ���� �� ��(== ���� (����))������ ���ڿ��� �о��.
	  --> ���� �տ� �ִ� ���鹮�ڸ� ������ �� ����.
	  
	  ex)
	  
	  [Ű���� �Է�] : abc(����)			, [�Է� ����] : abc(����)
	  sc.nextLine(); // "abc"			, [�Է� ����] : 
	  
	  ���� ��Ȳ
	  [Ű���� �Է�] : abc(����)   		, [�Է� ����] : abc(����)
	  sc.next(); // "abc"				, [�Է� ����] : (����)
	  
	  [Ű���� �Է�] : def(����)			, [�Է� ����] : (����)def(����)
	  sc.nextLine(); // "" (��ĭ)		, [�Է� ����] : def(����)
	  
	  *** �Է� ���� �� �տ� ���๮��(����)�� ���� �־ 
	  	   nextLine �� ��ĭ�� �о������ ������ �߻� ***
	
	*/

}
