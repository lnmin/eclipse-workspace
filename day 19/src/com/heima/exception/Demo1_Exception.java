package com.heima.exception;

public class Demo1_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		Demo d = new Demo();
		int x = d.div(10, 0);
		System.out.println(x);

	}

	private static void demo1() {
		int[] arr = {11,22,33,44,55};
		arr = null;
		System.out.println(arr[10]);
	}

}

class Demo{
	public int div (int a, int b) {
		return a/b;
	}
	
}