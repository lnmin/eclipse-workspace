package com.heima.枚举2;

public class Demo2_Enum {

	/**
	 * @param args
	 * int ordinal()       
	*  int compareTo(E o)
	*  String name()
	*  String toString()
	*  <T> T valueOf(Class<T> type,String name)
	*  
	*  values() 
	*      此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		Week2 mon = Week2.valueOf(Week2.class, "TUE");   //通过字节码对象,获取枚举项
//		System.out.println(mon);
		
		Week2[] arr = Week2.values();
		for (Week2 week2 : arr) {
			System.out.println(week2);
		}
	}

	private static void demo1() {
		Week2 mon = Week2.MON;
		Week2 tue = Week2.TUE;
		Week2 wed = Week2.WED;
		Week3 mon3 = Week3.MON;
		/*System.out.println(mon.ordinal());       //枚举项的编号，以 零 开始
		System.out.println(tue.ordinal());
		System.out.println(wed.ordinal());
		
		System.out.println(mon.compareTo(tue));           //比较编号
		System.out.println(mon.compareTo(wed));*/
		
		System.out.println(mon.name());                //获取实例名称
		System.out.println(mon.toString());              //调用重写之后的toString方法
		System.out.println(mon3.name());
	}

}
