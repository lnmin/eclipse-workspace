package com.heima.regex;

public class Demo7_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1(); 
//		demo2();
		/*替换
		需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
		将字符串还原成:“我要学编程”。
		*/
		String s = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String s2 = s.replaceAll("\\.","");
		String s3 = s2.replaceAll("(.)\\1+", "$1");  //$1代表第一组中的内容
		System.out.println(s3);
		
		
	}

	private static void demo2() {
		// 需求 切割：“sdqqfgkkkfagppppga”;
		String s = "sdqqfgkkkfagppppga";
		String regex = "(.)\\1+";     // +代表出现一次到多次
		String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void demo1() {
		//叠词  快快乐乐
		String regex = "(.)\\1(.)\\2";   // \\1 代表第一组又出现一次    \\2 代表第二组又出现一次
		System.out.println("kkll".matches(regex));
	}

}
