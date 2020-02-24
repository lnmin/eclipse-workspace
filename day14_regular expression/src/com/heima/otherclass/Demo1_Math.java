package com.heima.otherclass;

public class Demo1_Math {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));   //取绝对值
		
		
		
		//ceil 天花板
		/*
		 * 13.0
		 * 12.3
		 * 12.0
		
		*/
		System.out.println(Math.ceil(12.3));  //向上取整，但是结果是一个double
		System.out.println(Math.ceil(12.99));
		
		//floor地板
		System.out.println(Math.floor(2.3));  //向下取整，但是结果是一个double
		
		
		//获取两个值中的最大值
		System.out.println(Math.max(20, 10));
		
		//前面的数是底数，后面的数是指数
		System.out.println(Math.pow(2, 3));     //2.0 ^ 3.0
		
		//生成0.0 到 1.0 之间的所有小数，包括0.0 ，不包括1.0
		System.out.println(Math.random());
		
		//四舍五入
		System.out.println(Math.round(12.3f));
		System.out.println(Math.round(12.9f));
		
		
		System.out.println(Math.sqrt(4));
		
	}
	

}
