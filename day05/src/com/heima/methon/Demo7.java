package com.heima.methon;

import java.util.Scanner;

/*定义一个方法传递一个整数（该整数大于1），在控制台打印1到该数据的值
要求：1.注释中写明需求
 	2.注释中明确返回值类型和参数列表
调用该方法，可以在控制台显示打印结果*/
public class Demo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正数,我们会打印1到这个整数的值");
		int n = sc.nextInt();
		printNumber(n);
	}
	public static void printNumber(int n){ 
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}

}
