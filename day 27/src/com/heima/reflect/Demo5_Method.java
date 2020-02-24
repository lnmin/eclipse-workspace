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

		Constructor c = clazz.getConstructor(String.class, int.class);          //��ȡ�вι���
		Person p = (Person) c.newInstance("ZHNGSAN", 23);                      //ͨ���вι��촴������
		
		Method m = clazz.getMethod("eat");                          //��ȡeat����
		m.invoke(p);
		
		Method m2 = clazz.getMethod("eat", int.class);              //��ȡ�вε�eat����
		m2.invoke(p, 10);
	}

}
