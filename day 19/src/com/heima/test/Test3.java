package com.heima.test;

import java.io.File;
import java.io.FilenameFilter;

public class Test3 {

	/**
	 * �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("C:\\Users\\lnmin\\Documents\\Tencent Files\\78246686\\Image\\C2C");
		
		/*String[] arr = dir.list();                     //��ȡE�������е��ļ����ļ���
		for (String string : arr) {
			if(string.endsWith(".png")) {
				System.out.println(string);
			}
		}*/
		
		/*File[] subFiles = dir.listFiles();      //��ȡ���������е��ļ����ļ��ж���
		
		for (File file : subFiles) {
			if(file.isFile() && file.getName().endsWith(".jpg")) {
				System.out.println(file);
			}
			
		}*/
		
	    String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
	    
	    for (String string : arr) {
			System.out.println(string);
		}
		
		
	}

}
