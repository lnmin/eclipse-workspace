package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo01_SequenceInputStream {

	/**
	 * @param args
	 * ��������������
	 * SequenceInputStream(InputStream s1, InputStream s2)
	 * ���϶��������
	 * SequenceInputStream(Enumeration<? extends InputStream> e)
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		dmeo1();
		
//		demo2();
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<FileInputStream> v = new Vector<>();           //�������϶���
		v.add(fis1);                                          //��������洢����
		v.add(fis2);
		v.add(fis3);
		
		Enumeration<FileInputStream> en = v.elements();
		SequenceInputStream sis = new SequenceInputStream(en);  //��ö���е����������ϳ�һ��
		FileOutputStream fos = new FileOutputStream("d.txt");
		
		int b;
		while((b = sis.read()) != -1) {
			fos.write(b);
		}
		
		sis.close();
		fos.close();
		
	}

	private static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b ;
		while((b = sis.read()) != -1) {
			fos.write(b);
			
		}
		
		sis.close();             //sis�ڹرյ�ʱ�򣬻Ὣ���췽���д����������Ҳ���ر�
		fos.close();
	}

	private static void dmeo1() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int b1;
		while((b1 = fis1.read()) != -1) {
			fos.write(b1);
		}
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("b.txt");
		int b2;
		while((b2 = fis2.read()) != -1) {
			fos.write(b2);
		}
		fis2.close();
		fos.close();
	}

}