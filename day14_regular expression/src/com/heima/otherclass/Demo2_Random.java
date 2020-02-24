package com.heima.otherclass;

import java.util.Random;

public class Demo2_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
//			System.out.println(r.nextInt());
			System.out.println(r.nextInt(100)); 
		}
		
		
		/*
		 * 
		*/
		/*Random r2 = new Random(1000);
		
		int a = r2.nextInt();
		int b = r2.nextInt();
		
		System.out.println(a);
		System.out.println(b);*/
	}

}
