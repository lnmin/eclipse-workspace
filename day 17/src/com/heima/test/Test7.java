package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.heima.bean.Student;

public class Test7 {

	/*
	 * 需求：键盘录入　５　个学生信息（姓名，语文成绩，数学成绩，英语成绩），按照总分从高到低输出控制台
	 * 
	 * 分析：
	 * １，定义一个学生类
	 * 　　　成员变量：姓名，语文成绩，数学成绩，英语成绩，总成绩
	 * 　　　成员方法：空参，有参构造，有参构造的参数：姓名，语文成绩，数学成绩，英语成绩
	 * 　　　　　　toString方法，在遍历集合中的Student对象引用的时候会显示属性值
	 * ２，键盘录入需要Ｓｃａｎｎｅｒ，创建键盘录入对象
	 * ３，创建ＴｒｅｅＳｅｔ集合对象，在ＴｒｅｅＳｅｔ的构造方法中传入比较器，按照总分比较
	 * ４，录入５个学生，所以以集合中的学生个数为判断条件，如果ｓｉｚｅ是小于５就进行存储
	 * ５，将录入的字符串切割，用逗号切割，会返回一个字符串数组，将字符串数组中从二个元素转换成ｉｎｔ数组，
	 * ６，将转换后的结果封装成Ｓｔｕｄｅｎｔ对象，将Ｓｔｕｄｅｎｔ添加到ＴｒｅｅＳｅｔ集合中
	 * ７，遍历ＴｒeeＳｅｔ集合打印每一个Ｓｔｕｄｅｎｔ对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩格式是：姓名，语文成绩，数学成绩，英语成绩");
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num = o2.getSum() - o1.getSum();
				return num == 0 ? 1 : num;
			}
		});
//		４，录入５个学生，所以以集合中的学生个数为判断条件，如果ｓｉｚｅ是小于５就进行存储
		while(ts.size() < 5) {
//			将录入的字符串切割，用逗号切割，会返回一个字符串数组，将字符串数组中从二个元素转换成ｉｎｔ数组，
			String line = sc.nextLine();
			try {
				String[] arr = line.split(",");
				int chinese = Integer.parseInt(arr[1]);
				int math = Integer.parseInt(arr[2]);
				int english = Integer.parseInt(arr[3]);
//			将转换后的结果封装成Ｓｔｕｄｅｎｔ对象，将Ｓｔｕｄｅｎｔ添加到ＴｒｅｅＳｅｔ集合中
				ts.add(new Student(arr[0],chinese,math,english));
				
			}catch(Exception e) {
				System.out.println("格式错误，正确的格式是：姓名，语文成绩，数学成绩，英语成绩");
			}
				
			}
		
		System.out.println("排序后的学生信息：");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
