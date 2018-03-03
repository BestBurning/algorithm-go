package com.diyishuai.algorithm.insert;

import com.diyishuai.algorithm.Sort;

import java.util.Arrays;

/**
 * 折半插入排序 -> 插入排序
 * 对直接插入排序的一种优化，优化在查找插入点时，采用折半查找
 *
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/3/2
 * @midified By:
 */
public class BinaryInsertSort implements Sort {
    @Override
    public int[] sort(int[] source) {
        int[] arr = Arrays.copyOf(source, source.length);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                //后者小于前者，需要插入前面的有序列表
                int temp = arr[i];
                int low = 0;
                int high = i - 1;
                int mid = (low + high) / 2;
                while (low <= high) {
                    mid = (low + high) / 2;
                    if (arr[mid] > temp)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
                for (int j = i-1; j >= mid; j--) {
                    swap(arr,j,j+1);
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        new BinaryInsertSort().main();
    }
}
