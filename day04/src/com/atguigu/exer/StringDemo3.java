package com.atguigu.exer;

/**
 * 获取一个字符串在另一个字符串中出现的次数。 比如：获取“ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 * @author Jon Chen
 * @create 2020-11-26 21:26
 */
public class StringDemo3 {
    public int seekMethod(String str1,String str2){
        if(str1.length() >= str2.length()){
            int num = 0;
            int index = 0;
            while ((index = str1.indexOf(str2, index)) != -1){
                index++;
                num++;
            }
            return num;
        }
        return 0;
    }

    public static void main(String[] args) {
        StringDemo3 test = new StringDemo3();
        String str1 = "abkkcadkabkebfkabkskab";
        int num = test.seekMethod(str1,"ab");
        System.out.println(num);
    }
}
