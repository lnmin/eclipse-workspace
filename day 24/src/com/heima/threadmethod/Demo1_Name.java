package com.heima.threadmethod;

public class Demo1_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		Thread t1 = new Thread() {
			
			public void run() {
				System.out.println(this.getName() + "...........................aag");
			}
		};
		t1.setName("李四");
		t1.start();
		
		new Thread() {
			public void run() {
				this.setName("张三");
				System.out.println(this.getName() + ".....cccc");
			}
		}.start();
	}

	private static void demo1() {
		new Thread("芙蓉") {                                           //通过构造方法给name赋值
			public void run() {
				System.out.println(this.getName() + "...aaaa");
			}
		}.start();
		new Thread("凤凰") {
			public void run() {
				System.out.println(this.getName() + "....bbbb");
			}
		}.start();
		
	}

}
