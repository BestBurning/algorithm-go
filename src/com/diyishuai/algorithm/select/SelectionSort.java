package com.diyishuai.algorithm.select;

import com.diyishuai.algorithm.Sort;

import java.util.Arrays;

/**
 * 简单选择排序 -> 选择排序
 * 每次选择一个待排序列中最小的放在排好的序列的最后面
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/3/2
 * @midified By:
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
        return arr;
    }

    public static void main(String[] args) {
        new SelectionSort().main();
    }
}
