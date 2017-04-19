package com.heima.homework;

import java.util.Scanner;

/*1.键盘录入长方形的长和宽
定义方法计算该长方形的周长,并在main方法中打印周长
2.键盘录入长方形的长和宽
定义方法计算该长方形的面积,并在main方法中打印面积
3.键盘录入圆的半径
定义方法计算该圆的周长,并在main方法中打印周长   2πr
4.键盘录入圆的半径
定义方法计算该圆的面积,并在main方法中打印面积 πr^2*/   
public class Demo02 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("请键入长方形的长:");
		int a = sc.nextInt();
		System.out.print("请键入长方形的宽:");
		int b = sc.nextInt();
		System.out.print("请键入圆的半径:");
		int c =sc.nextInt();
		System.out.println("长方形的的周长为:"+peri(a,b));
		System.out.println("长方形的面积为:"+area(a,b));
		System.out.println("圆形的周长为:"+periCircle(c));
		System.out.println("圆形的面积为:"+areaCircle(c));
	}
	public static int peri(int a,int b){    //周长
			return (a+b)*2;
	}
	public static int area(int a,int b){
		return a*b;
	}
	public static double periCircle(int a){
		return  3.14*2*a;
	}
	public static double areaCircle(int a){
		return a*a*3.14;
	}
}
