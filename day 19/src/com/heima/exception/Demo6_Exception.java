package com.heima.exception;

public class Demo6_Exception {
	/*
	 * throw的方式处理异常
	 *      定义功能方法时，需要把出现的问题暴露出来让调用者去处理
	 *      那么就通过throws在方法上标识
	 * 案例演示：
	 *      举例分别演示编译时异常和运行时异常的抛出
	 *      编译时异常的抛出必须对其进行处理
	 *      运行时异常的抛出可以处理也可以不处理
	 *      
	 */

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.setAge(-17);
		System.out.println(p.getAge());
	}

}

class Person{
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws AgeOutOfBoundsException{
		if(age > 0 && age <= 150) {
			
			this.age = age;
		}else {
//            throw new Exception("年龄非法");

			throw new AgeOutOfBoundsException("NIANniannianl年龄非法");
		}
	}
	
	
}