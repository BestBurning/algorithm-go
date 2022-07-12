package com.di1shuai.algorithm;

/**
 * 算法排序
 *
 * @author: Bruce Zhu
 * @description:
 * @date: 2018/3/2
 * @midified By:
 */
public interface Sort {

    int[] source = new int[]{4, 6, 5, 3, 9, 8, 2, 1, 10, 7};

    int[] sort(int[] sourceArray);

    default void printData(int[] source) {
        for (int i : source) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    default void swap(int[] source, int i, int j) {
        int temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }

    default void main() {
        System.out.println("==========="+this.getClass().getSimpleName()+"========");
        System.out.println("source : ");
        this.printData(source);
        System.out.println("sort :");
        this.printData(this.sort(source));
    }

}
