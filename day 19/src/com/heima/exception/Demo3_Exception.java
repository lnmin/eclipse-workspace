package com.heima.exception;

public class Demo3_Exception {

	/*
	 * try...catch 处理多个异常
	 * 
	 * JDK7以后处理多个异常的方式及注意事项
	 * 
	 * 安卓，客户端开发，如何处理异常？ try{}catch(Exception e){}
	 * ee,服务端开发，一般都是底层开发，从底层向上抛
	 * 
	 * try如果后面跟多个catch，那么小的异常放前面，大的异常放后面，根据多态的原理
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		//JDK7如何处理多个异常
		
		try {
			System.out.println(a / b);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("出错了");
		}
	}

	private static void demo1() {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		try {
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
			System.out.println("除数不能为0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("出错了");
		}
		
		System.out.println("over");
	}

}
