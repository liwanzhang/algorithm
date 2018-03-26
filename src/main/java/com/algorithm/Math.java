package com.algorithm;

/**
 * @author zhangwanli
 * @description
 * @date 2018-03-26 上午11:17
 */
public class Math {

    /**
     * 阶乘
     */
    static int factorial (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    /**
     *
     */
    public static int sum(int x){
        if(x<=0){
            return x;
        }
        return x+sum(x-1);
    }

}
