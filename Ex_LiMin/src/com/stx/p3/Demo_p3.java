package com.stx.p3;

import java.util.Scanner;

public class Demo_p3 {
	/*
	 * 完成一个简易文章发布系统，功能如下：
            （1）系统启动后，提示用户输入文章标题数量n；
            （2）用户从控制台输入每篇文章的标题，直到n篇文章标题输入完成；
            （3）显示所有的文章标题，如果标题长度大于10，则只显示前10个字符。

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("计划输入的文章标题数量是：");
		Scanner sc = new Scanner(System.in);
		//将String转换为int
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		
		String[] arr = new String[n];
	
		for ( int i =0; i < arr.length ; i++) {
			System.out.println("输入第" + (i+1) + "章的标题：" );
			arr[i] = sc.nextLine();								
		}

		System.out.println("显示标题：");
		
		for ( int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ ".");
			//如果标题长度大于１０，只显示前１０个字符
			if(arr[i].length() > 10) {
			    
				System.out.println(arr[i].substring(0,10));   
			}else {
				System.out.println(arr[i]);
			}
			
		}
		
		
	}

	
	

}
