package com.heima.exception;

public class Demo2_Exception {

	/*
	 * 异常处理的两种方式：
	 *     a, try...cath...finally
	 * 
	 * 
	 * try:用来检测异常
	 * catch:用来捕获异常
	 * finally:释放异常
	 * 
	 * 世界上最真情的相依就是你在try我在catch,无论你发什么脾气，我都静静接受，默默处理
	 * 当通过try catch 将问题处理了，程序会继续执行
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d = new Demo2();
		try {
			int x = d.div(10, 0);
			System.out.println(x);
			
		}catch(ArithmeticException a){        //ArithmeticException a = new ArithmeticException();
			System.out.println("出错了，除数为0了");
		}
		
	}

}
class Demo2{
	public int div (int a, int b) {
		return a/b;
	}
	
}