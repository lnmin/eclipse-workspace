package com.heima.chario;

public class Demo6_Wrap {

	/**
	 * @param args
	 * 
	 * װ�����ģʽ�ĺô��ǣ�
	 * ����Բ�ǿ����װ�ε���ı仯��װ����ı仯�޹�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeiMaStudent hms = new HeiMaStudent(new Student());
		hms.Code();
	}

}


interface Coder{
	public void Code();
}
class Student implements Coder{

	@Override
	public void Code() {
		// TODO Auto-generated method stub
		System.out.println("javase");
		System.out.println("javaweb");
	}
	
}

class HeiMaStudent implements Coder{
	//1����ȡ��װ���������
	private Student s;           //��ȡѧ������
	
	//2���ڹ��췽���д��뱻װ����Ķ���
	public HeiMaStudent(Student s) {
		this.s = s;
		
	}

	//3����ԭ�еĹ��ܽ�������
	@Override
	public void Code() {
		// TODO Auto-generated method stub
		s.Code();
		System.out.println("ssh");
		System.out.println("���ݿ�");
		System.out.println("������");
		System.out.println("...");
	}
	
}