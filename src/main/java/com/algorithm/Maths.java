package com.algorithm;

/**
 * @author zhangwanli
 * @description
 * @date 2018-03-26 上午11:17
 */
public class Maths {

    /**
     * 阶乘n! 递归
     */
    public static int factorialByRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialByRecursion(n - 1);
        }
    }
    /**
     * 阶乘n! 迭代
     */
    public static int factorialByIteration(int n) {
        int product = 1;
        for (int i = 2; i < n; i++) {
            product *= i;
        }
        return product;
    }

    /**
     * 求从1加到n
     */
    public static int sum(int x) {
        if (x <= 0) {
            return x;
        }
        return x + sum(x - 1);
    }

}
