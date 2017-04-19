package com.heima.homework;

import java.util.Arrays;

/*2.定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value*/
public class Demo4_2 {

	public static void main(String[] args) {
		int []arr={4,5,6,7};
		System.out.println(Arrays.toString(arr));
		fill(arr,5);
		System.out.println(Arrays.toString(arr));
	}
	public static void fill(int[]arr,int value){
		for(int i = 0;i<arr.length;i++){
			arr[i]=value;
		}
	}

}
