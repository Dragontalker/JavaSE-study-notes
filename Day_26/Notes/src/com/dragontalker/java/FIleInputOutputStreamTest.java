package com.dragontalker.java;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 测试FileInputStream和 FileOutputStream的使用
 */

public class FIleInputOutputStreamTest {

    @Test
    public void testFIleInputStream() {
        FileInputStream fis = null;
        try {
            //1. 造文件
            File file = new File("hello.txt");

            //2. 造流
            fis = new FileInputStream(file);

            //3. 读数据
            byte[] buffer = new byte[5];
            int len; //记录每次读取的字节的个数
            while((len = fis.read(buffer)) != -1) {

                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
