package com.heima.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test3 {

	/*
	 * ������ʾ��
	 * 
	 * ģ�⶷����ϴ�ƺͷ��ƣ���û������
	 * 
	 * ������
	 * 1������һ�����϶��󣬽��˿��ƴ洢��ȥ
	 * 2��ϴ��
	 * 3������
	 * 4������
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ���˿ˣ���ʵ���Ǵ���һ�����϶��󣬽��˿��ƴ洢��ȥ
		String[] num = {"3","4","5","6","7","8","9","10","j","Q","K","A","2",};
		String[] color = {"����","����","��Ƭ","÷��"};
		HashMap<Integer, String> hm = new HashMap<>();              //�洢�������˿���
		ArrayList<Integer> list = new ArrayList<Integer>();         //�洢����
		int index = 0;
		
		//ƴ���˿��Ʋ��������˿��ƴ洢��hm��
		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index);                                //������0��51��ӵ�list������
				index++;
			}
		}
		//��С����ӵ�˫�м�����
		hm.put(index, "С��");
		list.add(index);                             //��52������ӵ�������
		index++;
		hm.put(index, "����");
		list.add(index);                              //��53��ӵ�������
		
		//ϴ��
		Collections.shuffle(list);
		
		//����
		TreeSet<Integer> gaojin = new TreeSet<Integer>();
		TreeSet<Integer> longwu = new TreeSet<Integer>();
		TreeSet<Integer> me = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();
		
		for(int i = 0 ;i < list.size(); i++) {
			if(i >= list.size() -3) {
				dipai.add(list.get(i));
			}else if(i % 3 == 0){
				gaojin.add(list.get(i));
			}else if(i % 3 ==1) {
				longwu.add(list.get(i));
			}else {
				me.add(list.get(i));
			}
		}
		
		//����
		lookPoker(hm, gaojin, "�߽�" );
		lookPoker(hm, longwu, "����" );
		lookPoker(hm, me, "��" );
		lookPoker(hm, dipai, "����" );
		
	
		
	}
	
	/*
	 * ����
	 * 1������ֵ����void
	 * 2�������б�HashMap,TreeSet,String name
	 */
	public static void lookPoker(HashMap<Integer, String> hm,TreeSet<Integer> ts, String name) {
		System.out.print(name + "�����ǣ�" );
		for (Integer i : ts) {                                //i������˫�м����е�ÿһ����
			System.out.print(hm.get(i) + " ");
		}
     	System.out.println("");
	}

}
