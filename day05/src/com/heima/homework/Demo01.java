package com.heima.homework;

import java.util.Arrays;

/*1.求两个数据之和(整数和小数)
2.判断两个数据是否相等(整数和小数)
3.获取两个数中较大的值(整数和小数)
4.获取两个数中较小的值(整数和小数)
5.否能用一个方法实现3和4的两个功能*/
public class Demo01 {

	public static void main(String[] args) {
		System.out.println(sum(5,3));   //求两个整数的和
		System.out.println(sum(5.1,5.2));//两个小数求和
		System.out.println(compare(4,5));  //两个整数比较
		System.out.println(compare(3.5,3.5));//两个小数比较
		System.out.println(minNumber(5, 6));            //获取两个数较小的值
		System.out.println(maxNumber(5, 6));
		int[] arr = getNumber(15, 16);
		System.out.println(Arrays.toString(arr));
	}
	public static int sum(int a,int b){       //两个整数求和
		return a+b;
	}
	public static double sum(double a,double b){  //两个小数求和
		return a+b;
	}
	public static boolean compare(int a,int b){  //两个整数比较
			return a==b;
	}
	public static boolean compare(double a,double b){ //两个小数比较
		return a==b;
	}
	public static int minNumber(int a,int b){       //获取两个数较小的数
		return  a<b?a:b;
	}
	public static double minNumber(double a,double b){ //获取两个数较小的数
		return  a<b?a:b;
	}
	public static int maxNumber(int a,int b){       //获取两个数较大的数
		return  a>b?a:b;
	}
	public static double maxNumber(double a,double b){ //获取两个数较大的数
		return  a>b?a:b;
	}
	public static int[] getNumber(int a,int b){      //将两个结果赋值给数组,然后返回
				int c = a>b?a:b;
				int d = a<b?a:b;
				int []arr = {c,d};
				return arr;
	}
	
}
