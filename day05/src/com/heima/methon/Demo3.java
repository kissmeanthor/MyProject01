package com.heima.methon;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);  //创建输入对象
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		System.out.println("请输入第二个数");
		int b = sc.nextInt();
		int c = getMax(a, b);					//调用方法
		System.out.println("较大值为"+c);
	}
	public static int getMax(int a,int b){  //明确参数列表 int类型的返回值   
		if(a>b){							//比较后返回值
			return a;
		}else{
			return b;
		}
	}

}
