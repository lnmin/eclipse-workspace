package com.heima.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = new ServerSocket(54321);
		System.out.println("��������������54321�˿�");
		
		while(true) {
			final Socket socket = server.accept();      //���ܿͻ��˵�����
			
			new Thread() {                     //����һ���߳�
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //��ȡ������
						PrintStream ps = new PrintStream(socket.getOutputStream());    //��ȡ�����
						
						String line = br.readLine();                     //���ͻ���д���������ݣ���ȡ����
						line = new StringBuilder(line).reverse().toString();  
						//��ʽ��̣����ַ�����line��ת�����ַ�����������StringBuilder�����ٷ�ת��������ת��Ϊ�ַ���
						ps.println(line);
						
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
