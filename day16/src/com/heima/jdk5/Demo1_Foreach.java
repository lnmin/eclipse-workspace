package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo1_Foreach {

	/*
	 * ��ǿfor����
	* �������Collection���ϵı���
* B:��ʽ��
* 
		for(Ԫ���������� ���� : �������Collection����) {
			ʹ�ñ������ɣ��ñ�������Ԫ��
		}
* C:������ʾ
	* ���飬���ϴ洢Ԫ������ǿfor����
* D:�ô�
	* �򻯱���
	* 
	* ��ǿ����ѭ���ײ��������ǵ����� Iterator
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//		demo2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("b");
		list.add("b");
		list.add("a");
		list.add("v");
		list.add("c");
		list.add("g");
		list.add("b");
		
		
		System.out.println(list);
		
		//1,��ͨ����ѭ��
		/*for (int i = 0; i < list.size(); i++) {
			if("b".equals(list.get(i))) {
				list.remove(i--);                  //ͨ������ɾ��Ԫ��
			}
		}*/
		
		//2,������ɾ��
		/*	Iterator<String> it = list.iterator();
			while(it.hasNext()) {
				if("b".equals(it.next())) {
					//list.remove("b");                  //�����ü��ϵ�ɾ����������Ϊ������������������޸Ļ���ֲ����޸��쳣
		        it.remove();		
				}
			}
			*/
		/*for(Iterator<String> it2 = list.iterator();it2.hasNext();) {
			if("b".equals(it2.next())) {
				//list.remove("b");                  //�����ü��ϵ�ɾ����������Ϊ������������������޸Ļ���ֲ����޸��쳣
		        it2.remove();		
			}
		}*/
		
		//3,��ǿ����ѭ��,��ǿ����ѭ������ɾ����ֻ�ܱ���
		/*for (String string : list) {
			if("b".equals(string)) {
				list.remove("b");
			}
		}*/
		
		System.out.println(list);
		
	}

	private static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("����",23));
		list.add(new Person("����",23));
		list.add(new Person("����",23));
		list.add(new Person("����",23));
		list.add(new Person("����",27));
		
	    for (Person person : list) {
			System.out.println(person);
		}
	}

	private static void demo1() {
		int[] arr = {11,22,33,44,55};
		/*for(int i : arr) {
			System.out.println(i);
		}*/
		for (int i : arr) {
			System.out.println(i);
		}
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (String string : list) {
			System.out.println(string);
		}
	}

}
