package com.heima.homework;

import java.util.Arrays;

//定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value),
//功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)	
//对应的值改为value
public class Demo4_3 {

	public static void main(String[] args) {
		int []arr={7,8,9,15,52,63,45};
		fill(arr,2,3,4);
		System.out.println(Arrays.toString(arr));

	}
	public static void fill(int[] arr,int fromIndex,int toIndex,int value){
		for(int i=fromIndex;i<toIndex;i++){
			arr[i]=value;
		}
	}

}
