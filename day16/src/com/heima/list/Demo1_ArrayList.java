package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayList {

	/*
	 * ����ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
	* ˼·�������¼��Ϸ�ʽ
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add("c");
		list.add("c");
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
	}
	
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList ();          //1�������¼���
		Iterator it = list.iterator();                 //2,���ݴ���ļ��ϣ��ϼ��ϣ���ȡ������
		
		while(it.hasNext()) {                          //�����ϼ���
			Object obj = it.next();                  //��¼סÿһ��Ԫ��
			if(!newList.contains(obj)) {             //����¼����в������ϼ����е�Ԫ��
				newList.add(obj);                     //����Ԫ�����
			}
		}
		
		return newList;
		
	}

}
