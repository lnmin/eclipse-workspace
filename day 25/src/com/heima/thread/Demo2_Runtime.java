package com.heima.thread;

import java.io.IOException;

public class Demo2_Runtime {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();          //获取运行对象
//		r.exec("shutdown -s -t 300");
		r.exec("shutdown -a");
	}

}
