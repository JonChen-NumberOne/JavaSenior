package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author Jon Chen
 * @create 2020-11-25 21:13
 */
public class StringTest1 {

    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abcd123中国";
        byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码
        System.out.println(Arrays.toString(bytes));

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));

        System.out.println("*******************");

        String str2 = new String(bytes);//使用默认的字符集，进行解码
        System.out.println(str2);

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码。原因：编码集和解码集不一致

        String str4 = new String(gbks,"gbk");
        System.out.println(str4);//没有出现乱码。原因：编码集和解码集一致
    }

    @Test
    public void test2() {
        String str1 = "abc123";
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }


    @Test
    public void test1() {
        String str1 = "123";
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);
        String str3 = num + "";

        System.out.println(str1 == str3);
    }
}
