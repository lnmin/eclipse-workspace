package com.heima.test;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	/**
	 * @param args
	 * * ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,����¼�����ݵ�����quitʱ���˳�

		������
		1����������¼�����
		2��������������󣬹���text.txt�ļ�
		3����������ѭ��
		4������quit�˳�ѭ��
		5�������quit���ͽ�����д��
		6���ر���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");
		System.out.println("���������ݣ�");
		
		while(true) {
			String line = sc.nextLine();
			if("quit" .equals(line)) {
				break;
			}
			fos.write(line.getBytes());                       //�ַ���д������ת�����ֽ�����
			fos.write("\r\n".getBytes());
		}
		
		fos.close();
	}

}
