package com.heima.homework;

import java.util.Scanner;

/*1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
3.在main方法中打印该数字是几位数
4.演示格式如下:
	(1)演示一:
		请输入一个整数:1234
		控制台输出:1234是4位数字
	(2)演示二:
		请输入一个整数:-34567*/
public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)");
		int a = sc.nextInt();
		System.out.println(a+"是"+getBin(a)+"位数字");
	}
	public static int getBin(int a){
		int i =0;
		for(i = 1;;i++){             	//判断是几位数字
			if(a/10==0){
			 break;
			}else{
				a = a/10;
			}
		}
		
		return i;						//返回几位数字
	}

}
