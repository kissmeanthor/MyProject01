package com.heima.homework;
/*1.定义一个方法equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)*/
public class Demo4_1 {
		public static void main(String[] args) {
			int[]arr1={4,5,6,7,};
			int[]arr2={4,5,6,7,8};	
			System.out.println("这两个数组是否相等:"+equals(arr1, arr2));
		}

        public static boolean equals(int[]arr1,int[]arr2){
			boolean a = false;
        	if(arr1.length==arr2.length){
					for(int i=0;i<arr1.length;i++){
						if(arr1[i]!=arr2[i]){
							break;
						}
						if(i==arr1.length-1){
							a = true;
						}
					}
				}
        	return a;
}
}