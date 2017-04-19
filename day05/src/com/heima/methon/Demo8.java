package com.heima.methon;
/*定义重载的两个方法实现比较两个数据是否相等。
要求：
1.第一个方法的参数类型为两个int类型
2.第二个方法的参数类型为两个double类型
3.在main方法中进行测试*/
public class Demo8 {

	public static void main(String[] args) {
		System.out.println(compare(12,13));
		System.out.println(compare(13,13));
		System.out.println(compare(15.6,14.7));

	}
	public static boolean compare(int a,int b){
		return a==b;
	}
	public static boolean compare(double a,double b){
		return a==b;
	}

}
