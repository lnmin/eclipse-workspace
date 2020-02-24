package com.heima.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1_Client {

	/**
	 * @param args
	 * �ͻ����������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ���Ƿ�ת����ַ���
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);                //��������¼�����
		Socket socket = new Socket("127.0.0.1", 54321);       //�����ͻ��ˣ�ָ��ip��ַ�Ͷ˿ں�
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //��ȡ������
		PrintStream ps = new PrintStream(socket.getOutputStream());    //��ȡ�����
		
		ps.println(sc.nextLine());          //���ַ���д����������
		System.out.println(br.readLine());  //����ת��Ľ��������
		
		socket.close();
	}

}
