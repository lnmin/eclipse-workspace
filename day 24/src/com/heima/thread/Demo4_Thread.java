package com.heima.thread;

public class Demo4_Thread {

	/**
	 * @param args
	 * �����ڲ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {                                          //�̳�Thread��
			public void run() {                                 //��дrun����
				for (int i = 0; i < 1000; i++) {                //��Ҫִ�еĴ���д��run������
					System.out.println("1aaaaaaaaaaaa");
				}
			}
		}.start();                                               //�����߳�
		
		
		new Thread(new Runnable() {                            //��Runnable��������󴫵ݸ�Thread�Ĺ��췽��
			public void run() {                                //��дrun����
				for (int i = 0; i < 1000; i++) {                //��Ҫִ�еĴ���д��run������
					System.out.println("bbbbbbbbbbbbbbbbbbbbb");
				}
			}
		}).start();                                             //�����߳�
	}

}
