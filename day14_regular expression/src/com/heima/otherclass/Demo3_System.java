package com.heima.otherclass;

public class Demo3_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		
//		demo3();
		int[] src = {11,22,33,44,55};
		int[] dest = new int[8];
		System.arraycopy(src, 0, dest, 0, src.length);   //���������ݿ���
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		

	}

	private static void demo3() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
			
		}
		long end = System.currentTimeMillis();  //��ȡ��ǰʱ��ĺ���ֵ 
		
		System.out.println(end - start);
	}

	private static void demo2() {
		System.out.println("12121-");
		System.exit(0);       //��0 ״̬���쳣��ֹ���˳�jvm
		System.out.println("1111111111");
	}

	private static void demo1() {
		new Demo();
		System.gc();                   //�����������������൱�ں������ఢ��
	}

}

class Demo {                            //��һ��Դ�ļ��в�������������public���ε���

	@Override
    public void finalize(){
		System.out.println("��������ɨ��");
	}              
	
	
	
	
}