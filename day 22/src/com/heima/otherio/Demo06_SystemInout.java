package com.heima.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Demo06_SystemInout {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		dmeo1();
		System.setIn(new FileInputStream("a.txt"));       //�ı��׼������
		System.setOut(new PrintStream("b.txt"));           //�ı��׼�����
		
		InputStream is = System.in;                      //��ȡ��׼�ļ�����������Ĭ��ָ����̣��ı��ָ���ļ�
		PrintStream ps = System.out;                     //��ȡ��׼�������Ĭ��ָ����ǿ���̨���ı���ָ���ļ�
		
		int b;
		while((b = is.read()) != -1) {
			ps.write(b);
		}
//		System.out.println();                     //Ҳ��һ������������ùأ���Ϊû�к�Ӳ���ϵ��ļ����������Ĺܵ�
		is.close();
		ps.close();
	}

	private static void dmeo1() throws IOException {
		InputStream is =System.in;
		int x = is.read();
		System.out.println(x);
		
		is.close();
	}

}
