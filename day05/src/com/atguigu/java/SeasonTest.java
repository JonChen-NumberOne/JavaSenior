package com.atguigu.java;

/**
 * @author Jon Chen
 * @create 2020-11-30 19:26
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        System.out.println(spring);
    }
}

//自定义枚举类
class Season {
    //1声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasinDesc;

    //2私有化类的构造器，并给对象属性赋值
    private Season(String seasonName, String seasinDesc) {
        this.seasonName = seasonName;
        this.seasinDesc = seasinDesc;
    }

    //提供当前枚举类的多个对象：public static final的
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "寒风凛凛");

    //4其它诉求1：获取枚举对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasinDesc() {
        return seasinDesc;
    }

    //4其他诉求1：提供toString()
    @Override
    public String toString() {
        return "Season{" + "seasonName='" + seasonName + '\'' + ", seasonDesc='" + seasinDesc + "\'}";
    }
}