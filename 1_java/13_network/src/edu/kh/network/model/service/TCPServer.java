package edu.kh.network.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPServer {
	
	//Server : ���񽺸� �����ϴ� ���α׷� �Ǵ� ��ǻ��
	//Cilent : ������ ���񽺸� ��û�Ͽ� ����ϴ� ���α׷� �Ǵ� ��ǻ��
	
	//TCP Socket ���α׷���
	
	//TCP : ������ ������ �ŷڼ��� �ִ��� �����ϱ� ���� ���(���� ������ ���)
	//		���������� �����͸� �����ϰ� Ȯ�� �� ���� �� ������
	
	//Socket : ���μ���(Process)�� ��ſ� ���Ǵ� �� ����
	//		   ������ Ŭ���̾�Ʈ�� ����� �ϱ� ���� �Ű�ü
	
	//ServerSocket : ������ ����
	//- Port�� ����Ǿ� �ܺ� ��û�� ��ٸ��� ����
	//-> Ŭ���̾�Ʈ ��û�� �� ��� �̸� ����(accept)�ϰ�
	//	 Ŭ���̾�Ʈ�� ����� �� �ִ� ������ ����
	//--> ���� ���ϰ� Ŭ���̾�Ʈ ������ ����Ǿ� ����� ��������
	
	public void serverStart() {
		//1. ������ ��Ʈ��ȣ�� ����
		int port = 8500; //port ��ȣ�� 0~65535 ���� ���� ����
						 //��, 1023�� ���ϴ� �̹� ������� ��찡 ������ ����
		
		
		// * ����� ������ �̸� ���� *
		ServerSocket serverSocket = null; 	//���� ���� ���� ����
		Socket clientSocket = null; 		//Ŭ���̾�Ʈ ���� ���� ����
		
		InputStream is = null;				//Ŭ���̾�Ʈ -> ���� �Է¿� ��Ʈ�� ����
		BufferedReader br = null;			//�Է¿� ���� ��Ʈ�� ����
		
		OutputStream os = null; 			//���� -> Ŭ���̾�Ʈ ��¿� ��Ʈ�� ����
		PrintWriter pw = null; 				//��¿� ���� ��Ʈ�� ����
		
		
		try {
			//2. ������ ���� ��ü ����
			serverSocket = new ServerSocket(port); //������ ������ �����Ͽ� ��Ʈ ����
			
			//3.Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			// - ������ ������ �����Ǹ� Ŭ���̾�Ʈ ��û�� ���� ������ 
			//	 ���� �ڵ带 �������� �ʰ� ����ϰ� ����.
			System.out.println("[Server]");
			System.out.println("Ŭ���̾�Ʈ ��û�� ��ٸ��� �ֽ��ϴ�.");
			
			
			//4. ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			//-> ��û�� �����ϸ� �ڵ����� Socket ��ü�� ������.
			clientSocket = serverSocket.accept();
			
			//������ Ŭ���̾�Ʈ�� IP�� ���� ���
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��...");
			
			//5. ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			//6.���� ��Ʈ���� ���� ���� ����
			br = new BufferedReader( new InputStreamReader(is) );
			//InpurStreamReader : ���ڱ�� ��Ʈ���� ����Ʈ ��� ��Ʈ�� ���ῡ ���Ǵ� ��Ʈ��
					
			pw = new PrintWriter(os);
			
			
			//7. ��Ʈ���� ���� �а� ����
			
			//7-1) ���� -> Ŭ���̾�Ʈ���� ���(�޼��� ����)
			
			Date now = new Date(); //������ �ð��� ����ϰ� �ִ� �ð� ���� ��ü

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sdf.format(now); //now�� ����� �ð� ������ ����
			
			
			pw.println(time + "[���� ���� ����]");
			pw.flush(); //��Ʈ���� �ִ� ������ ��� �о� ��.
			
			//7-2) Ŭ���̾�Ʈ -> �������� �Է�(�޼��� ���� �ޱ�)
			
			String message = br.readLine(); //Ŭ���̾�Ʈ �޼��� �� ���� �о� ��.
			
			System.out.println(clientIP + "�� ���� �޼��� : " + message);
			
			
		} catch (IOException e) {
			e.printStackTrace();	//���� ����
		
		} finally {
			//8. ��� ����
			
			//����� ��Ʈ��, ���� �ڿ��� ��� ��ȯ(close)
			
			try {
				//������Ʈ�� close�� ����� ��ݽ�Ʈ��(is, os)�� ���� close ��.
				if(pw != null) pw.close();
				if(br != null) br.close();
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				//if���� {}�� ��� ���ϸ� ���� �� ��(�����ݷ� ����)�� if ���� �ڵ尡 �ȴ�.		
				
			} catch(IOException e) {
				e.printStackTrace();
			}			
		}
		
		
	}
	
	
	
	
	
	
	
	
}
