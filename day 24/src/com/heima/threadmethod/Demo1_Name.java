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
		t1.setName("����");
		t1.start();
		
		new Thread() {
			public void run() {
				this.setName("����");
				System.out.println(this.getName() + ".....cccc");
			}
		}.start();
	}

	private static void demo1() {
		new Thread("ܽ��") {                                           //ͨ�����췽����name��ֵ
			public void run() {
				System.out.println(this.getName() + "...aaaa");
			}
		}.start();
		new Thread("���") {
			public void run() {
				System.out.println(this.getName() + "....bbbb");
			}
		}.start();
		
	}

}
