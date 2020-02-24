package com.stx.p2;

import java.util.Scanner;

public class Demo_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("充值200");
		System.out.println("(1.是　　2.否)在网３个月以上");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("(1.是　　2.否)无优惠套餐？");
			int ii = sc.nextInt();
			if(ii  ==1) {
				System.out.println("(1.是　　2.否)充值后不停机");
				int iii = sc.nextInt();
				if(iii == 1) {
					System.out.println("充值成功，下发赠送５０话费提醒");
				}else {
					System.out.println("充值成功，下发不赠送话费提醒");
				}
			}else {
				System.out.println("充值成功，下发不赠送话费提醒");
			}
		}else {
			System.out.println("充值成功，下发不赠送话费提醒");
		}
	}

}
