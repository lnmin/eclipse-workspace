package com.heime.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo2_Send {

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
		Scanner sc = new Scanner(System.in);
		
		DatagramSocket socket = new DatagramSocket();        //����Socket�൱�ڴ�����ͷ
		while(true) {
			String line = sc.nextLine();
			if("quit" .equals(line)) {
				break;
			}
			DatagramPacket packet =                              //����Packet�൱�ڼ�װ��
					new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"),6665);
			socket.send(packet);                                 //�����������ݷ���ȥ
		}
		socket.close();                                      //�ر���ͷ
	}

}
