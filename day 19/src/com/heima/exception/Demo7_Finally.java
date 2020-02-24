package com.heima.exception;

public class Demo7_Finally {

	/*
	 * finally 用于释放资源，在IO流操作和数据库操作中会见到
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(10 / 2);
		}catch(Exception e) {
			System.out.println("除数为零了");
			System.exit(0);           //退出jvm虚拟机
		}finally {
			System.out.println("看看我执行了吗");
		}
	}

}
