package com.heima.homework;

import java.util.Arrays;

/*4.定义一个方法copyOf(int[] arr, int newLength),
功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始*/
public class Demo_4 {

	public static void main(String[] args) {
		int []arr = {15,15,13,14,15,17,18};
		arr=copyOf(arr, 3);
		System.out.println(Arrays.toString(arr));

	}
	public static int[] copyOf(int[] arr, int newLength){
		int[]arr1 = new int[newLength];
		for(int i =0;i<newLength;i++){
			arr1[i]=arr[i];
		}
		return arr1;
	}
}
