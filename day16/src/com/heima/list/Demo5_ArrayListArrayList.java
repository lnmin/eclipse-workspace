package com.heima.list;

import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo5_ArrayListArrayList {
	
	/*
	 *  集合嵌套之ArrayList嵌套ArrayList
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		
		ArrayList<Person> first = new ArrayList<Person>();    //创建第一个班级
		first.add(new Person("李白",354));
		first.add(new Person("白居易",784));
		first.add(new Person("王维",304));
		first.add(new Person("王安石",340));
		first.add(new Person("辛弃疾",415));
		
		ArrayList<Person> second = new ArrayList<Person>();
		second.add(new Person("杨幂",23));
		second.add(new Person("ｂａｂｙ",23));
		second.add(new Person("付哥",23));
		second.add(new Person("dgag",23));
		
		//将班级添加到学科集合中
		list.add(first);
		list.add(second);
		
		//遍历学科集合
		for (ArrayList<Person> a : list) {
			for (Person p : a) {
				System.out.println(p);
			}
		}
	}

}
