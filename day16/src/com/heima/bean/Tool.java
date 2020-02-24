package com.heima.bean;

public class Tool<Q> {
	private Q q;

	public Q getObj() {
		return q;
	}

	public void setObj(Q q) {
		this.q = q;
	}
	

	public<T> void show(T t) {          //方法范型最好与类的范型一致
		System.out.println(t);       //如果不一致，需要在方法上声明该范型
	}
	
	public static<W> void print(W w) {     //静态方法必须声明自己的范型
		System.out.println(w);
	}

}
