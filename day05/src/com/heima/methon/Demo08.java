package com.heima.methon;
/*定义一个方法，打印100-999之间水仙花数
要求：注释中写明需求
          注释中写明方法的返回值类型
          注释中写明方法的参数类型及个数
主方法中调用该方法，控制台输出水仙花数*/
public class Demo08 {

	public static void main(String[] args) {
		printFlower(999);

	}
	public static void printFlower(int n){
		for(int i = 100;i<=999;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			if(ge*ge*ge+bai*bai*bai+shi*shi*shi == i){
				System.out.println(i);
			}
		}
	}

}
