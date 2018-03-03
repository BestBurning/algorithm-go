package com.diyishuai.algorithm.insert;

import com.diyishuai.algorithm.Sort;

import java.util.Arrays;

/**
 * 直接插入排序 -> 插入排序
 * 有序 待排
 * 循环向前
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/3/2
 * @midified By:
 */
public class InsertSort implements Sort {

    @Override
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 1; i <= arr.length-1; i++) {
            if (arr[i] < arr[i-1]){
                //如果后者小于前者，则需要将后者插入前面的有序列表中
                int temp = arr[i];
                for (int j = i-1; j >= 0 && temp < arr[j] ; --j) {
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        new InsertSort().main();
    }

}
