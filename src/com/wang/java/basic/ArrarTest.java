package com.wang.java.basic;


public class ArrarTest {

	public static void main(String[] args) {

		int[] arr=new int[]{10,6,13,82,21};
		
		System.out.println(getMaxValueFromIndex(arr));
		
		System.out.println(getMaxValueFromElement(arr));
		
	
		printArr(arr);
		
		selectSort(arr);
		
		printArr(arr);
	}
	
	private static void printArr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			if((arr.length-1)==i){
				System.out.println(arr[i]+"]");
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}


	/**
	 * 选择排序
	 * 思想
	 * 第一个元素和后面的所有元素作比较,升序,较小的元素排在前面
	 * 第二个元素和后面的所有元素作比较
	 * 第三个元素也是这样
	 * @param arr
	 */
	private static void selectSort(int[] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				swap(arr, i, j);
			}
		}
	}


	private static void swap(int[] arr, int i, int j) {
		if(arr[i]>arr[j]){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}






	/**
	 * 获取数组中的最大值从元素
	 * 思想  
	 * 默认数组中第一个元素作为最大值,如果第一个元素小于第二个元素,第二个元素为最大值
	 * @param arr
	 * @return
	 */
	private static int getMaxValueFromElement(int[] arr) {
		if(arr==null){
			throw new NullPointerException("数组为空");
		}
		int maxElement=arr[0];
		for(int e=1;e<arr.length;e++){
			if(maxElement<arr[e]){
				maxElement=arr[e];
			}
		}
		
		return maxElement;
		
	}

	/**
	 * 获取数组中的最大值从索引
	 * @param arr
	 * @return
	 */
	private static int getMaxValueFromIndex(int[] arr) {
		if(arr==null){
			throw new NullPointerException("数组为空");
		}
		
		int arrIndex=0;
		for(int i=1;i<arr.length;i++){
			if(arr[arrIndex]<arr[i]){
				arrIndex=i;
			}
		}
		return arr[arrIndex];
	}

}
