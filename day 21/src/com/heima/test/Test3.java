package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test3 {

	/**
	 * @param args
	 * ��ȡһ���ı���ÿ���ַ����ֵĴ���,�����д��times.txt��
	 * 
	 * ������
	 * 1�����������������������
	 * 2������˫�༯�϶��� 
	 * 3�����������ַ��洢��˫�м����У��洢��ʱ��Ҫ�жϣ������������������ͽ�����1�洢�����������������ͽ��ü���ֵ��1�洢
	 * 4���ر�������
	 * 5�����������
	 * 6���������Ͻ������е�����д��time��txt��
	 * 7���ر������
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		int ch;
		while((ch = br.read()) != -1) {
			char c = (char)ch;     //ǿ����ת��
			/*if(!tm.containsKey(c)) {
				tm.put(c, 1);
			}else {
				tm.put(c, tm.get(c) + 1);             //tm.get(c)  ����ֵ
			}*/
			tm.put(c, !tm.containsKey(c) ? 1 : tm.get(c) + 1);
		}
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"));
		
		for (Character key : tm.keySet()) {             //tm.keySet() ���ļ���
			switch (key) {
			case '\t':
				bw.write( "\\t=" + tm.get(key));
				break;
			
			case '\n':
				bw.write( "\\n=" + tm.get(key));
				break;
				
			case '\r':
				bw.write( "\\r=" + tm.get(key));
			default:
				bw.write(key + "=" + tm.get(key));            //д������ֵ
				break;
			}
			         
			bw.newLine();
		}
		
		bw.close();
	}

}
