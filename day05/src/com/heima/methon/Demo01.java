package com.heima.methon;

public class Demo01 {

	public static void main(String[] args) {
		System.out.println(sum(10,20));  		//静态方法调用不用创建对象,因为静态方法会随着main主方法一起加载

	}
	public static int sum(int a,int b){   //静态方法定义在main中 ,定义格式   public static 返回值类型 方法名(形式参数1,形式参数2){}
		int c = a+b;						
		return c;
	}

}
