package com.heima.regex;

public class Demo7_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1(); 
//		demo2();
		/*�滻
		��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
		���ַ�����ԭ��:����Ҫѧ��̡���
		*/
		String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s2 = s.replaceAll("\\.","");
		String s3 = s2.replaceAll("(.)\\1+", "$1");  //$1�����һ���е�����
		System.out.println(s3);
		
		
	}

	private static void demo2() {
		// ���� �и��sdqqfgkkkfagppppga��;
		String s = "sdqqfgkkkfagppppga";
		String regex = "(.)\\1+";     // +�������һ�ε����
		String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void demo1() {
		//����  �������
		String regex = "(.)\\1(.)\\2";   // \\1 �����һ���ֳ���һ��    \\2 ����ڶ����ֳ���һ��
		System.out.println("kkll".matches(regex));
	}

}
