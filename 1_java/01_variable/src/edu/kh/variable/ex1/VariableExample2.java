package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		/* �ڹ� �⺻ �ڷ��� 8����
		 
		 - ���� : boolean(1byte)
		 - ������ : byte(1byte), short(2byte), int(4byte), long(8byte)
		 - �Ǽ��� : float(4byte), double(8byte)
		 - ������ : char(2byte, �����ڵ�)
		 */
		
		//���� ���� : �޸𸮿� ���� ������ ������ �Ҵ� �ϴ� ��.
		//���� �� ���� : ������ ���� ���� �ִ� ��
		
		//ī��(��Ÿ) ǥ��� : ����Ǵ� �� �ܾ� �� �ļ� �ܾ��� ù ���ڸ� �빮�ڷ� ǥ��
		
		
		boolean booleanData;
		//�޸𸮿� ����(t/f)�� ������ ������ 1byte �Ҵ��ϰ� �Ҵ�� ������ booleaData��� �θ�.
		
		booleanData = true;	//booleanData ������ true ���� ���� �ֱ�
		System.out.println("booleanData : " + booleanData);
		
		byte byteNumber = 127;
		System.out.println("byteNumber : " + byteNumber);
		//�޸𸮿� �������� ������ ������ 1byte �Ҵ��ϰ� �Ҵ�� ������ byteNumber��� �θ�.
		//����� byteNumber ������ ó������ 127�� ���� ����.
		// --> �ʱ�ȭ : ó�� ������ ���� ����
		
		short shortNumber = 32767;  //���� ���� �� �ʱ�ȭ
		
		int intNumber = 2147483647;
	// �ڷ��� ������  =   ���ͷ�;
		
		// ���ͷ� : ������ ���Եǰų� �ۼ� �Ǿ����� �� ��ü
		// + �ڷ����� ���� ���ͷ� ǥ����� �ٸ�.
		
		long longNumber = 10000000000L; //L �Ǵ� l ǥ��
		//The literal 10000000000 of type int is out of range
		
		float floatNumber = 1.2345f;
		
		double doubleNumber = 3.141592;
		//double�� �Ǽ��� �߿��� �⺻������ ����.
		//(���ͷ� ǥ����� ���� �Ǽ��� double�� �ν�)
		
		//������ ���ͷ� ǥ��� : '' (Ȭ����ǥ)
		char ch = 'A';
		char ch2 = 66; //B
		
		/** char �ڷ����� ���ڰ� ���Ե� �� �ִ� ����
		- ��ǻ�Ϳ��� ����ǥ�� �����ϴµ�
		  ���ڿ� ���� ������ ���� ����� ���εǾ��ְ�
		  'B' ���� �״�ΰ� ���ԵǸ� ������ ���� 66���� ��ȯ�Ǿ� ����
		  -> �ݴ�� �����ϸ� ó������ ������ 66�̶�� ���ڸ� �����ϴ� ���� ����.
		 **/
		
		System.out.println("ch : " + ch);
		System.out.println("ch2 : " + ch2);
		
		
		/*���� ��� ��Ģ
		1. ��ҹ��� ����, �������� X
		int abcdefghijklmnopqrstuvwxyz;
	
		2. ����� ��� X
		double double;
		
		3. ���� ���� X
		char 1abc;
		
		4. Ư������ $, _ �� ��밡��(������ ��� X)
		int $iNum;
		int int_number; -> �ڹٴ� ī��ǥ��� ���, _ �ۼ� ǥ����� DB���� ���
		
		5. ī�� ǥ���
		   -> ���� �ܾ �̾ �ۼ��ϴ� ���
		   ���� �ʰ� �ļ� �ܾ� ù ���ڸ� �빮�ڷ� �ۼ�.
		char helloWorldAppleBananaTomato;
		 
		6. �������� �� ������ ����(������ ���x)
		int ����1��;
		double �Ǽ�2�� = 3.14;
		 */
		

		//-------------------------------------------------
		
		
		int number = 10;
		System.out.println("number : " + number); //10
		
		number = 20;
		System.out.println("number : " + number); //20
		
		/* ���(�׻� ���� ��)
		 - ���� �� ����
		 - �ѹ� ���� ���ԵǸ� �ٸ� ���� ������ �� ����
		 - �ڷ��� �տ� final Ű���带 �ۼ�(������ ���ԵǴ� ��)
		 
		 - ��� ��� ��Ģ : ��� �빮��, ���� �ܾ� �ۼ��� "_" ���
		 - ����� ����ϴ� ���
		   1) ���ϸ� �ȵǴ� ������ ���� ������ ��
		   2) Ư���� ���� �ǹ̸� �ο��ϴ� ���
		 */
		
		final double PI_VALUE = 3.14;
		//pi = 2.32222; ����! ���ԺҰ�
		
		final int LEFT_MOVE = 1;
		final int RIGHT_MOVE = 1;
		
	}

}
