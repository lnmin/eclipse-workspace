package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test1 {

	/**
	 * @param args
	 * ��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
	 * 
	 * ������
	 * 1�������������������
	 * 2���������϶���
	 * 3�������������ݴ洢�ڼ�����
	 * 4�����ű������Ͻ�����д���ļ���
	 * 5������
	 * @throws IOException 
	 * 
	 * ע�����
	 * ���������������
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("revzzz.txt"));
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}
		
		
		bw.close();
		
	}

}