package com.heima.test;

public class Test3 {

	/**
	 * @param args
	 * A:������ʾ
	* public void setProperty(Object obj, String propertyName, Object value){}��
	* �˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue��
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 * @throws NoSuchFieldException 
	 */
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Student s = new Student("����",23);
		System.out.println(s);
		
		Tool t = new Tool();
		t.setProperty(s, "name", "��ʤ��");
		System.out.println(s);
	}

}

class Student{
	private String name;
	private int age;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
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

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}