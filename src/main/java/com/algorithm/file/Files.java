package com.algorithm.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author zhangwanli
 * @description
 * @date 2018-03-26 下午1:52
 */
public class Files {

    /**
     * 读取某个文件夹下的所有文件
     */
    public static boolean readfile(String filepath) throws IOException {
        try {
            File file = new File(filepath);
            if (file.isDirectory()) {
                System.out.println("文件夹");
                System.out.println("path=" + file.getPath());
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    readfile(filepath + "/" + filelist[i]);
                }
            } else {
                System.out.println("文件");
                System.out.println("path=" + file.getPath());
            }
        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }


}
