package com.atguigu.java;

import org.junit.Test;

/**
 * @author Jon Chen
 * @create 2020-11-25 21:13
 */
public class StringTest {
    public void test4() {
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3);

        final String s4 = "javaEE";
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5);
    }


    @Test
    private void teat2() {
        String s1 = "javaEE";
        String s2 = "javaEE";

        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println("******************");
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);

        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name == p2.name);

        p1.name = "Jerry";
        System.out.println(p2.name);
    }


    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";
        s1 = "hello";

        System.out.println(s1 == s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("********************");
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
        System.out.println(s2);
        System.out.println("******************");
        String s4 = "abc";

        String s5 = s4.replace('a', 'm');
        System.out.println(s4);//abc
        System.out.println(s5);//mbc

    }
}
