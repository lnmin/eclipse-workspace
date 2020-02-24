package com.heima.exception;

public class Demo8_Exception {

	/*
	 * 为什么要自定义异常
	 *     通过名字区分到底是什么异常
	 *     举例 ：人的年龄
	 * 自定义异常概述
	 *      继承自Exception
	 *      继承自RuntimeException
	 *      
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class AgeOutOfBoundsException extends Exception{

	public AgeOutOfBoundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}