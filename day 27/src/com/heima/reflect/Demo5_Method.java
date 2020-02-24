package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.heima.bean.Person;

public class Demo5_Method {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.heima.bean.Person");

		Constructor c = clazz.getConstructor(String.class, int.class);          //获取有参构造
		Person p = (Person) c.newInstance("ZHNGSAN", 23);                      //通过有参构造创建对象
		
		Method m = clazz.getMethod("eat");                          //获取eat方法
		m.invoke(p);
		
		Method m2 = clazz.getMethod("eat", int.class);              //获取有参的eat方法
		m2.invoke(p, 10);
	}

}
