package com.heima.homework;

import java.util.Arrays;

/*定义一个方法copyOfRange(int[] arr,int from, int to),
功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中
,并将新数组返回*/
public class Demo4_5 {

	public static void main(String[] args) {
		int []arr = {15,15,13,14,15,17,18};
		arr=copyOfRange(arr,1,4);
		System.out.println(Arrays.toString(arr));

	}
	public static int[] copyOfRange(int[] arr,int from, int to){
		int[]arr1 = new int[to-from];   //3
		for(int i =0;i<arr1.length;i++){   //3  
			arr1[i]=arr[from];
			from++;
         }
		/*for (int i = 0; i < arr1.length; i++,from++) {
			arr1[i] = arr[from];
		}*/
		return arr1;
    }
}