package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_ArrayList {

	/*
	 * 案例演示
	* 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
*    B:注意事项
	* 重写equals()方法的
	* 
	* contains方法判断是否包含，底层依赖的是equals方法
	* remove方法判断是否删除，底层依赖的也是equals 方法
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("张三",23));
		list.add(new Person("张三",23));
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
		list.remove(new Person("张三",23));
		System.out.println(list);

	}

	
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList ();          //1，创建新集合
		Iterator it = list.iterator();                 //2,根据传入的集合（老集合）获取迭代器
		
		while(it.hasNext()) {                          //遍历老集合
			Object obj = it.next();                  //记录住每一个元素
			if(!newList.contains(obj)) {             //如果新集合中不包含老集合中的元素
				newList.add(obj);                     //将该元素添加
			}
		}
		
		return newList;
		
	}
}
