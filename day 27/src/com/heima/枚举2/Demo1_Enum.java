package com.heima.ö��2;

public class Demo1_Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		
//		demo2();
		
//		dmeo3();
		
		Week3 mon = Week3.MON;
		switch(mon) {
		case MON:
			System.out.println("xingqiyi");
			break;
		case TUE:
			System.out.println("XINGQIER");
			break;
		
		}
		
	}

	private static void dmeo3() {
		Week3 mon = Week3.MON;
		mon.show();
	}

	private static void demo2() {
		Week2 mon = Week2.MON;
		System.out.println(mon.getName());
	}

	private static void demo1() {
		Week mon = Week.Mon;
		System.out.println(mon);
	}

}
