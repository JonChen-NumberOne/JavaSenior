package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Jon Chen
 * @create 2020-12-05 19:57
 */
public class RandomAccessFileTest {
    @Test
    public void test1() {

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("爱情与友情.jpg"), "r");
            raf2 = new RandomAccessFile(new File("爱情与友情1.jpg"), "rw");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                raf2.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null)
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (raf2 != null)
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    /*
  使用RandomAccessFile实现数据的插入效果
   */
    @Test
    public void test2() {
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile("hello.txt", "rw");

            raf1.seek(3);//将指针调到角标为3的位置
//保存指针3后面的所有数据到StringBuilder中
            StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
            byte[] buffer = new byte[20];
            int len;
            while ((len = raf1.read(buffer)) != -1) {
                builder.append(new String(buffer, 0, len));
            }
            //调回指针，写入“xyz”
            raf1.seek(3);
            raf1.write("xyz".getBytes());

            //将StringBuilder中的数据写入到文件中
            raf1.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null)
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }
}
