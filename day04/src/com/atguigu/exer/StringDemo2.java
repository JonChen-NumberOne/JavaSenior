package com.atguigu.exer;

/**
 * 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abfcdeg”反 转为”abfedcg”
 * 方式一：使用char[]
 * 方式二：String拼接
 * 方式三：使用StringBuffer/StringBuilder优化方式二
 * @author Jon Chen
 * @create 2020-11-26 21:26
 */
public class StringDemo2 {
    public static String fanzhuanMethod(String str,int m,int n){
        char[] a = str.toCharArray();
        char temp = 0;
        for (int i = m; i <= (m+n)/2; i++) {
            temp = a[i];
            a[i] = a[m+n-i];
            a[m+n-i] = temp;
        }
        String newStr = new String(a);
        return newStr;
    }

    /**
     * 方式一：使用char[]
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public String reverse(String str,int startIndex,int endIndex){
        char[] a = str.toCharArray();
        for (int i = startIndex, j = endIndex; i< j ; i++,j--) {
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return new String(a);
    }

    /**
     *方式二：String拼接
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public String reverse1(String str,int startIndex,int endIndex){
        if(str != null){
            String newStr = str.substring(0,startIndex);
            for (int i = endIndex; i >= startIndex  ; i--) {
                newStr += i;
            }
            newStr += str.substring(endIndex+1,str.length());
            return newStr;
        }
        return null;
    }

    /**
     * 使用StringBuffer/StringBuilder优化方式二
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public String reverse2(String str,int startIndex,int endIndex){
        if(str != null){
            StringBuilder stringBuilder = new StringBuilder(str.length());
            stringBuilder.append(str.substring(0,startIndex));
            for (int i = endIndex; i >= startIndex; i--) {
                stringBuilder.append(str.charAt(i));
            }
            stringBuilder.append(str.substring(endIndex+1,str.length()));
            return stringBuilder.toString();
        }
        return null;

    }
    public static void main(String[] args) {
        StringDemo2 test = new StringDemo2();
        String str = test.reverse2("abfcdeg",3,5);
        System.out.println(str);
    }
}
