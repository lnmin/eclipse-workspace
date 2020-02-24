package com.heima.exception;

import java.io.FileInputStream;

public class Demo4_Exception {
	/*
	 * 编译时异常 也可以认为是 未雨绸缪异常，
	 *      未雨绸缪：在做某些事情的时候要做某些准备
	 *      编译时异常：在编译某个程序时，有可能会有这样那样的事情发生，比如文件找不见，这样的异常就必须在编译的时候处理，如果不处理编译通不过
	 *      
	 *      运行时异常：就是程序员所犯的错误，需要回来修改代码
	 *      
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileInputStream fis = new FileInputStream("xxx.txt");
		}catch(Exception e) {
			
		}
	}

}
