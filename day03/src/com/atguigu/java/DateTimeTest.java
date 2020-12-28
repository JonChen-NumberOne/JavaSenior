package com.atguigu.java;

import org.junit.Test;

import java.util.Date;

/**
 * @author Jon Chen
 * @create 2020-11-25 21:13
 */
public class DateTimeTest {

    @Test
    public void test2() {
        Date date1 = new Date();
        System.out.println(date1.toString());

        System.out.println(date1.getTime());//1606315742502

        Date date2 = new Date(1606315742502L);
        System.out.println(date2.toString());

        java.sql.Date date3 = new java.sql.Date(35235325345L);
        System.out.println(date3);

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
//        Date date4 = new java.sql.Date(2343243242323L);
//        java.sql.Date date5 = (java.sql.Date) date4;
        //情况二：
        Date date6 = new Date();
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
    }

    @Test
    public void test1() {
        long time = System.currentTimeMillis();

        System.out.println(time);
    }
}
