package com.heima.generic;

import java.util.ArrayList;

import com.heima.bean.Person;
import com.heima.bean.Student;

public class Demo5_Generic {
	/*
	 *��A:����ͨ���<?>
	* �������ͣ����û����ȷ����ô����Object�Լ������Java����
*�������� B:? extends E
	* �����޶���E��������
* ��������C:? super E
	* �����޶���E���丸��
	 *
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<?> list = new ArrayList<Integer>();    //���ұߵķ����ǲ�ȷ��ʱ����߿���ָ��Ϊ��
		ArrayList<Person> list1 = new ArrayList<>();
		list1.add(new Person("����",23));
		list1.add(new Person("����",24));
		list1.add(new Person("����",25));
		list1.add(new Person("����",26));
		
		ArrayList<Student> list2 = new ArrayList<>();
		list2.add(new Student("����",45));
		list2.add(new Student("zhouqi",45));
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}
