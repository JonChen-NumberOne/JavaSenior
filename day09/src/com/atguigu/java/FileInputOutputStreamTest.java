package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author Jon Chen
 * @create 2020-12-04 20:06
 */
public class FileInputOutputStreamTest {
    @Test
    public void testFileInputStream() {
        FileInputStream fi = null;
        try {
            //1. 造文件
            File file = new File("hello.txt");

            //2.造流
            fi = new FileInputStream(file);

            //3.读数据
            byte[] buffer = new byte[5];
            int len;
            while ((len = fi.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源
            if (fi != null)
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情2.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    //指定路径下文件的复制
    public void copyFile(String srcPath, String destPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();

//        String srcPath = "E:\\Desktop\\i1.avi";
//        String destPath = "E:\\Desktop\\i2.avi";

        String srcPath = "hello.txt";
        String destPath = "hello3.txt";

        copyFile(srcPath, destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制花费的时间为：" + (end - start));
    }

}
