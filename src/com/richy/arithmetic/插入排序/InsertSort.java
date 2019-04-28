package com.richy.arithmetic.插入排序;

import java.util.Arrays;

/**
 * @Desc：插入排序
 * 	原理：
 * 	1、首先假定数组的第一个元素是排好序的，然后每次需要插入的数据为insertNum=arr[i],i从下标1开始
 * 	2、每次循环，记住当前获取的插入数的位置int j = i;
 *  3、那么上一次排好序的最后一个元素为arr[j-1],通过insertNum和arr[j-1]进行比较
 *  4、如果选取的插入数表上一次的最后一位元素小，那么把上一次的最后一位数向右移动一位
 *  5、否则，当前位置就是该插入的数的位置，即arr[j] = insertNum;
 *  	注意：
 *  	 不能改变arr[i]，会影响整个排序，只能动i下标之前的元素
 * @author：Richy
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] arr = {32,43,23,13,7};
		InsertSort.insertSort(arr);
	}
	
	/**
	 * @Desc：插入排序代码实现
	 * @Author：richy
	 * @Year：2019
	 */
	public static void insertSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j = i;
			int insertNum = arr[i];
			while(j > 0 && insertNum < arr[j-1]) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = insertNum;
		}
		System.out.println(Arrays.toString(arr));
	}
}
