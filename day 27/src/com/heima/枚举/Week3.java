package com.heima.枚举;

public abstract class Week3 {
	
	public static final Week3 MON =  new Week3("星期一哎呀") {   //new Week3 是继承了这个抽象类，所以要写他的抽象方法
		public void show() {
			System.out.println("星期一好嗨哟");
		}
	};
	public static final Week3 TUE =  new Week3("星期二") {
		public void show() {
			System.out.println("星期二");
		}
	};
	public static final Week3 WED =  new Week3("星期三") {
		public void show() {
			System.out.println("星期三");
		}
	};
	
	private String name;
	private Week3(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void show();
	
}
