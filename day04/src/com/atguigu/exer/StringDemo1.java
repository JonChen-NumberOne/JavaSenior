package com.atguigu.exer;

/**
 * @author Jon Chen
 * @create 2020-11-26 21:25
 */
public class StringDemo1 {
    public String trimTest(String str) {
        char[] c = str.toCharArray();
        String str1 = str;
        int val = str.length();
        for (int i = 0; i < c.length; i++) {
            if (str.startsWith(" ")) {
                str1 = str1.substring(i);
            }
            if (str.endsWith(" ")) {
                str1 = str1.substring(0,val);
                val--;
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        StringDemo1 test = new StringDemo1();
        String str = "  shj t0 ";
        String str1 = test.trimTest(str);
        System.out.println("------"+str+"--------");
    }
}
