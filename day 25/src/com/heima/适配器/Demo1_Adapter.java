package com.heima.������;

public class Demo1_Adapter {

	/**
	 * @param args
	 * ³�������ģʽ
	 * ³����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

interface ����{
	public void ����();
	public void �();
	public void ײ��();
	public void ϰ��();
}

abstract class ����� implements ����{    //�����ɳ����ԭ���ǣ������������ഴ�����������Ϊ����Ҳû�����壬�������ǿյ�

	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void �() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ײ��() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ϰ��() {
		// TODO Auto-generated method stub
		
	}
	
}

class ³���� extends �����{
	public void ϰ��() {
		System.out.println("���δ�����");
		System.out.println("");
	}
}