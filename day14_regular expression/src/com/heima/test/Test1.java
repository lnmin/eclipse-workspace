package com.heima.test;

import java.util.Arrays;

public class Test1 {
	/*
	* A:案例演示
	* 需求：我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是：”27 38 46 50 91”
	*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "91 27 46 38 50";
		String[] sArr = s.split(" ");  //将字符串切割成字符串数组
		int arr[] = new int[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sArr[i]);    //将数字字符串转换成数组
		}
		
		Arrays.parallelSort(arr);
		
		/*
		 * String str = " "; for (int i = 0; i < arr.length; i++) { if(i ==
		 * arr.length-1) { str = str + arr[i]; }else { str = str +arr[i] + " "; }
		 * 
		 * } System.out.println(str);
		 */
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i] + " ");
			}
		}
		System.out.println(sb);

	}

}
