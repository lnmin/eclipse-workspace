package com.heima.List;

import java.util.ArrayList;
import java.util.List;

public class Demo1_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//		demo2();
//		dmeo3();
//		demo4();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.set(1, "z");          //��ָ��λ�õ�Ԫ���޸�
		System.out.println(list);
		
	}

	private static void demo4() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		/*Object obj1 = list.get(0);
		System.out.println(obj1);*/
		
		//ͨ����������list����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	private static void dmeo3() {
		List list = new ArrayList();
		list.add(111);
		list.add(222);
		list.add(333);
		
//		list.remove(111);               //ɾ����ʱ�򲻻��Զ�װ�䣬��111��������
		System.out.println(list);
	}

	private static void demo2() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Object obj =  list.remove(1);       //ͨ������ɾ��Ԫ�أ�����ɾ����Ԫ�ط���
		System.out.println(obj);
		System.out.println(list);
	}

	private static void demo1() {
		List list = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(4,"z");       //index <= size ����index  >= 0 �����ᱨ�쳣
		
//		list.add(1,"e");
//		list.add(10,"z");    //����Խ���쳣
		System.out.println(list);
	}

}
