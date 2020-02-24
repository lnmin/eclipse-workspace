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
	 * 1.发送Send
		* 创建DatagramSocket, 随机端口号
		* 创建DatagramPacket, 指定数据, 长度, 地址, 端口
		* 使用DatagramSocket发送DatagramPacket
		* 关闭DatagramSocket
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		DatagramSocket socket = new DatagramSocket();        //创建Socket相当于创建码头
		while(true) {
			String line = sc.nextLine();
			if("quit" .equals(line)) {
				break;
			}
			DatagramPacket packet =                              //创建Packet相当于集装箱
					new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"),6665);
			socket.send(packet);                                 //发货，将数据发出去
		}
		socket.close();                                      //关闭码头
	}

}
