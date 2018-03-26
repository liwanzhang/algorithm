package com.algorithm;

import com.algorithm.util.PrintUtils;
import org.junit.Test;

/**
 * @author zhangwanli
 * @description
 * @date 2018-03-26 上午11:36
 */
public class MathsTest {

    @Test
    public void sumTest() {

        int s=4;
        int total= Maths.sum(s);
        PrintUtils.print(total);
    }

}
