package com.atguigu.exer;

/**
 * 获取两个字符串中最大相同子串。比如：
 * str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
 * 提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * @author Jon Chen
 * @create 2020-11-29 15:43
 */
public class StringDemo4 {
    /**
     * 不考虑有两个字符串
     * @param str1
     * @param str2
     * @return
     */
    public String seekString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxString = (str1.length() >= str2.length()) ? str1 : str2;
            String minString = (str1.length() < str2.length()) ? str1 : str2;
            int length = minString.length();
            for (int i = 0; i < length; i++) {
                for (int m = 0, n = length - i;n <= length ; m++, n++) {
                    String newStr = minString.substring(m,n);
                    if(maxString.indexOf(newStr) != -1){
                        return newStr;
                    }
                }
            }
        }
        return null;
    }

    /**
     *返回String[]
     * @param str1
     * @param str2
     * @return
     */
    public String[] getMaxSameString1(String str1, String str2) {
        return null;
    }

    public static void main(String[] args) {
        StringDemo4 test = new StringDemo4();
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        System.out.println(test.seekString(str1, str2));
    }
}
