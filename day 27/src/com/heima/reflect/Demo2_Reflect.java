package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_Reflect {

	/**
	 * @param args
	 * ե֭����Juicer�� ե֭�İ���
	 * �ֱ���ˮ��(Fruit)ƻ��(Apple)�㽶(Banana) ����(Orange) ե֭(squeeze)
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//û���÷��䣬ֻ����˵��̬
		/*Juicer j = new Juicer();              //����ե֭��
		j.run(new Apple());
		
		j.run(new Orange());          //Fruit f = new Orange;
		*/
		
		
		//�÷��������ļ�
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));    //ʹ��BufferedReader ����Ϊ �����Զ�����
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();    //��������ָ��������� �� ˮ������ָ����ƻ������         ����һ��class���������ʾ�����һ����ʵ��
		Juicer j = new Juicer();
		j.run(f);
	}

}

interface Fruit{
	public void squeeze();
}
class Apple implements Fruit{
	public void squeeze() {
		System.out.println("ե��һ��ƻ��֭");
	}
}

class Orange implements Fruit{
	public void squeeze() {
		System.out.println("ե��һ������֭��");
	}
}

class Juicer{
	/*public void run(Apple a) {
		a.squeeze();
	}
	
	public void run(Orange o) {
		o.squeeze();
	}*/
	
	public void run(Fruit f) {
		f.squeeze();
	}
}