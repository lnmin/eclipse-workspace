package com.heima.otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         System.out.println(2.0 - 1.1);
		/*BigDecimal bd1 = new BigDecimal(2.0);     //���ַ�ʽ�ڿ����в��Ƽ�����Ϊ������ȷ
		BigDecimal bd2 = new BigDecimal(1.1);
		
		System.out.println(bd1.subtract(bd2));*/
		
		/*	BigDecimal bd1 = new BigDecimal("2.0");     //ͨ�������д����ַ����ķ�ʽ������ʱ�Ƽ�
			BigDecimal bd2 = new BigDecimal("1.1");
			
			System.out.println(bd1.subtract(bd2));*/
		
		BigDecimal bd1 = BigDecimal.valueOf(2.0);     //���ַ���Ҳ�Ƽ�
		BigDecimal bd2 = BigDecimal.valueOf(1.1);
		
		System.out.println(bd1.subtract(bd2));    //����
		

	}

}
