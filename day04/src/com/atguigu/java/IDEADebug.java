package com.atguigu.java;

import org.junit.Test;

/**
 * @author Jon Chen
 * @create 2020-11-26 19:39
 */
public class IDEADebug {

    @Test
    public void test1(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);

        System.out.println(sb.length());

        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);
    }

}
