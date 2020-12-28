package com.atguigu.java;

import org.junit.Test;

import java.io.*;

/**
 * @author Jon Chen
 * @create 2020-12-04 20:05
 */
public class BufferedTest {
    @Test
    public void BufferedStreamTest() {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情3.jpg");

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bi = new BufferedInputStream(fis);
            bo = new BufferedOutputStream(fos);

            byte[] buffer = new byte[10];
            int len;
            while ((len = bi.read(buffer)) != -1) {
                bo.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bi != null)
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bo != null)
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public void copyFileWithBuffered(String srcPath, String destPath) {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bi = new BufferedInputStream(fis);
            bo = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = bi.read(buffer)) != -1) {
                bo.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bi != null)
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (bo != null)
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    @Test
    public void testCopyFileWithBuffered() {
        long start = System.currentTimeMillis();

        String srcPath = "E:\\Desktop\\i1.avi";
        String destPath = "E:\\Desktop\\i2.avi";

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为：" + (end - start));

    }

    @Test
    public void testBufferedReaderBufferedWriter() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));

            //方式一
            //方式一：使用char[]数组
//            char[] cbuf = new char[1024];
//            int len;
//            while((len = br.read(cbuf)) != -1){
//                bw.write(cbuf,0,len);
//                bw.flush();
//            }
            //方式二：使用String
            String data;
            while ((data = br.readLine()) != null) {
                //方式一
//                            bw.write(data + "\n");
                //方式二
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null)
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (br != null)
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }


    }
}
