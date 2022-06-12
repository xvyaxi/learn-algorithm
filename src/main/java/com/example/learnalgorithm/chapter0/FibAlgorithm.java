package com.example.learnalgorithm.chapter0;

/**
 * @program learn-algorithm
 * @description: 斐波那契数列
 * @author: xuyaxi
 * @create: 2022/06/12 16:49
 */
public class FibAlgorithm {

    public static void main(String[] args) {
        System.out.println(fib(20));
    }

    /**
     * 获取斐波那契数列的第n个数
     * @param num
     * @return
     */
    public static int fib(int num) {
        if (num == 1 || num == 2) return 1;
        return fib(num - 1) + fib(num - 2);
    }

    /**
     * 获取斐波那契数列的第n个数 改进版
     * @param num
     * @return
     */
    public static int fibUpgrade(int num) {
        if (num == 1 || num == 2) return 1;
        // 数组存储 fibUpgrade(num - 1)...
        int[] memo = new int[num];
        return 1;
    }
}
