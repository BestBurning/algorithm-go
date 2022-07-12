package com.di1shuai.algorithm.swap;

import com.di1shuai.algorithm.Sort;

import java.util.Arrays;

/**
 * 冒泡排序 -> 交换排序
 * 一轮冒一个上去
 * 最坏情况共执行n-1轮
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/2/28
 * @midified By:
 */
public class BubbleSort implements Sort {
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 0; i < arr.length-1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }
            //未发生交换，说明列表已经有序
            if(isSwap == false)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        new BubbleSort().main();
    }
}
