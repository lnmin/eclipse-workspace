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
		//在指定时间安排指定任务
		//第一个参数，是安排任务，第二个参数是执行的时间，第三个参数是过多长时间再重复执行
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
		System.out.println("起床背英文单词！");
	}
	
}
