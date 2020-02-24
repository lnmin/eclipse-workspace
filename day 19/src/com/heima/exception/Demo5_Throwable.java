package com.heima.exception;

public class Demo5_Throwable {

	/*
	 * Throwable的几个常见方法
	 *      a: getMessage()
	 *          获取异常信息，返回字符串
	 *      b: toString()
	 *          获取异常类和异常信息，返回字符串
	 *      c： printStackTrace()
	 *          获取异常类名和异常信息，以及异常出现在程序中的位置，返回值 void
	 *          
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println( 1/0);
		} catch (Exception e) {        //Exception e = new ArithmeticException("/by zero") 
			// TODO: handle exception
//			System.out.println(e.getMessage());    //获取异常信息
//			System.out.println(e.toString());      //调用toString方法，打印异常类名和异常信息
			e.printStackTrace();                     //jvm默认就用这种异常
		}
	}

}
