package com.heima.thread;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo3_Timer {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		//��ָ��ʱ�䰲��ָ������
		//��һ���������ǰ������񣬵ڶ���������ִ�е�ʱ�䣬�����������ǹ��೤ʱ�����ظ�ִ��
		t.schedule(new MyTimeTask(), new Date(120, 1, 14, 15, 40 ,55), 3000);
		
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}

}

class MyTimeTask extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�𴲱�Ӣ�ĵ��ʣ�");
	}
	
}
