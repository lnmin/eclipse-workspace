package com.heima.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test4 {

	/**
	 * @param args
	 * * ����������һ�����ð����,û�й��������ʱ��,
	 * ÿִ��һ�ξͻ��������ǻ��ж��ٴ�ʹ�û�����ѧ����IO��֪ʶ,
	 * ģ�����ð����,����10�λ���,ִ��һ�ξ���ʾһ�������м��λ���,
	 * �������������ʾ�빺������
	 * 
	 * ������
	 * 1�������������������������ΪҪʹ��readLine���������Ա�֤���ݵ�ԭ����
	 * 2�����������ַ���ת��Ϊint��
	 * 3����int�������жϣ��������0 ���ͽ��� һһд��ȥ�����������0������ʾ�빺������
	 * 4����if�ж���Ҫ��һһ�Ľ����ӡ���������ͨ�������д���ļ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		int times = Integer.parseInt(line);
		if(times > 0 ) {
			System.out.println("������" + times-- +"�λ���");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(times +"");
			fw.close();
		}else {
			System.out.println("�������ô����ѵ����빺������");
		}
		
		br.close();
	}

}
