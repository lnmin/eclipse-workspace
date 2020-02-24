package com.heima.模板方法设计模式;

public class Demo1_Template {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*long start = System.currentTimeMillis();
		for(int i = 0; i< 1000000; i++) {
			System.out.println("x");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);*/
		Demo d = new Demo();
		System.out.println(d.getTime());
		
		
	}

}


abstract class GetTime{
	public final long getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		
		return end - start;
	}

	public abstract void code();
}

class Demo extends GetTime{

	@Override
	public void code() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i< 100000) {
			System.out.println("x");
			i++;
		}
	}
	
}