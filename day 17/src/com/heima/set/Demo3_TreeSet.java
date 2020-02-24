package com.heima.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.Person;



public class Demo3_TreeSet {
	
	/*
	 * TreeSet�����������ԡ������������ģ�ͬ����Ҳ���Ա�֤Ԫ��Ψһ
	 * 
	 * ��comparableTo�������ء�������ʱ�򣬼�����ֻ��һ��Ԫ��
	 * ��comparableTo�������ء���������ʱ�򣬼�����ô�����ôȡ
	 * ��comparableTo�������ء���������ʱ�򣬼��ϻᵹ��洢
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo��();
//		����();
//		demo3();
//		demo4();
		
		//���󣺽��ַ������ճ�������
		
		TreeSet<String> ts = new TreeSet<String>(new CompareByLen());      //Comparator c =new Comparator();
		ts.add("aaaaaaaaa");
		ts.add("zz");
		ts.add("b");
		ts.add("aghhh");
		ts.add("aaaahaharfhaaaaaa");
		
		System.out.println(ts);
	}

	private static void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����zag",27));
		ts.add(new Person("����a",23));
		ts.add(new Person("����ag",23));
		ts.add(new Person("����agaha",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",27));
		ts.add(new Person("����",23));
		ts.add(new Person("����",23));
		ts.add(new Person("����",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",26));
		
		System.out.println(ts);
	}

	private static void demo3() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����",27));
		ts.add(new Person("����",23));
		ts.add(new Person("����",23));
		ts.add(new Person("����",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",26));
		
		System.out.println(ts);
	}

	private static void ����() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����",27));
		ts.add(new Person("����",23));
		ts.add(new Person("����",23));
		ts.add(new Person("����",23));
		ts.add(new Person("����",23));
		ts.add(new Person("����",24));
		ts.add(new Person("����",25));
		ts.add(new Person("����",26));
		
		System.out.println(ts);
	}

	private static void demo��() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(7);
		ts.add(1);
		ts.add(2);
		ts.add(1);
		ts.add(8);
		ts.add(1);
		ts.add(7);
		
		System.out.println(ts);
	}

}


class CompareByLen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {    //�����ַ������ȱȽ�
		// TODO Auto-generated method stub
		int num = o1.length() - o2.length();       //����Ϊ��Ҫ����
		return num == 0 ? o1.compareTo(o2) : num;  //�����Ǵ�Ҫ����
	}
	
}
