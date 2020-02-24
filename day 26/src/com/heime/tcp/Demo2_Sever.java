package com.heime.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo2_Sever {

	/**
	 * @param args
	 * 2.�����
		* ����ServerSocket(��Ҫָ���˿ں�)
		* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
		* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
		* ���������Զ�ȡ�ͻ��������д��������
		* ���������д�����ݵ��ͻ��˵�������
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
//		demo1();
		
		//���̷߳�����
		ServerSocket server = new ServerSocket(12345);
		while(true) {
			final Socket socket = server.accept();             //��ȡ�ͻ��˵�����
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //���ֽ�����װ���ַ���
						PrintStream ps = new PrintStream(socket.getOutputStream());             //PrintStream ��д�����еķ���
						
						ps.println("��ӭ֧�ֺ������Ա");
						System.out.println(br.readLine());           //readLine()�� \r\nΪ������־
						ps.println("������˼��������");
						System.out.println(br.readLine());
						socket.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}.start();
			
		}
		
		
	}

	private static void demo1() throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		Socket socket = server.accept();             //��ȡ�ͻ��˵�����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //���ֽ�����װ���ַ���
		PrintStream ps = new PrintStream(socket.getOutputStream());             //PrintStream ��д�����еķ���
		
		ps.println("��ӭ֧�ֺ������Ա");
		System.out.println(br.readLine());           //readLine()�� \r\nΪ������־
		ps.println("������˼��������");
		System.out.println(br.readLine());
		socket.close();
	}

}
