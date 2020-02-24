package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_Reflect {

	/**
	 * @param args
	 * 榨汁机（Juicer） 榨汁的案例
	 * 分别有水果(Fruit)苹果(Apple)香蕉(Banana) 桔子(Orange) 榨汁(squeeze)
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * 
	 */
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		//没有用反射，只是在说多态
		/*Juicer j = new Juicer();              //购买榨汁机
		j.run(new Apple());
		
		j.run(new Orange());          //Fruit f = new Orange;
		*/
		
		
		//用反射配置文件
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));    //使用BufferedReader 是因为 他可以读整行
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();    //父类引用指向子类对象 ， 水果引用指向了苹果对象         创建一个class类对象所表示的类的一个新实例
		Juicer j = new Juicer();
		j.run(f);
	}

}

interface Fruit{
	public void squeeze();
}
class Apple implements Fruit{
	public void squeeze() {
		System.out.println("榨出一杯苹果汁");
	}
}

class Orange implements Fruit{
	public void squeeze() {
		System.out.println("榨出一杯橘子汁儿");
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