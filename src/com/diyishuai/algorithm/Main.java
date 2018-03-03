package com.diyishuai.algorithm;

import com.diyishuai.algorithm.insert.BinaryInsertSort;
import com.diyishuai.algorithm.insert.InsertSort;
import com.diyishuai.algorithm.insert.ShellSort;
import com.diyishuai.algorithm.swap.BubbleSort;
import com.diyishuai.algorithm.swap.QuickSort;

/**
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/3/2
 * @midified By:
 */
public class Main {
    public static void main(String[] args) {
        //插入排序
        System.out.println("------------- 插入排序 -------------");
        new InsertSort().main();
        new BinaryInsertSort().main();
        new ShellSort().main();
        System.out.println();
        //交换排序
        System.out.println("------------- 交换排序 -------------");
        new BubbleSort().main();
        new QuickSort().main();

    }
}
