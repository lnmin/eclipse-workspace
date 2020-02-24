package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2_ArrayList {

	/*
	 * ������ʾ
	* ����ArrayListȥ���������Զ������Ԫ�ص��ظ�ֵ(����ĳ�Ա����ֵ��ͬ)
*    B:ע������
	* ��дequals()������
	* 
	* contains�����ж��Ƿ�������ײ���������equals����
	* remove�����ж��Ƿ�ɾ�����ײ�������Ҳ��equals ����
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		list.add(new Person("����",23));
		list.add(new Person("����",24));
		list.add(new Person("����",23));
		list.add(new Person("����",23));
		
		ArrayList newList = getSingle(list);
		System.out.println(newList);
		list.remove(new Person("����",23));
		System.out.println(list);

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
