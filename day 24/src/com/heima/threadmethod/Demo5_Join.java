package com.heima.threadmethod;

public class Demo5_Join {

	/**
	 * @param args
	 * join(),��ǰ�߳���ͣ���ȴ�ָ�����߳�ִ�н����󣬵�ǰ�߳��ټ���
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName() + "..aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100; i++) {
					if(i == 2) {
						try {
//							t1.join();
							t1.join(1);                  //���ָ����ʱ�䣬�����ƶ�ʱ��������߳̽���ִ��
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}           //�����ڲ�����ʹ�������ڷ����еľֲ�����ʱ��������final ����
					}
					System.out.println(getName() + "..bbb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
