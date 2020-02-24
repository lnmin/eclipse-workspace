package com.heime.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1_Receive {

	/**
	 * @param args
	 * 2.����Receive
	* ����DatagramSocket, ָ���˿ں�
	* ����DatagramPacket, ָ������, ����
	* ʹ��DatagramSocket����DatagramPacket
	* �ر�DatagramSocket
	* ��DatagramPacket�л�ȡ����
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket(6666);              //����Socket�൱�ڴ�����ͷ
		DatagramPacket packet = new DatagramPacket(new byte[1024],1024);  //����Packet�൱�ڴ�����װ��
		socket.receive(packet);                                        //�ӻ�����������
		
		byte[] arr = packet.getData();                                 //��ȡ����
		int len = packet.getLength();                                  //��ȡ��Ч���ֽڸ���
		System.out.println(new String(arr, 0 ,len));
		socket.close();
	}

}