package com.heima.otherclass;

public class Demo3_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		
//		demo3();
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		System.arraycopy(src, 0, dest, 0, src.length);   //将数组内容拷贝
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		

	}

	private static void demo3() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
			
		}
		long end = System.currentTimeMillis();  //获取当前时间的毫秒值 
		
		System.out.println(end - start);
	}

	private static void demo2() {
		System.out.println("12121-");
		System.exit(0);       //非0 状态是异常终止，退出jvm
		System.out.println("1111111111");
	}

	private static void demo1() {
		new Demo();
		System.gc();                   //运行垃圾回收器，相当于呼喊保洁阿姨
	}

}

class Demo {                            //在一个源文件中不允许定义两个用public修饰的类

	@Override
    public void finalize(){
		System.out.println("垃圾被清扫了");
	}              
	
	
	
	
}