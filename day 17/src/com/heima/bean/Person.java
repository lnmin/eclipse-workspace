package com.heima.bean;

public class Person implements Comparable<Person> {
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

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	/*
	 * 为什么是31？
	 * 1，31是一个质数，质数是能被1和自己整除的数
	 * 2，31这个数既不大也不小
	 * 3， 31这个数好算，2的五次方减1，2向左移动5位 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)                //调用对象和传入的对象是同一个对象
			return true;
		if (obj == null)                //传入的对象为null
			return false;
		if (getClass() != obj.getClass())  //判断两个对象对应的字节码文件是否是同一个字节码
			return false;                   //如果不是直接返回false
		Person other = (Person) obj;       //向下转型
		if (age != other.age)              //调用对象的年龄不等于传入对象的年龄
			return false;
		if (name == null) {                //调用对象的姓名为null
			if (other.name != null)           //传入对象的姓名不为null
				return false;                    //返回false
		} else if (!name.equals(other.name))   //调用对象的姓名不等于传入对象的姓名
			return false;
		return true; 
	}

	/*@Override
	//按照姓名排序
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int num = this.name.compareTo(o.name);  //姓名是主要条件
		
		return num == 0 ? this.age - o.age : num;
	}*/
	
    /*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * 
     */
	public int compareTo(Person o) {
		int length = this.name.length() - o.name.length();    //比较长度为主要条件
		int num = length == 0 ? this.name.compareTo(o.name) : length;   //比较内容为次要条件
		return num == 0 ? this.age - o.age : num;               //比较年龄为次要条件
	}
	
	/*@Override
	 * 按照年龄排序
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int num = this.age - o.age;    //年龄是比较的主要条件
		return num == 0 ? this.name.compareTo(o.name) : num;  //姓名是比较的次要条件
	}*/

	


	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		final int NUM = 38;
		return name.hashCode() * NUM + age;
	}*/
    
	
	
    

}
