package com.diyishuai.algorithm.swap;

import com.diyishuai.algorithm.Sort;

import java.util.Arrays;

/**
 * 快速排序 -> 交换排序
 * 是对冒泡排序的一种改进，基本思想是分治法
 *  取列表第一个元素为参考值pivot
 *  将列表分按与pivot的大小为左右两个区域，即
 *  小 pivot 大
 *  递归的继续划分
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/2/28
 * @midified By:
 */
public class QuickSort implements Sort {

    public int[] sort(int[] sourceArray){
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        return quickSort(sourceArray, 0, sourceArray.length - 1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }


    public static void main(String[] args) {
        new QuickSort().main();
    }
}
