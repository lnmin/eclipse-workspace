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
	 * 2.服务端
		* 创建ServerSocket(需要指定端口号)
		* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
		* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
		* 输入流可以读取客户端输出流写出的数据
		* 输出流可以写出数据到客户端的输入流
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
//		demo1();
		
		//多线程服务器
		ServerSocket server = new ServerSocket(12345);
		while(true) {
			final Socket socket = server.accept();             //获取客户端的请求
			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //将字节流包装成字符流
						PrintStream ps = new PrintStream(socket.getOutputStream());             //PrintStream 中写出换行的方法
						
						ps.println("欢迎支持黑马程序员");
						System.out.println(br.readLine());           //readLine()以 \r\n为结束标志
						ps.println("不好意思，报满了");
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
		
		Socket socket = server.accept();             //获取客户端的请求
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //将字节流包装成字符流
		PrintStream ps = new PrintStream(socket.getOutputStream());             //PrintStream 中写出换行的方法
		
		ps.println("欢迎支持黑马程序员");
		System.out.println(br.readLine());           //readLine()以 \r\n为结束标志
		ps.println("不好意思，报满了");
		System.out.println(br.readLine());
		socket.close();
	}

}
