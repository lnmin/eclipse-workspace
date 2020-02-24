package com.heima.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * ArrayList<Integer>的一个对象，在这个集合中添加一个字符串数据，如何实现呢？
	 * 泛型只在编译期有效,在运行期会被擦除掉
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		
		Class clazz = Class.forName("java.util.ArrayList");              //获取字节码对象
		Method m = clazz.getMethod("add", Object.class);                 //获取add方法
		m.invoke(list, "abc");
		
		System.out.println(list);
		
	}

}
