package com.heima.methon;

import java.util.Scanner;

public class Demo06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个数:");
		int b = sc.nextInt();
		System.out.println("请输入第三个数:");
		int c = sc.nextInt();
		int d = getMax(a,b,c);
		System.out.println("最大值为:"+d);
	}
    public static int getMax(int a,int b,int c){
    	   if(a<b){
    		  a = b;
    		  if(a<c){
    			 a =c;
    		  }
    	   }
    	   if(a<c){
     		  a = c;
     		  if(a<b){
     			 a =b;
     			
     		  }
     	   }
    	   return a;
    	  
    }
			
}
 