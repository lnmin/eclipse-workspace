package com.heima.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	/*
	 * ��������һ�����ϣ����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�

		
		*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add("a");                    //Object obj = new String();
		list.add("v");
		list.add("world");
		list.add("a");
		list.add("sg");
		list.add("aag");
		
		/*Iterator it = list.iterator();    //��ȡ������
		while(it.hasNext()) {             //�жϼ������Ƿ���Ԫ��
			String str = (String)it.next();  //����ת��
			if("world".equals(str)) {
				list.add("javaee");          //������ͬʱ������Ԫ�أ������޸�
			}
		}*/
		
		ListIterator lit = list.listIterator();   //��ȡ��������List�������У�
        while(lit.hasNext()) {
        	String str = (String)lit.next();       //����ת��
        	if("world".equals(str)) {
//        		list.add("javaee");              
                lit.add("javaee");        	
        	}
        }
		System.out.println(list);
		
	}

}
