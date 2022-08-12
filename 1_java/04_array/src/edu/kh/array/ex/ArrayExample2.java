package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample2 {
	
	//���� ���� (shallow : ����)
	//-> �ּҸ� �����Ͽ� ���� �ٸ� �� ������ 
	//�ϳ��� �迭(�Ǵ� ��ü)�� �����ϴ� ���¸� ����� ���� ���
	public void shallowCopy() {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		//���� ���� ����
		int[] copyArr = arr; //�ּҸ� ����
		
		System.out.println("�ּ� Ȯ��");
		System.out.println("arr : " + arr);
		System.out.println("copyArr : " + copyArr);
		
		//�迭 �� ����
		System.out.println("���� ��");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		//���� ������ �迭�� ���� ������ ��
		copyArr[2] = 999;
		
		System.out.println("���� ��");
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
	}
	
	//���� ����
	//-> ���� �ڷ����� ���ο� �迭�� ����
	//	 ���� �迭�� �����͸� ��� �����ϴ� ���
	public void deepCopy() {
		
		int[] arr = {1,2,3,4,5}; //����
		
		//1. for���� �̿��� ���� ����
		int[] copyArr1 = new int[arr.length];	//5ĭ¥�� �迭 ����
		
		for(int i=0; i<arr.length; i++) {
			copyArr1[i] = arr[i];
		}
		
		// 2. System.arraycopy(�����迭, ���� ���� ���� �ε���, ����迭, 
							// ����迭�� ���� ���� �ε���, �������);
		
		int[] copyArr2 = new int[arr.length];
		System.arraycopy(arr, 0, copyArr2, 0, 5);
		
		// 3. ������ �迭 ���� ���� = Arrays.copyOf(���� �迭, ������ ����);
		int[] copyArr3 = Arrays.copyOf(arr, arr.length);
		
		
		//�� ���� �� Ȯ��
		copyArr1[4] = 0;
		copyArr2[4] = 999;
		copyArr3[4] = 5000;
		
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copyArr1 : " + Arrays.toString(copyArr1));
		System.out.println("copyArr2 : " + Arrays.toString(copyArr2));
		System.out.println("copyArr3 : " + Arrays.toString(copyArr3));
	}
	
	public void createLottoNumber() {
		//�ζ� ��ȣ ������
		
		//1. 1~45���� �ߺ����� ���� ���� 6�� ����
		//2. ������ ������ ������������ ����
		
		//1) ���� 6���� ������ �迭 ���� �� �Ҵ�
		//2) ������ �迭�� ó������ ������ ���� �����ϴ� for�� �ۼ�
		//3) 1~45 ������ ���� ����
		//4) ������ ������ ������� �迭 ��ҿ� ����
		//5) �ߺ� �˻縦 ���� for�� �ۼ�
		//6)
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			
			int random = (int)(Math.random()*45 + 1);
			
			lotto[i] = random;
			
			for(int x=0; x<i ; x++) {
				
				if(random==lotto[x]) {
					
					i--;
					break;
				}
			}
		}
		
		//7) �������� ����
		//-> ����, ����, ����, ��, �Ǻ� ���� ���...
		//--> �ڹٰ� ���� ����� �̸� ���� �����ϰ� ����
		//	  Arrays.sort(�迭��) : �迭 �� ������ ������������ ���ĵ�.
		
		Arrays.sort(lotto);
		
		//��� ���
		System.out.println(Arrays.toString(lotto));
	}
	
	
	
	

}
