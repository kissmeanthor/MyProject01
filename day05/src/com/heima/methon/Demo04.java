package com.heima.methon;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean result = compare(x,y);
		System.out.println("两个数"+result+"相等");
	}
	public static boolean compare(int a,int b){  //方法对两个数是否相等进行比较,参数类型为int,返回值类型为boolean
		return a==b;
		}
	}


