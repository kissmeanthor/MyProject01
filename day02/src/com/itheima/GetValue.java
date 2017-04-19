/*12345  你用% 和/ 的方式  获取个位上的数;
十位上的数,百位上的数,千位上的数,万位上的数; 
取出每位赋值给变量打印出来*/
package com.itheima;

public class GetValue {

	public static void main(String[] args) {
		int a = 12345%10;
		System.out.println("12345的个位数为"+a);
		int f = 12345%123/10;
		System.out.println("12345的十位数为"+f);
		int c = 12345/100%120;
		System.out.println("12345的百位数为"+c);
		int d = 12345/5000;
		System.out.println("12345的千位数为"+d);
		int b = 12345/10000;
		System.out.println("12345的万位数为"+b);	
	}

}
