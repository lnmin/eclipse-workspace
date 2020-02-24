package com.heime.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo1_Sever {

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
		ServerSocket server = new ServerSocket(12345);
		
		Socket socket = server.accept();             //��ȡ�ͻ��˵�����
		InputStream is = socket.getInputStream();         //��ȡ�ͻ���������
		OutputStream os = socket.getOutputStream();       //��ȡ�ͻ��˵������
		
		os.write("�ٶ�һ�����֪��".getBytes());              //��������ͻ���д������
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);                       //��ȡ�ͻ��˷�����������
		System.out.println(new String(arr, 0 ,len));      //������ת�����ַ�����ӡ
		
		socket.close();
	}

}
