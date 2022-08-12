package edu.kh.io.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOService {
	
	//IO
	
	//Input (�Է�) : �ܺ� -> ���η� �����͸� �鿩���� ��
	//Output(���) : ���� -> �ܺη� �����͸� �������� ��
	
	//Stream : ��/��� ��� ����(�����Ͱ� �귯���� ���)
	//		   �⺻������ Stream�� �ܹ���
	
	
	//1) ���� ��� (���� == ���α׷�, �ܺ� == ����)
	public void output1() {
		
		FileOutputStream fos = null;
		//FileOutputStream ��ü ���� ��
		//FileNotFoundException ���ܰ� �߻��� ���ɼ��� ���� -> ���� ó�� �ʿ�
		
		try {
			fos = new FileOutputStream("test1.txt");
			//���� ���α׷�����
			//test1.txt ���Ϸ� ����ϴ� ��� ��ü ����
			
			//���Ͽ� "Hello" ��������
			String str = "Hello";
			
			for(int i=0; i<str.length(); i++) {
				
				//System.out.println( str.charAt(i) );
				
				//"Hello"�� �� ���ھ� ��� ���Ϸ� ����ϱ�
				fos.write( str.charAt(i) );
				
				//Unhandled exception type IOException
				//write()�� IOException�� �߻���ų ���ɼ��� �ִ�.
			}
			
		} catch(IOException e) {
			System.out.println("���� �߻�");
			e.printStackTrace(); //���� ����
		
		} finally {
			
			//���ܰ� �߻� �ϴ��� ������ ����
			
			//����� ��Ʈ�� �ڿ� ��ȯ(��� ����) --> �ʼ� �ۼ�!
			//���α׷� �޸� ���� �������� �׻� �پ��� ������
			//-> �ۼ� �� �ϸ� ���������� ���� �� �ִ�.
			
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//2) ���� ���(���� ��� ��Ʈ��)
	public void output2() {
		
		FileWriter fw = null; //���α׷� -> ���Ϸ� ���� ���� ��� ��Ʈ��
		
		try {
			
			fw = new FileWriter("test1.txt"); //�ܺ� ���ϰ� �����ϴ� ��Ʈ�� ��ü ����
			
			String str = "�ȳ��ϼ���. Hello. 1234 !#";
			
			//fw.write(int c);		: �� ���ھ�
			//fw.write(String s);	: �� �پ� ���

			fw.write(str);
			//���� �ߴµ� ��� X
			//-> �� ���� ��°�� �������� ���� "����"�� �̿��ϴµ�
			//	 ���� ���ۿ� ��� �ִ� ���� -> ������ �о� �־ ���۸� ����� ��.
			
			//	 close() ������ �����ϸ� ��ο� �����ִ� ������ ��� �������� ��θ� ���ش�!
			
		} catch(IOException e) {
			e.printStackTrace(); //���� ����
			
		} finally {
			
			try {
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}	
	}
	
	
	//3) ���� �Է� : �ܺ�(����) -> ����(���α׷�)���� �о����
	
	public void input1() {
		
		FileInputStream fis = null; //���� -> ���α׷����� �о���� ����Ʈ ��� ��Ʈ��
		
		try {
			fis = new FileInputStream("test1.txt");
			
			//FileInputStream�� 1byte���� �о�� �� �ִ�.
			while(true) {
				
				int data = fis.read();	//���� 1byte�� �о���µ� ��������.
										//���� ������ ������ -1��ȯ
				
				if(data == -1 ) { //���� ���� ���� => ����
					break;
				}
				//�ݺ� ���� �� ������ char�� ���� ����ȯ�Ͽ� ���ڷ� ���
				System.out.print( (char)data );
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
	//4) ���� �Է�(���� ��� ��Ʈ��)
	public void input2() {
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader("test1.txt"); //���Ϸκ��� �о���� ��� ��ü ����
			
			while(true) {
				
				int data = fr.read(); //���� �� ���ڸ� �о��. ������ -1
				
				if(data == -1) {
					break;
				}
				System.out.print((char)data);	
			}
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				fr.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
