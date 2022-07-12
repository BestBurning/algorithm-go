package com.di1shuai.algorithm.insert;

import com.di1shuai.algorithm.Sort;

import java.util.Arrays;

/**
 * 希尔排序 --> 插入排序
 * 分成数个等差数组的插入排序 gap:间隔
 * 不断缩小gap直至为1（全排序）
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/3/2
 * @midified By:
 */
public class ShellSort implements Sort {


    @Override
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            System.out.print(gap+" : ");
            for (int i = gap; i < arr.length; i++) {
                System.out.print(i + " ");
                int temp = arr[i];
                for (int j = i; j-gap>=0 && temp<arr[j-gap]; j-=gap) {
                    swap(arr, j, j - gap);
                }
            }
            System.out.println();
            printData(arr);
        }
        return arr;
    }

    public static void main(String[] args) {
        new ShellSort().main();
    }
}
