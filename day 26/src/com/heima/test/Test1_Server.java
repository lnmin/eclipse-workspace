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
		System.out.println("服务器启动，绑定54321端口");
		
		while(true) {
			final Socket socket = server.accept();      //接受客户端的请求
			
			new Thread() {                     //开启一条线程
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));  //获取输入流
						PrintStream ps = new PrintStream(socket.getOutputStream());    //获取输出流
						
						String line = br.readLine();                     //将客户端写过来的数据，读取出来
						line = new StringBuilder(line).reverse().toString();  
						//链式编程，将字符串（line）转换成字符串缓冲区（StringBuilder），再反转，再重新转换为字符串
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
