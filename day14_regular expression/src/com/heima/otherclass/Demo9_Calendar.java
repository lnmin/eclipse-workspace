package com.heima.otherclass;

import java.util.Calendar;

public class Demo9_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -1);                    //���ƶ����ֶν�����ǰ�� �� ����
		c.set(Calendar.YEAR, 2000);                  //�޸�ָ���ֶ�
		c.set(2000, 8, 9);                           //
		
		
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum((c.get(Calendar.MONTH)+1)) + "��"
				+ getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
		
	}
	private static void demo1() {
		Calendar c = Calendar.getInstance();     //��������ָ���������
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));  //ͨ���ֶλ�ȡ��
		System.out.println(c.get(Calendar.MONTH));  //ͨ���ֶλ�ȡ�£������´�0��ʼ���
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));   //���еڼ���
		System.out.println(c.get(Calendar.DAY_OF_WEEK));    //�����ǵ�һ�죬���������һ��
		
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum((c.get(Calendar.MONTH)+1)) + "��"
				+ getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	/*
	 * �����ڴ洢���н��в��
	 * 1������ֵ����String
	 * 2�������б� int week
	 * 
	 * 
	 * 
	*/
	public static String getWeek(int week) {
		String[] arr = {"","������","����һ","���ڶ�","������","������","������","������"};
		return arr[week];
	}
	
	/*
	 * ����Ǹ�λ����ǰ�油0
	 * 1������ֵ����String����
	 * 2�������б�int num
	 * 
	*/
	
	public static String getNum(int num) {
		/*if(num > 9) {
			return "" + num;
		}else {
			return "0" + num;
		}*/
		return num > 9 ? "" + num : "0" + num;
		
	}
	
	
	
	
	
}
