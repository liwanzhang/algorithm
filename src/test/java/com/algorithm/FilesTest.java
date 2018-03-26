package com.algorithm;

import com.algorithm.file.Files;
import org.junit.Test;

import java.io.IOException;

/**
 * @author zhangwanli
 * @description
 * @date 2018-03-26 上午11:36
 */
public class FilesTest {

    @Test
    public void readfileTest() {
        String filepath = "/Users/dmall/logs";
        try {
            Files.readfile(filepath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
