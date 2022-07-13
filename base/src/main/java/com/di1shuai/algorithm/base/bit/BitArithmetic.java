package com.di1shuai.algorithm.base.bit;

/**
 * @author shea
 * @since 2022/7/12
 * 位运算
 *
 * 负数 取反+1
 *
 */
public class BitArithmetic {

    /**
     * 打印2进制
     */
    public static void print(int num){
        for(int i = 31; i >= 0 ; i--){
            System.out.print( (num & (1 << i)) == 0 ? "0":"1" );
        }
        System.out.println();
    }

    public static void  main(String[] args){
        print(1 << 31);
        print(1024);
        System.out.println("=============");
        print(-1);
        print(-0);
        print(0);
        System.out.println("=============");
        print(Integer.MAX_VALUE);
        print(Integer.MIN_VALUE);
        System.out.println("=============");
        print(-1024);
        print(-1024 >> 1);
        print(-1024 >>> 1);
    }



}
