package com.heima.methon;
/*定义数组int arr = {1,2,3,4,5,6}
定义一个方法打印数组的内容
要求：
1.确定方法的参数列表
2.确定方法的返回值类型
3.打印结果为 [1,2,3,4,5,6]*/
public class Demo9 {

	public static void main(String[] args) {
		int []arr={12,25,32,12};
		arryList(arr);
	}
	public static void arryList(int[]arr){
		System.out.print("[");
		for(int i = 0;i<arr.length;i++){
			if(i == arr.length-1){
				System.out.print(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}

}
