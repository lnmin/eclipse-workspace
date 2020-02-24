package com.heima.chario;

public class Demo8_Digui {

	/**
	 * @param args
	 * 递归：方法自己调用自己
	 * 5！
	 * 
	 * 递归的弊端：不能调用次数过多，容易导致栈内存溢出
	 * 递归的好处：不用知道循环次数
	 * 
	 * 构造方法不能使用递归调用
	 * 不一定有返回值
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(10000));
	}
	
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num -1);
		}
	}

}
