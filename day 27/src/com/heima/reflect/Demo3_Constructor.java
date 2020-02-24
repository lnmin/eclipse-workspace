package com.heima.reflect;

import java.lang.reflect.Constructor;

import com.heima.bean.Person;

public class Demo3_Constructor {

	/**
	 * @param args Class���newInstange()������ʹ�ø����޲εĹ��캯����������
	 * ���һ����û���޲εĹ��캯�����Ͳ������������࣬���Ե���Class���getConstructor(String.class,int.class)
	 * ������ȡһ��ָ���Ĺ��캯��Ȼ���ٵ���Constructor���newInstance("",20)������������
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws Exception 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("com.heima.bean.Person");
//		Person p = (Person) clazz.newInstance();    //ͨ���޲ι��촴������
//		System.out.println(p);  
		Constructor c = clazz.getConstructor(String.class, int.class);          //��ȡ�вι���
		Person p = (Person) c.newInstance("ZHNGSAN", 23);                      //ͨ���вι��촴������
		System.out.println(p);
	}

}
