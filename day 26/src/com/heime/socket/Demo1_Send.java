package com.heime.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Demo1_Send {

	/**
	 * @param args
	 * 1.����Send
		* ����DatagramSocket, ����˿ں�
		* ����DatagramPacket, ָ������, ����, ��ַ, �˿�
		* ʹ��DatagramSocket����DatagramPacket
		* �ر�DatagramSocket
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str = "Ūɶ�գ�";
		DatagramSocket socket = new DatagramSocket();        //����Socket�൱�ڴ�����ͷ
		DatagramPacket packet =                              //����Packet�൱�ڼ�װ��
				new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getByName("127.0.0.1"),6666);
		socket.send(packet);                                 //�����������ݷ���ȥ
		socket.close();                                      //�ر���ͷ
	}

}