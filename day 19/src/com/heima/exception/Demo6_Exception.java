package com.heima.exception;

public class Demo6_Exception {
	/*
	 * throw�ķ�ʽ�����쳣
	 *      ���幦�ܷ���ʱ����Ҫ�ѳ��ֵ����Ⱪ¶�����õ�����ȥ����
	 *      ��ô��ͨ��throws�ڷ����ϱ�ʶ
	 * ������ʾ��
	 *      �����ֱ���ʾ����ʱ�쳣������ʱ�쳣���׳�
	 *      ����ʱ�쳣���׳����������д���
	 *      ����ʱ�쳣���׳����Դ���Ҳ���Բ�����
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
//            throw new Exception("����Ƿ�");

			throw new AgeOutOfBoundsException("NIANniannianl����Ƿ�");
		}
	}
	
	
}