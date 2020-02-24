package com.stx.p5;

public class Demo_p5 {

	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //递归
		//  第五个人的年龄是fn(5);
		System.out.println(fn(5));
		
	}
	public static int fn(int n) {
		if(n <= 1) {
			return 10;
		}else {
			return fn(n-1)+2;
		}
		
	}

}
