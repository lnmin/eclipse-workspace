package com.heima.thread2;

public class Demo4_ThreadGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		ThreadGroup tg = new ThreadGroup("����һ���µ��߳���");                  //�����µ��߳���
		MyRunnable mr = new MyRunnable();                                   //����Runnable���������
		
		Thread t1 = new Thread(tg, mr, "����");                 //���߳�t1��������
		Thread t2 = new Thread(tg, mr, "����");                 //���߳�t2��������
		
		System.out.println(t1.getThreadGroup().getName());     //��ȡ����
		System.out.println(t2.getThreadGroup().getName());
		
	}

	private static void demo1() {
		MyRunnable mr = new MyRunnable();
		
		Thread t1 = new Thread(mr, "�˵�");
		Thread t2 = new Thread(mr, "����");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());              //Ĭ�������߳�
		System.out.println(tg2.getName());
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i< 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "..." + i);
		}
	}
	
}